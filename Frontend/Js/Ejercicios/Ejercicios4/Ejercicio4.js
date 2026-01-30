//EJERCICIO 1
let inputGastosAlojamiento = document.getElementById("inputGastosAlojamiento");
let inputGastosAlimentacion = document.getElementById("inputGastosAlimentacion");
let inputGastosEntretenimiento = document.getElementById("inputGastosEntretenimiento");
let botonGastos1 = document.getElementById("botonGastos1");
let costoTotal1 = document.getElementById("costoTotal1");
//EJERCICIO 2
let edadPerro = document.getElementById("edadPerro").value;
let pEdadPerro = document.getElementById("pEdadPerro");

//EJERCICIO 1
function calcularCostos1()
{
    if (inputGastosAlimentacion != "" && 
        inputGastosAlojamiento.value != "" && 
        inputGastosEntretenimiento.value != "") {
        costoTotal1.innerHTML =  inputGastosAlimentacion.value + inputGastosAlojamiento.value + inputGastosEntretenimiento.value;
    } else {
        alert("rellene los campos por favor!!")
    }
}
//EJERCICIO 2
function calcularEdadPerro()
{
    if (edadPerro != "") {
        let edadHumano = edadPerro.value * 7;
        pEdadPerro.innerHTML= edadHumano;
    } else {
        alert("INTRODUZCA EDAD DE TU PERRO!!")
    }
}

