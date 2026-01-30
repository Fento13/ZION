let input1 = document.getElementById("input");
let parrafo1 = document.getElementById("parrafo");
let pError = document.getElementById("pError");
let input2 = document.getElementById("input2");
let parrafo2 = document.getElementById("parrafo2");
let botonTema = document.getElementById("botonTema");
let temaClaro = true;

function actualizar(){
    if (input1.value) {
        parrafo1.innerHTML = input1.value.toUpperCase();
        alert(parrafo1.innerHTML);
        pError.innerText = "";
    } else {
        pError.innerHTML = "ERROR:cadena vacia detectada";
    }
}

function inputNuevo(){
    parrafo2.innerHTML = "";

    if (parrafo2.value) {
    for (let index = 0; index < input2.value.length; index++) {
        if ((index % 2) === 0) {
        let letra = input2.value.toUpperCase;
        parrafo2.innerHTML += letra.charAt(i);
        } else {
        parrafo2.innerHTML += letra.toLowerCase().charAt(i);
        }
    }
    }
    parrafo2.value ="";
}

function cambiarTema() {
    if (temaClaro) {
        botonTema.style.color = "black";
        body.style.backgroundColor = "white";
        temaClaro = false;
    } else {
        botonTema.style.color = "white";
        body.style.backgroundColor = "black";
        temaClaro = true;
    }
}