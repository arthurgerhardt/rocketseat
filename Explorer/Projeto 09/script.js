//1. Declare um variável de nome weight
//let weight;
//2. Que tipo de dado é a variável acima?
//console.log(typeof weight);
//3. Declare uma variável e atribua valores para cada um dos dados
//let name = "Arthur";
//let age = 38;
//let stars = 4.5;
//let isSubscribed = true;
//4. A variável student abaixo é de que tipo de dados?
//let student = {
//  name: "Arthur",
//  age: 38,
 // stars: 4.8,
 // isSubscribed: true,
//}
//console.log(student);
//4.1 Atribua a ela as mesmas propriedades e valores do exercício 3

//4.2 Mostre no console as seguintes mensagens /* <name> de idade <age> pesa <weight> pelos valores de cada objeto */
let student = {
  name: 'Arthur',
  age: 38,
  weight: 71.5,
  isSubscribed: true,
}

console.log(`${student.name} de idade ${student.age} pesa ${student.weight} kg`);
//5. Declare uma variável do tipo array, de nome students e atribua nenhum valor, ou seja, somente um array vazio
let students = [];
//6. Reatribua o valor para a variável acima, colocando dentro dela o objeto student da questão 4. (Não copiar e colar o objeto, mas usar o objeto criado e inserir ele no Array)
students = [
  student,
] 
//console.log(students)
//7. Coloque no console o valor da posição zero do array acima
console.log(students[0])
//8. Crie um novo student e coloque ele na posição do Array students
const arthur = {
  name: 'Arthur',
  age: 38,
  weight: 71.5,
  isSubscribed: true,
}

students = [
  student,
  arthur,
]

console.log(students[1])
//9. Sem rodar o código responda qual é a resposta do código abaixo e por que? Após sua resposta, rode o código e veja se você acertou 

console.log(a) 
var a = 1
