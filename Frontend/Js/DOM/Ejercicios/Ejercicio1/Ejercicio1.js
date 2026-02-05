/*reciba un texto

devuelva el texto invertido

y otra que lo muestre en un <p>*/
function Ejercicio1(texto) {
    let textoAlReves = "";
    for (let index = texto.length; index > 0; index--) {
        let letra = texto.charAt(index);
        textoAlReves += letra;
    }
}

function mostrarTexto(){
    
}