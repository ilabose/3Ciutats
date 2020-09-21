console.log("Introduiu una d'aquestes ciutats: Barcelona, Madrid, Valencia, Malaga, Cadis, Santander");
var ciutat0 = prompt("Introdueix ciutat: ");
var ciutat1 = prompt("Introdueix ciutat: ");
var ciutat2 = prompt("Introdueix ciutat: ");
var ciutat3 = prompt("Introdueix ciutat: ");
var ciutat4 = prompt("Introdueix ciutat: ");
var ciutat5 = prompt("Introdueix ciutat: ");

var i; 
var medida0 = ciutat0.length;
var arrayBarc = new Array(medida0);
var medida1 = ciutat1.length;
var arrayMadr = new Array(medida1);
var medida2 = ciutat2.length;
var arrayVale = new Array(medida2);
var medida3 = ciutat3.length;
var arrayMala = new Array(medida3);
var medida4 = ciutat4.length;
var arrayCadi = new Array(medida4);
var medida5 = ciutat5.length;
var arraySant = new Array(medida5);

for (i=(medida0-1); i>=0; i--){
    arrayBarc.push(ciutat0.charAt(i));
    }
arrayBarc.splice(0, medida0);
console.log(arrayBarc);

for (i=(medida1-1); i>=0; i--){
    arrayMadr.push(ciutat1.charAt(i));
    }
arrayMadr.splice(0, medida1);
console.log(arrayMadr);

for (i=(medida2-1); i>=0; i--){
    arrayVale.push(ciutat2.charAt(i));
    }
arrayVale.splice(0, medida2);
console.log(arrayVale);

for (i=(medida3-1); i>=0; i--){
    arrayMala.push(ciutat3.charAt(i));
    }
arrayMala.splice(0, medida3);
console.log(arrayMala);

for (i=(medida4-1); i>=0; i--){
    arrayCadi.push(ciutat4.charAt(i));
    }
arrayCadi.splice(0, medida4);
console.log(arrayCadi);

for (i=(medida5-1); i>=0; i--){
    arraySant.push(ciutat5.charAt(i));
    }
arraySant.splice(0, medida5);
console.log(arraySant);