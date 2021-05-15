

const sendFilters = () => {
    const fields = ['sort', 'activeStatus', 'filter', 'pageLimit', 'pageOffset']
    const form = document.querySelector('#select_filters_form')
    let url = '/accounts/list?'
    const params = form.elements;
    for(let i = 0; i < params.length; i++) {
        if (params[i].value && fields.includes(params[i].getAttribute('name'))){
            if (url.endsWith('?')){
                url = url + params[i].getAttribute('name') + '=' + params[i].value
            }
            else {
                url = url + '&' + params[i].getAttribute('name') + '=' + params[i].value
            }
        }
    }
    if (url.endsWith('?')){
        url = url.replace('?', '')
    }

    if (url.endsWith('?'))
        url.replace('?', '')

    const request = new Request(url,{
        method: 'GET'
    })
    fetch(request)
        .then(result => {
            return result.json()
        })
        .then(data => {
            console.log(data)
            console.log(JSON.stringify(data, undefined, 2))
            const json = document.createElement('div')
            renderjson.set_show_to_level(2)
            document.body.append(json)
                json.appendChild(renderjson(data))

        })
}

function addField(elem){
    // elem.style.display = 'none'
    // let minus = elem.nextElementSibling
    // minus.style.display = 'block'
    let field = document.querySelector('.sorting');
    const clone = field.cloneNode(true);
    field.after(clone);
    // clone.querySelector('i').first.style.display = 'block'
    // clone.querySelector('i').second.style.display = 'none'
}
function removeField(elem){
    elem.parentElement.remove();
}

const setOrder = el => {
    let column = el.previousElementSibling
    console.log(column)
    console.log(el)
    const value = el.value
    console.log(value)
    if (value === 'DESC'){
        column.value = '-' + column.value
        column.innerText = column.value
    }
}

let sort = document.querySelectorAll('select[name = "sort"]')
for (let i = 0; i < sort.length; i++) {
    if (sort[i].previousElementSibling.value === 'DESC') {
        sort[i].value = '-' + sort[i].previousElementSibling.previousElementSibling.value
        console.log(sort[i].value)
    } else {
        sort[i].value = sort[i].previousElementSibling.previousElementSibling.value
        console.log(sort[i].value)
    }
}