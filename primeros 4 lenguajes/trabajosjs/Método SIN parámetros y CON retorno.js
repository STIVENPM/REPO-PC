class Persona {
  constructor(nombre) {
    this.nombre = nombre;
  }
         info() { // sin parámetros, con retorno
    return this.nombre;
  }
}
const p1 = new Persona("Stiven");
console.log("mi nombre es " + p1.info());



class mesa {
    constructor(nombre){
        this.nombre = nombre;
    }
    info(){
        return this.nombre;
    }
}
const m1 = new mesa ("tanos")
console.log("el nombre es " + m1.info());


class teclado{
    constructor(escribir){
        this.escribir = escribir;
    }
    info(){
      return this.escribir;  
    }
}
const t1 = new teclado("escribe")
console.log("el teclado " + t1.info());


class espejo{
    constructor(reflejo){
        this.reflejo = reflejo;
    }
    info(){
        return this.reflejo;
    }
}
const e1 = new espejo("refleja")
console.log("el espejo " + e1.info());



class pc{
    constructor(marca){
        this.marca = marca;
    }
    info(){
        return this.marca;
    }
}
const pc1 = new pc("lenovo")
console.log("la pc es " + pc1.info());