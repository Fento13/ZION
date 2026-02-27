/*
Solicita al usuario que ingrese los gastos estimados para cada categoría.
Calcula el coste total sumando todos los gastos.
Muestra el coste total al usuario
*/

let input = prompt("Introduce el gasto estimado para cada categoría, separado por comas (por ejemplo: 100, 200, 50)");
let gastos = input.split(",").map(Number);
let costeTotal = gastos.reduce((total, gastos) => total + gastos, 0);
alert("El coste total es: " + costeTotal);

/*
Solicita al usuario que indique la edad de su perro en años.
Calcula la edad del perro en años humanos multiplicando la edad del perro por 7.
Muestra la edad del perro en años humanos al usuario.
Ejemplo de entrada: Edad del perro: 5 años.
Salida esperada: La edad del perro en años humanos es 35 años
*/

let edadPerro = prompt("Introduce la edad de tu perro en años:");
let edadHumana = edadPerro * 7;
alert("La edad de tu perro en años humanos es: " + edadHumana + " años");

/*
    Solicita al usuario que inserte su peso en kilogramos y su altura en metros.
    Calcula el IMC dividiendo el peso entre la altura al cuadrado.
    Muestra el IMC calculado al usuario y su clasificación según la tabla de IMC.
    Ejemplo de entrada: Peso: 70kg, Altura: 1.75m.
    Salida esperada: IMC: 22.86, Clasificación: Normal.
 */

let peso = prompt("Introduce tu peso en kilogramos:");
let altura = prompt("Introduce tu altura en metros:");
let imc = peso / (altura * altura);
let clasificacion;

if (imc < 16.5) {
    clasificacion = "Infrapeso";
} else if (imc < 18.5) {
    clasificacion = "Bajo peso";
} else if (imc < 25) {
    clasificacion = "Normal";
} else if (imc < 30) {
    clasificacion = "Sobrepeso";
} else {
    clasificacion = "Obesidad";
}

alert("Tu IMC es: " + imc.toFixed(2) + ", Clasificación: " + clasificacion);s