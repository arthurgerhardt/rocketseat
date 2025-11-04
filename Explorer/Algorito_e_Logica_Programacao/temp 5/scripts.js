/*
    Solicitar  o nome do aluno e as 3 notas
    do bimestre, calcular a média daquele aluno.

    A média positiva deverá ser maior que 6.
    
    Se o aluno passou no bimestre, dar os parabéns.

    Se o aluno não passou no bimestre,
    motivar o aluno a dar o seu melhor na prova
    de recuperacao.

    Em ambos os casos, mostre uma mensagem com o nome do aluno e a nota.

*/

let student = prompt("Digite o nome do(a) aluno(a)? ")
let n1 = prompt("Qual a nota da primeira prova? ")
let n2 = prompt("Qual a nota da segunda prova? ")
let n3 = prompt("Qual a nota da terceira prova?  ")

/* Fazer a média */
let average = (Number(n1) + Number(n2)  + Number(n3)) / 3
let result = average > 6
average = average.toFixed(2)
/* Mostrar resultados */

if (result) {
    alert("Parabéns! " + student + "Você passou no bimestre. A sua média é: " + average)
} else if (average < 3) {
    alert("Reprovado.")
} else {
    alert(student + "." +  " Estude para a sua prova de recuperação. A sua média é de: " + average)
}
