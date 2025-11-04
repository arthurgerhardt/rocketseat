 // Função para calcular o IMC
 function calcularIMC(peso, altura) {
    return peso / (altura * altura);
}

// Função para exibir o IMC
function exibirIMC() {
    // Criação de um array contendo o objeto com os dados
    const pessoa = [{
        nome: "Arthur",
        peso: 70, // Peso em kg
        altura: 1.75 // Altura em metros
    }];
    
    // Acessando o primeiro (e único) objeto do array
    const { peso, altura } = pessoa[0];
    
    // Calculando o IMC
    const imc = calcularIMC(peso, altura);
    
    // Exibindo o resultado em um alerta
    alert(`Nome: ${pessoa[0].nome}\nPeso: ${peso} Kg\nAltura: ${altura} m\nIMC: ${imc.toFixed(2)}`);
}

// Executa a função quando a página é carregada
window.onload = exibirIMC;