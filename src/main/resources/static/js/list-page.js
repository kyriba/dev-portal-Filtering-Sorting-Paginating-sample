const sendFilters = () => {

    let curl = new URL('http://localhost:' + port + '/list/get')
    curl.search = uri.search
    sendRequestToGetAccounts(curl)
}
const sendRequestToGetAccounts = (url) => {
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
            createPagination(url, data)
            createJsonElement(data)
        })
        .catch(err => {
            console.log(err)
            createJsonElement(JSON.parse(err.message))
        })
}

const createJsonElement = data => {
    if (!document.querySelector('#responseList')) {
        const main = document.querySelector('.container')
        const json = document.createElement('div')
        main.appendChild(json)
        json.id = 'responseList'
        renderjson.set_show_to_level('3')
        renderjson.set_collapse_msg(() => '')
        json.appendChild(renderjson(data))
    } else {
        document.querySelector('#responseList').firstChild.replaceWith(renderjson(data))
    }
}

const createPagination = (url, data) => {

    const pages = Math.ceil(data.metadata.numberOfTotalResults / data.metadata.pageLimit)
    const pageLimit = data.metadata.pageLimit
    const pageOffset = data.metadata.pageOffset

    uri.searchParams.set('page.offset', pageOffset)
    cURL.value = decodeURIComponent(uri)

    document.querySelector('#pageOffset').value = pageOffset

    let pagination = document.querySelector('#paginationList')
    if (!pagination) {
        const main = document.querySelector('.container')
        pagination = document.createElement('div')
        main.appendChild(pagination)
        pagination.id = 'paginationList'
    }
    pagination.innerHTML =
        '<nav aria-label="Page navigation">\n' +
        '  <ul class="pagination">\n' +
        '    <li id = "firstPage">\n' +
        '        <a aria-hidden="true">&laquo;</a>\n' +
        '    </li>\n' +
        '    <li id = "previousPage">\n' +
        '        <a aria-hidden="true">&lsaquo;</a>\n' +
        '    </li>\n' +
        '    <li>\n' +
        '        <a aria-hidden="true">\n' +
        '        <input id = "currentPage" aria-hidden="true">\n' +
        '       </a>\n' +
        '    </li>\n' +
        '    <li id = "nextPage">\n' +
        '        <a aria-hidden="true">&rsaquo;</a>\n' +
        '    </li>\n' +
        '    <li id = "lastPage">\n' +
        '        <a aria-hidden="true">&raquo;</a>\n' +
        '    </li>\n' +
        '<p id = "total-pages" style="color: #337ab7">Total pages </p>\n' +
        '  </ul>\n' +
        '</nav>'


    document.querySelector('#total-pages').textContent = document.querySelector('#total-pages').textContent + pages

    const prev = pagination.querySelector('#previousPage')
    const next = pagination.querySelector('#nextPage')

    let urlPrev = new URL(url)
    urlPrev.searchParams.set('page.offset', pageOffset - pageLimit)
    prev.onclick = () => {
        if (!prev.classList.contains('disable'))
            sendRequestToGetAccounts(urlPrev)
    }

    let urlNext = new URL(url)
    urlNext.searchParams.set('page.offset', pageOffset + pageLimit)
    next.onclick = () => {
        if (!next.classList.contains('disable'))
            sendRequestToGetAccounts(urlNext)
    }

    const first = pagination.querySelector('#firstPage')
    const last = pagination.querySelector('#lastPage')

    let urlFirst = new URL(url)
    urlFirst.searchParams.set('page.offset', 0)
    first.onclick = () => {
        if (!first.classList.contains('disable'))
            sendRequestToGetAccounts(urlFirst)
    }

    let urlLast = new URL(url)
    urlLast.searchParams.set('page.offset', pageLimit * (pages - 1))
    last.onclick = () => {
        if (!last.classList.contains('disable'))
            sendRequestToGetAccounts(urlLast)
    }

    let currentPage = document.querySelector('#currentPage')
    currentPage.value = pageOffset / pageLimit + 1
    let currentUrl = new URL(url)

    currentPage.onchange = () => {
        if (currentPage.value <= 0){
            currentPage.value = 1
        }
        if (currentPage.value > pages) {
            currentPage.value = pages
        }
        currentUrl.searchParams.set('page.offset', pageLimit * (parseInt(currentPage.value) - 1))
        sendRequestToGetAccounts(currentUrl)
    }


    if (!data.metadata.links.prev) {
        prev.classList.add('disable')
        first.classList.add('disable')
    }

    if (!data.metadata.links.next) {
        next.classList.add('disable')
        last.classList.add('disable')
    }

    Array.from(document.querySelector('.pagination').querySelectorAll('a'))
        .map(x => {
            if (!x.parentElement.classList.contains('disable')) x.style.cursor = 'pointer'
            x.style.userSelect = 'none'
        })
}

const addField = (elem) => {
    elem.style.display = 'none'
    let minus = elem.previousElementSibling
    minus.style.display = 'inline'
    let field = document.querySelector('.sorting')
    const clone = field.cloneNode(true)
    clone.onchange = addToSortList(clone)
    const sorts = document.querySelectorAll('.sorting')
    const children = clone.querySelector('.sort_detail').children
    for (let i = 0; i < children.length; i++) {
        let k = children[i].id.replaceAll(/[a-zA-z_-]+/g, '')
        const l = parseInt(k, 10) + 1
        children[i].id = children[i].id.replaceAll(/[0-9]+/g, l)
    }
    sorts[sorts.length - 1].after(clone)
    clone.querySelector('i[class = "remove_sorting"]').style.display = 'inline'
    clone.querySelector('i[class = "add_sorting"]').style.display = 'inline'
    Array.from(clone.querySelectorAll('select'))
        .map(el => el.addEventListener('change', event => {
            addToSortList(event.target)
        }))
}

function removeField(elem) {
    let tr = elem.parentElement
    while (tr.tagName !== 'TR') {
        tr = tr.parentElement
    }
    const prev = tr.previousElementSibling
    if (document.querySelectorAll('.sorting').length > 1) {
        if (tr.querySelector('.add_sorting').style.display === 'inline') {
            prev.querySelector('.add_sorting').style.display = 'inline'
        }
        tr.remove()
    }
    if (document.querySelectorAll('.sorting').length === 1) {
        document.querySelectorAll('.sorting')[0]
            .querySelector('i[class = "remove_sorting"]').style.display = 'none'
    }
}


const addInputField = (el) => {
    const type = el.value
    const operator = el.nextElementSibling
    const input = operator.nextElementSibling
    const select = input.nextElementSibling
    operator.value = '=='
    if (enums && !enums.hasOwnProperty(type)) {
        select.hidden = true
        input.hidden = false
        input.setAttribute('placeholder', '')
        input.setAttribute('type', 'text')
        input.value = ''
        Array.from(operator.children)
            .filter(op => op.textContent !== 'isNull')
            .map(op => {
                op.hidden = false
                console.log(op.textContent)
            })
        Array.from(operator.children)
            .filter(op => op.textContent === 'isNull')
            .map(op => op.hidden = true)
        if (type.toLowerCase().includes('date')) {
            input.setAttribute('type', 'date')
            let oper = ['Equals', '<', '>', '≤', '≥', 'isNull']
            Array.from(operator.children).filter(op => !oper.includes(op.textContent))
                .map(op => op.hidden = true)
            Array.from(operator.children).filter(op => oper.includes(op.textContent))
                .map(op => op.hidden = false)

        }
        if (type.includes('uuid')) {
            input.setAttribute('placeholder', 'xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx')
            let uuidOp = ['Equals', 'Doesn\'t equal', 'Starts with', 'Ends with', 'Contains', 'In List', 'Isn\'t in List']
            Array.from(operator.children).filter(op => !uuidOp.includes(op.textContent))
                .map(op => op.hidden = true)
        }
    }

    if (enums && enums.hasOwnProperty(type)) {
        input.hidden = true
        select.hidden = false
        select.innerHTML = ''
        Array.from(operator.children).filter(op => op.textContent !== 'Equals')
            .map(op => op.hidden = true)
        let tr = el
        while (tr.tagName !== 'TR') {
            tr = tr.parentElement
        }
        let types = enums[type]
        select.value = select.selectedOptions.innerText
        for (let i = 0; i < types.length; i++) {
            const option = document.createElement('option')
            option.innerText = types[i]
            select.appendChild(option)

        }
    }

}

const showList = (el) => {
    let input = el.nextElementSibling
    input.value = ''
    if (el.value === '=in=' || el.value === '=out=') {
        input.value = '()'
    }
    input.hidden = false
    if (el.value === '==null') {
        input.hidden = true
    }
}

const addFilters = (el) => {
    if (el.value !== "Add") {
        let index = parseInt(el.id.replaceAll(/[a-zA-z_-]+/g, ''))
        const btns = document.querySelectorAll('select[name = "operation"]')
        let arr = []
        for (let i = 0; i < btns.length; i++) {
            arr[i] = parseInt(btns[i].id.replaceAll(/[a-zA-z_-]+/g, ''))
        }
        if (!arr.includes(index + 1)) {
            let tr = el.parentElement
            while (tr.tagName !== 'TR') {
                tr = tr.parentElement
            }
            const clone = tr.cloneNode(true)
            const children = clone.querySelector('.filter_detail').children
            for (let i = 0; i < children.length; i++) {
                let k = children[i].id.replaceAll(/[a-zA-z_-]+/g, '')
                const l = parseInt(k, 10) + 1
                children[i].id = children[i].id.replaceAll(/[0-9]+/g, l.toString())
                if (children[i].id.startsWith('addInput')) {
                    children[i].value = ''
                    children[i].hidden = false
                    children[i].setAttribute('placeholder', '')
                    children[i].setAttribute('type', 'text')
                }
                if (children[i].id.startsWith('addSelect')) {
                    children[i].hidden = true
                    children[i].innerHTML = ''
                    children[i].value = ''
                }
            }
            tr.after(clone)
            Array.from(clone.querySelector('.filter_detail').children).forEach(e => {
                    console.log(e)
                    e.addEventListener(e.tagName === 'SELECT' ? 'change' : e.tagName === 'INPUT' ? 'input' : '', event => {

                        if (e.id.startsWith('filter_column'))
                            addInputField(event.target)
                        addToQueryString(event.target)
                    })
                }
            )
        }
    }

    const filters = document.querySelectorAll('.filtering')
    if (filters.length !== 1) {
        for (let i = 0; i < filters.length; i++) {
            filters[i].querySelector('i[class = "remove_filter"]').style.display = 'inline'
        }
    }
}

const removeFilter = el => {
    let tr = el.parentElement
    while (tr.tagName !== 'TR') {
        tr = tr.parentElement
    }
    if (document.querySelectorAll('.filtering').length > 1) {
        tr.remove()
    }
    if (document.querySelectorAll('.filtering').length === 1) {
        document.querySelectorAll('.filtering')[0]
            .querySelector('i[class = "remove_filter"]').style.display = 'none'
    }

    Array.from(document.querySelectorAll('.filtering')[document.querySelectorAll('.filtering').length - 1]
        .querySelectorAll('select'))
        .filter(e => e.id.startsWith('addFiltersBtn'))
        .map(e => e.value = 'Add')


    addToQueryString()
}

const combineFilters = () => {
    let rsql = ''
    const fil = document.querySelectorAll('.filter_detail')
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

            if (fields[j].id.startsWith('addInput') && !arr.includes(fields[j].previousElementSibling.value) && fields[j].hidden === false) {
                rsql = rsql + fields[j].value
            }

            if (fields[j].id.startsWith('addSelect') && fields[j].hidden === false) {
                rsql = rsql + fields[j].value
            }


            if (fields[j].id.startsWith('addFiltersBtn') && fields[j].value !== 'Add') {
                rsql = rsql + ' ' + fields[j].value.toLowerCase() + ' '

            }
        }
    }
    if (rsql.endsWith(' and ')) {
        rsql = rsql.slice(0, rsql.length - 4)
    }
    if (rsql.endsWith(' or ')) {
        rsql = rsql.slice(0, rsql.length - 3)
    }
    return rsql
}

const resetForm = () => {
    location.reload()
}

const popups = document.querySelectorAll('.popup')

for (let i = 0; i < popups.length; i++) {
    popups[i].onmouseover = (el) => {
        el.target.classList.add('show')
    }
    popups[i].onmouseout = (el) => {
        el.target.classList.remove('show')
    }
}

const copyCurl = document.querySelector('#copyCurl')
    copyCurl.onclick = el => {

   const copyText = document.querySelector('#basic-url')
        copyText.disabled = false

    copyText.select()


    document.execCommand("copy")
        copyText.disabled = true
        window.getSelection().removeAllRanges();

    el.target.style.display = 'none'
    el.target.nextElementSibling.hidden = false

    setTimeout(() => {
        el.target.style.display = 'block'
        el.target.nextElementSibling.hidden = true
    }, 1000)

}
