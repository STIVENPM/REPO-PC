import { JugadorNormal } from "./JugadorNormal.js";
import { JugadorPro } from "./JugadorPro.js";
import { JugadorVIP } from "./JugadorVIP.js";
import { JugadorNovato } from "./JugadorNovato.js";
import { JugadorExperto } from "./JugadorExperto.js";

// NOTA IMPORTANTE:
// En JavaScript solo se pueden instanciar las CLASES NORMALES.
// Las “clases abstractas” definidas en este proyecto se usan solo
// como clases base y NO deben ser instanciadas directamente,
// ya que contienen métodos sin implementar.
// También, JavaScript no tiene destructores; la memoria se maneja
// automáticamente mediante el Garbage Collector.

console.log("INSTANCIAS DE CLASES NORMALES:");

const jn1 = new JugadorNormal();
const jn2 = new JugadorNormal("Santiago", 15);
const jn3 = new JugadorNormal("Mafe");
const jn4 = new JugadorNormal(null, null, jn2);

const jp1 = new JugadorPro();
const jp2 = new JugadorPro("Luis", 30);
const jp3 = new JugadorPro("Desconocido", 50);
const jp4 = new JugadorPro(null, null, jp2);

const jv1 = new JugadorVIP();
const jv2 = new JugadorVIP("Sofia", 100);
const jv3 = new JugadorVIP("Marta");
const jv4 = new JugadorVIP(null, null, jv2);

const jno1 = new JugadorNovato();
const jno2 = new JugadorNovato("Pepito", 2);
const jno3 = new JugadorNovato("Novato", 5);
const jno4 = new JugadorNovato(null, null, jno2);

const je1 = new JugadorExperto();
const je2 = new JugadorExperto("Raúl", 40);
const je3 = new JugadorExperto("Andrea");
const je4 = new JugadorExperto(null, null, je2);

console.log("JugadorNormal:", jn2);
console.log("JugadorPro:", jp2);
console.log("JugadorVIP:", jv2);
console.log("JugadorNovato:", jno2);
console.log("JugadorExperto:", je2);
