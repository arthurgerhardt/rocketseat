// Manipulacao de strings e números

// Contar quantos caracteres tem uma palavra e quantos dígitos tem um número
/*
let word = "Paralelepipedo"
console.log(word.length)

let number = 12345
console.log(String(number).length)
*/

/*
// Transformar um número quebrado com duas casas decimais e trocar o ponto por vírgula.
let number = 2017.4587
console.log(number.toFixed(2).replace(".", ","))

// Transformar letras em maiúsculas e minúsculas
let word = "Programar é muito bacana!"
console.log(word.toUpperCase())
console.log(word.toLowerCase())
*/

// Manipulando Strings e Arrays

// Separe um texto que contém espacos, em um novo array onde cada texto é uma posicao no array. 
//Depois disso transforme o array em um texto e onde eram espacos, coloque _

let phrase = "Eu quero viver o amor!"
let myArraey = phrase.split(" ")
console.log(myArraey)
let phraseWithUnderscore = myArraey.join("_")
console.log(phraseWithUnderscore)
