// Función para eliminar el li padre del botón
function eliminarElemento(button) {
    let lista = document.getElementById("lista");
    let li = button.parentElement;
    if (lista.contains(li)) {
        lista.removeChild(li);
    } else {
        alert("No se puede eliminar este elemento.");
    }
}

//cuando cargue el dom, se ejecuta el resto, para evitar errores de elementos no encontrados
document.addEventListener("DOMContentLoaded", function() {

let lista = document.getElementById("lista");
let botones = document.getElementsByClassName("boton");

// Agregar event listeners a cada botón
for (let i = 0; i < botones.length; i++) {
    botones[i].addEventListener("click", function() {
        eliminarElemento(this);
    });
}

let formulario = document.getElementById("formulario");
let nombreInput = document.getElementById("nombre");
let edadInput = document.getElementById("edad");
let ciudadInput = document.getElementById("ciudad");
let botonAgregar = document.getElementById("botonAgregar");


//Ejercicicio 8
function agregarElemento() {
    let nombre = nombreInput.value;
    let edad = edadInput.value;
    let ciudad = ciudadInput.value;

    if(nombre && edad && ciudad) {
        let nuevoElemento = document.createElement("tr");
        nuevoElemento.innerHTML = `
            <td>${nombre}</td>
            <td>${edad}</td>
            <td>${ciudad}</td>
            `;
        document.getElementById("tabla-cuerpo").appendChild(nuevoElemento);
        nombreInput.value = "";
        edadInput.value = "";
        ciudadInput.value = "";
    } else {
        alert("Por favor, completa todos los campos.");
    }
}

botonAgregar.addEventListener("click", agregarElemento);
});