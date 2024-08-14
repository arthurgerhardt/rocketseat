// Estrutura de repeticao
// For in

let person = {
    name: 'John',
    age: 30,
    weight: 75.5,
    city: 'New York'
};  

for (let property in person) {
    console.log(property);
    console.log(person[property]);
}