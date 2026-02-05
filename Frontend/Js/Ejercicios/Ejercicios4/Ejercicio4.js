//EJERCICIO 1
let inputGastosAlojamiento = document.getElementById("inputGastosAlojamiento");
let inputGastosAlimentacion = document.getElementById("inputGastosAlimentacion");
let inputGastosEntretenimiento = document.getElementById("inputGastosEntretenimiento");
let botonGastos1 = document.getElementById("botonGastos1");
let costoTotal1 = document.getElementById("costoTotal1");

//EJERCICIO 2
let edadPerro = document.getElementById("edadPerro");
let pEdadPerro = document.getElementById("pEdadPerro");


//EJERCICIO 3
let peso = document.getElementById("peso");
let altura = document.getElementById("altura");
let pIMC = document.getElementById("pIMC");

//EJERCICIO 1
function calcularCostos1()
{
    if (
        inputGastosAlimentacion != "" && 
        inputGastosAlojamiento.value != "" && 
        inputGastosEntretenimiento.value != ""
    ) {
        let total =  Number(inputGastosAlimentacion.value) + Number(inputGastosAlojamiento.value) + Number(inputGastosEntretenimiento.value);
        costoTotal1.innerHTML = total + "$";
    } else {
        alert("rellene los campos por favor!!")
    }
}
//EJERCICIO 2
function calcularEdadPerro()
{
    if (edadPerro != "") {
        let edadHumano = Number(edadPerro.value) * 7;
        pEdadPerro.innerHTML= edadHumano;
    } else {
        alert("INTRODUZCA EDAD DE TU PERRO!!")
    }
}

//EJERCICIO 3
function calcularIMC()
{
    let pesoFloat = parseFloat(peso.value);
    let alturaFloat = parseFloat(altura.value);
    let IMC = pesoFloat / (alturaFloat ** 2);
    pIMC.innerHTML =  IMC;

    
}