/*
    Dada uma lista de pacientes, descubra o IMC de cada paciente e imprima.

    "Paciente X possui o IMC de: Y"

    Onde X é o nome do paciente e Y o IMC desse paciente
    Crie a função para fazer cálculo de IMC
*/
/* peso / (altura * altura) */
const patients = [
    {
        name: 'John Doe',
        weight: 85,
        height: 175,
    },
    {
        name: 'Jane Smith',
        weight: 70,
        height: 165,
    },
    {
        name: 'Alice Johnson',
        weight: 65,
        height: 170,
    },
]

function imc(weight, height) {
    return (weight / ((height / 100) ** 2)).toFixed(2)
}
function printimc(patient) {
    return(`
        Paciente ${patient.name} possui o IMC de ${imc(patient.weight, patient.height)}
        `)
}

for (let patient of patients) {
    let imcmsg = printimc(patient)
    alert(imcmsg)
}