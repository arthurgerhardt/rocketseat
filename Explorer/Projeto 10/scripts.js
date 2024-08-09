// Throw 

function sayMyName(name = '') {
    if (name === '') {
        throw 'Nome obrigatório'
    }
    console.log(name)
}

// Try...catch
try {
    sayMyName('Arthur')
} catch (e) {
    console.log(e)
}
console.log('após a função ser executada')