var ciutat0, ciutat1, ciutat2, ciutat3, ciutat4, ciutat5;
console.log("Introduiu una d'aquestes ciutats: Barcelona, Madrid, Valencia, Malaga, Cadis, Santander");
ciutat0= prompt("Introdueix ciutat: ");
ciutat1= prompt("Introdueix ciutat: ");
ciutat2= prompt("Introdueix ciutat: ");
ciutat3= prompt("Introdueix ciutat: ");
ciutat4= prompt("Introdueix ciutat: ");
ciutat5= prompt("Introdueix ciutat: ");
var arrayCities = [ciutat0, ciutat1, ciutat2, ciutat3, ciutat4, ciutat5]
var modifiedCities = [];				
	for (var i=0; i<arrayCities.length; ++i) {
		modifiedCities[i] = arrayCities[i].replace(/a/ig,'4');
		} modifiedCities.sort().forEach(i => console.log(i));