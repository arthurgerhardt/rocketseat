import { Modal } from './modal.js';
import { AlertError } from "./alert-error.js"
import { notNumber, calculateIMC } from './utils.js'

// Variáveis - Variables
const form = document.querySelector('form')
const inputWeight = document.querySelector('#weight')
const inputHeight = document.querySelector('#height')

// 3 maneiras de criar e atribuir funcao a um evento
form.onsubmit = event => {
    event.preventDefault() // Previne o comportamento padrão do formulário (submit)
    const weight = inputWeight.value
    const height = inputHeight.value
    const showAlertError = notNumber(weight) || notNumber(height)
    if (showAlertError) {
        AlertError.open()
        return;
    }
    AlertError.close() // Fecha o alerta caso haja algum erro de validacao
    const result = calculateIMC(weight, height)
    const message = `Seu IMC é de ${result}`
    Modal.message.innerText = message
    Modal.open()
}

