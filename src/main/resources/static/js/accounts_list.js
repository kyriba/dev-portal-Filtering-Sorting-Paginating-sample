const sendFilters = () => {
    const fields = ['sort', 'activeStatus', 'filter', 'pageLimit', 'pageOffset']
    const form = document.querySelector('#select_filters_form')
    let url = '/accounts/list?'
    const params = form.elements;
    for (let i = 0; i < params.length; i++) {
        if (params[i].value && fields.includes(params[i].getAttribute('name'))) {
            if (url.endsWith('?')) {
                url = url + params[i].getAttribute('name') + '=' + params[i].value
            } else {
                url = url + '&' + params[i].getAttribute('name') + '=' + params[i].value
            }
        }
    }
    if (url.endsWith('?')) {
        url = url.replace('?', '')
    }

    if (url.endsWith('?'))
        url.replace('?', '')

    const request = new Request(url, {
        method: 'GET'
    })
    fetch(request)
        .then(response => {
            return response.json()
                .then((json) => {
                    if (!response.ok) {
                        const error = Object.assign({}, json, {
                            status: response.status,
                            statusText: response.statusText,
                        });

                        return Promise.reject(error);
                    }
                    return json;
                })
        })
        .then(data => {
           createJsonElement(data)
        })
        .catch(err => {
            createJsonElement(JSON.parse(err.message))
        })
}

const createJsonElement = data => {
    if (!document.querySelector('#responseList')) {
        const main = document.querySelector('.main')
        const json = document.createElement('div')
        json.id = 'responseList'
        renderjson.set_show_to_level('3')
        document.body.append(json)
        main.appendChild(json.appendChild(renderjson(data)))
    } else {
        document.querySelector('#responseList').firstChild.replaceWith(renderjson(data))
    }
}

function addField(elem) {
    // elem.style.display = 'none'
    // let minus = elem.nextElementSibling
    // minus.style.display = 'block'
    let field = document.querySelector('.sorting');
    const clone = field.cloneNode(true);
    field.after(clone);
    // clone.querySelector('i').first.style.display = 'block'
    // clone.querySelector('i').second.style.display = 'none'
}

function removeField(elem) {
    elem.parentElement.remove();
}

const setOrder = el => {
    let column = el.previousElementSibling
    const value = el.value
    if (value === 'DESC' && !column.value.startsWith('-')) {
        column.value = '-' + column.value
    } else if (value === 'ASC' && column.value.startsWith('-')) {
        column.value = column.value.replaceAll('-', '')
    }
}


const addInputField = (el) => {
    const numberFields = ['creationDate', 'updateDate', 'closingDate']
    const type = el.value
    const operator = el.nextElementSibling
    const input = el.nextElementSibling.nextElementSibling
    if (input.tagName === 'SELECT') {
        input.replaceWith(document.createElement('input'))
    }
    input.setAttribute('placeholder', '')
    input.setAttribute('type', 'text')
    Array.from(operator.children)
        .map(op => op.hidden = false)
    if (numberFields.includes(type)) {
        input.setAttribute('type', 'date')
        let oper = ['Equals', '<', '>', '≤', '≥']
        Array.from(operator.children).filter(op => !oper.includes(op.textContent))
            .map(op => op.hidden = true)
    }
    if (type.includes('uuid')) {
        input.setAttribute('placeholder', 'xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx')
        let uuidOp = ['Equals', 'Doesn\'t equal', 'Starts with', 'Ends with', 'Contains', 'In List', 'Isn\'t in List']
        Array.from(operator.children).filter(op => !uuidOp.includes(op.textContent))
            .map(op => op.hidden = true)
    }

    if (type === 'accountType'){
        Array.from(operator.children).filter(op => op.textContent !== 'Equals')
            .map(op => op.hidden = true)
        const select = document.createElement('select')
        select.id = 'addInput' + operator.id.replaceAll(/[a-zA-Z-_]/g, '')
        select.innerHTML = '<option>BANK_ACCOUNT</option>' +
            '<option>INTERCOMPANY_ACCOUNT</option>' +
            '<option>OTHER_ACCOUNT</option>' +
            '<option>SHARED_ACCOUNT</option>'
        operator.nextElementSibling.replaceWith(select)
    }

}

const addFilters = (el) => {
    const clone = el.parentElement.cloneNode(true)
    const children = clone.children
    for (let i = 0; i < children.length; i++) {
        let k = children[i].id.replaceAll(/[a-zA-z_-]+/g, '')
        const l = parseInt(k, 10) + 1
        children[i].id = children[i].id.replaceAll(/[0-9]+/g, l)
        if(children[i].id.startsWith('addInput')){
            if (children[i].tagName === 'SELECT') {
                children[i].replaceWith(document.createElement('input'))
            }
            children[i].setAttribute('placeholder', '')
            children[i].setAttribute('type', 'text')
        }
    }
    el.parentElement.after(clone)
}

const combineFilters = () => {
    const filter = document.querySelector('#filter')
    filter.value = ''
    let rsql = ''
    const fil = document.querySelector('#filter_details').children
    for (let i = 0; i < fil.length; i++) {
        const fields = fil[i].children
        for (let j = 0; j < fields.length; j++) {
            const arr = ['==ABC*', '==*ABC', '==*ABC*']
            if (fields[j].id.startsWith('filter_column')) {
                if (fields[j].value === '--') {
                    j = fields.length
                    break
                }
                rsql = rsql + fields[j].value
            }
            if (fields[j].id.startsWith('operation') && arr.includes(fields[j].value)) {
                rsql = rsql + fields[j].value.replaceAll(/ABC/gi, fields[j].nextElementSibling.value)

            } else if (fields[j].id.startsWith('operation')) {
                rsql = rsql + fields[j].value
            }

            if (fields[j].id.startsWith('addInput') && !arr.includes(fields[j].previousElementSibling.value)) {
                rsql = rsql + fields[j].value
            }

            if (fields[j].id.startsWith('addFiltersBtn') && fields[j].value !== 'Add') {
                rsql = rsql + ' ' + fields[j].value.toLowerCase() + ' '
            }
        }

    }
    if (rsql.endsWith('and ')) {
        rsql = rsql.slice(0, rsql.length - 4)
    }
    if (rsql.endsWith('or ')) {
        rsql = rsql.slice(0, rsql.length - 3)
    }
    filter.value = rsql
}