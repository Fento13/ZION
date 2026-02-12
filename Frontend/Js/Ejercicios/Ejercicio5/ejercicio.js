/*Ejercicio 1
Escribir el código de una función a la que se pasa como parámetro
un número entero y devuelve como resultado una cadena de texto
que indica si el número es par o impar. Mostrar por pantalla el
resultado devuelto por la función.
Ejercicio 2
Definir una función que muestre información sobre una cadena de
texto que se le pasa como argumento. A partir de la cadena que se le
pasa, la función determina si esa cadena está formada sólo por
mayúsculas, sólo por minúsculas o por una mezcla de ambas.

Ejercicio 3
Realizar un programa en el que se introduzca por teclado el
número de mes y nos muestre un mensaje si dicho mes tiene 28, 30
ó 31 días. Debemos solucionar el ejercicio usando la estructura más
eficiente. */

function parImpar(numero) {
    if (numero % 2 === 0) {

        return "" + numero + " es un número par.";
    } else {
        return "" + numero + " es un número impar.";
    }
}

function tipoCadena(cadena) {
    if (cadena === cadena.toUpperCase()) {
        return "La cadena está formada solo por mayúsculas.";
    } else if (cadena === cadena.toLowerCase()) {
        return "La cadena está formada solo por minúsculas.";
    } else {
        return "La cadena está formada por una mezcla de mayúsculas y minúsculas.";
    }
}

function diasMes(mes) {
    switch (mes) {
        case 1:
            return "Enero tiene 31 días.";
        case 2:
            return "Febrero tiene 28 días.";
        case 3:
            return "Marzo tiene 31 días.";
        case 4:
            return "Abril tiene 30 días.";
        case 5:
            return "Mayo tiene 31 días.";
        case 6:
            return "Junio tiene 30 días.";
        case 7:
            return "Julio tiene 31 días.";
        case 8:
            return "Agosto tiene 31 días.";
        case 9:
            return "Septiembre tiene 30 días.";
        case 10:
            return "Octubre tiene 31 días.";
        case 11:
            return "Noviembre tiene 30 días.";
        case 12:
            return "Diciembre tiene 31 días.";
    }
}