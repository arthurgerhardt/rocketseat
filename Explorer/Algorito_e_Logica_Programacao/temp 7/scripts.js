/*
    ** Jogo de adivinhação **

    Apresente ao usuário:
    "Adivinhe o número em que eu estou pensando? É entre 0 e 10."

    Crie uma lógica para gerar um número aleatório
    e verificar se o número digitado é o mesmo que o número aleatório gerado
    pelo sistema.

    Enquanto o usuário não adivinhar o número, mostrar a mensagem:
    "Erro, tente novamente:"

    Caso o usuário acerte o número, apresentar a mensagem:
    Parabéns! Você adivinhou o número em x tentativas.

    Substitua o x da mensagem pelo número de tentativas.
*/

let result = prompt("Adivinhe o número em que eu estou pensando? Está entre 0 e 10. ")
const randomNumber = Math.round(Math.random() * 10)
let xAttempts = 1

while(Number(result) != randomNumber) {
    result = prompt("Erro, tente novamente: ")
    xAttempts++
}

alert(`Parabéns! O número que eu pensei foi: ${randomNumber} e você adivinhou o número em ${xAttempts} tentativas.`)