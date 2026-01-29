let input1 = document.getElementById("input");
let parrafo1 = document.getElementById("parrafo");
let pError = document.getElementById("pError");
let input2 = document.getElementById("input2");
let parrafo2 = document.getElementById("parrafo2");
let botonTema = document.getElementById("botonTema");
let temaClaro = true;

function actualizar(){
    if (parrafo1.value.length > 0) {
        parrafo1.innerText = input1.value.toUpperCase;
        pError.innerText = "";
    } else {
        pError.innerText = "ERROR:cadena vacia detectada";
    }
}

function inputNuevo(){
    if (parrafo2.value.lengtth > 0) {
        let resultado = "";
    for (let index = 0; index < parrafo2.value.length; index++) {
        let letra = parrafo2.value[index];
        
        if ((index % 2) === 0) {
            resultado += letra.toUpperCase;
        } else {
            resultado += letra;
        }
    }
    }
    parrafo2.value ="";
}

function cambiarTema() {
    let temaOscuro = false;
    if (temaClaro) {
        botonTema.style.color = "black";
        document.style.backgroundColor = "white";
        temaOscuro = true;
        temaClaro = false;
    } else (temaOscuro){
        botonTema.style.color = "white";
        document.style.backgroundColor = "black";
        temaOscuro = false;
        temaClaro = true;
    }
}