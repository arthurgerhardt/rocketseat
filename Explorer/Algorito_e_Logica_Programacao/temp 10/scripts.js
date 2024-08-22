/*
    Crie uma lista de pacientes

    Cada paciente dentro da lista,  deverá conter
      - Nome
      - Idade
      - peso
      - altura

    Escreva uma lista contendo o nome dos pacientes
*/

const patients = [
    {
        name: 'John Doe',
        age: 25,
        weight: 85,
        height: 1.75,
    },
    {
        name: 'Jane Smith',
        age: 30,
        weight: 70,
        height: 1.65,
    },
    {
        name: 'Alice Johnson',
        age: 28,
        weight: 65,
        height: 1.70,
    },
]

let patientsNames = []
for (let patient of patients) {
    patientsNames.push(patient.name, patient.weight, patient.height, patient.age)
}

alert(patientsNames)