/*EJERCICIO1
Crear un objeto1 con 3 propiedades:
name→de un cliente “Pedro”
preciocoche1→de ese cliente “12000”
preciocoche2→de ese cliente “15000”
Imprimir por consola la media del precio de los coches de ese cliente(usando notacion dot)

Crear un objeto2 con 3 propiedades:
name→de un cliente “Ana”
preciocoche1→de ese cliente “23000”
preciocoche2→de ese cliente “45000”
media→funcion que calcula la media del precio de ese cliente(usando this)

Imprimir con alert la media del precio de los coches de ese cliente(usando notacion bracket)
Imprimir por consola las propiedades del objeto1 usando bucle for ..in
Imprimir por consola las propiedades del objeto2 usando Object.entries 
*/

const objeto1 = {
    name: "Pedro",
    precioCoche1: 12000,
    precioCoche2: 15000
}

const objeto2 = {

    name: "Ana",
    precioCoche1: 223000,
    precioCoche2: 45000,
    media: function() {
        return (this.precioCoche1 + this.precioCoche2) / 2;
    }
}

console.log((objeto1.precioCoche1 + objeto1.precioCoche2) / 2);
alert(objeto2["media"]());

for (const key in objeto1) {
    if (!Object.hasOwn(objeto1, key)) continue;
    const element = objeto1[key];
    console.log(key + ": " + element);
}

Object.entries(objeto2).forEach(([key, value]) => { console.log(key + " " + value)});