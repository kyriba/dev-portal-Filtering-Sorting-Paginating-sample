let uri = new URL(document.querySelector('#basic-url').value)

let cURL = document.querySelector('#basic-url')

const filter = document.querySelectorAll('.filter_detail')
const sort = document.querySelectorAll('.sort_detail')
const pageOffset = document.querySelector('#pageOffset')
const pageLimit = document.querySelector('#pageLimit')

for (let i = 0; i < filter.length; i++) {
    Array.from(filter[i].children).forEach(e => e.addEventListener(e.tagName === 'SELECT' ? 'change' : e.tagName === 'INPUT' ? 'input' : '', event => {
            if (e.id.startsWith('filter_column'))
                addInputField(event.target)
            addToQueryString(event.target)
        }
    ))
}


for (let i = 0; i < sort.length; i++) {
    Array.from(sort[i].children).forEach(e =>
        e.addEventListener('change', event => {
                if (event.target.id.startsWith('column_sort') || event.target.id.startsWith('asc')) {
                    addToSortList(event.target)
                }
            }
        ))
}

pageLimit.addEventListener('input', event => {
    uri.searchParams.set('page.limit', event.target.value)
    if (event.target.value === '') {
        uri.searchParams.set('page.limit', 100)
    }
    cURL.value = decodeURIComponent(uri)
})

pageOffset.addEventListener('input', event => {
    uri.searchParams.set('page.offset', event.target.value)
    if (event.target.value === '') {
        uri.searchParams.set('page.offset', 0)
    }
    cURL.value = decodeURIComponent(uri)
})

const addToQueryString = el => {
    const rsql = combineFilters()
    uri.searchParams.set('filter', rsql)
    if (rsql === '') {
        uri.searchParams.delete('filter')
    }
    cURL.value = decodeURIComponent(uri)
}

const addToSortList = el => {

    if (el.id.startsWith('column_sort') || el.id.startsWith('asc')) {
        if (el.id.startsWith('column_sort')) {
            if (el.nextElementSibling.value === 'ASC' && el.value.startsWith('-')) {
                el.value = el.value.slice(1)
            }
            if (el.nextElementSibling.value === 'DESC' && el.value.charAt(0) !== '-') {
                el.value = '-' + el.value
            }
        }

        if (el.id.startsWith('asc')) {
            if (el.value === 'ASC' && el.previousElementSibling.value.startsWith('-')) {
                el.previousElementSibling.value = el.previousElementSibling.value.slice(1)
            }
            if (el.value === 'DESC' && el.previousElementSibling.value.charAt(0) !== '-') {
                el.previousElementSibling.value = '-' + el.previousElementSibling.value
            }
        }

        let arr = []

        const sorts = document.querySelectorAll('.sort_detail')
        for (let i = 0; i < sorts.length; i++) {
            let children = sorts[i].children
            for (let j = 0; j < children.length; j++) {
                if (children[j].id.startsWith('column_sort')) {
                    if (children[j].value !== '') {
                        if (!arr.includes(children[j].value)) {
                            arr[i] = children[j].value
                        }
                    }
                }
            }
        }

        let string = arr.join(',')
        uri.searchParams.set('sort', string)
        if (string === '') {
            uri.searchParams.delete('sort')
        }
        cURL.value = decodeURIComponent(uri)
    }
}


