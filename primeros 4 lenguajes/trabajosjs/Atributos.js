class computador {
    #marca;
    constructor(marca, color, modelo){
        this.color = color;//atributos 
        this.#marca = marca;// privado 
        this.modelo = modelo;//publico
    }
encender (){//metodo
    console.log("marca es " + this.#marca);
}
}
const c1 = new computador ("lenovo","azul","2020" );//instan
c1.encender();//llamo metod


class silla {
    #color;
    constructor(color,peso,altura ){
        this.#color = color;
        this.peso = peso;
        this.altura = altura;
    }
    info(){
        console.log("color silla " + this.#color);
    }
}
const s1 = new silla ("negra","20 kl","70 cm")
s1.info();


class celular{
    #color;
    constructor(color, marca, tamaño){
        this.#color = color;
        this.marca = marca;
        this.tamaño = tamaño;
    }
 info(){
    console.log("color celular es " + this.#color)
 }
}
const ce1 = new celular("negro","samsun","1 pul")
ce1.info();


class llaves {
    #material
    constructor(material,tamaño,color){
        this.#material = material;
        this.tamaño = tamaño;
        this.color = color;
    }
    info(){
        console.log("material es " + this.#material)
    }
}
const ll1 = new llaves ("madera","2 cm","cafe")
ll1.info();


class correa{
    #material
    constructor(material,longitud,peso){
        this.#material = material;
        this.longitud = longitud;
        this.peso = peso;
    }
    info(){
        console.log("material es " + this.#material)
        console.log("longitud es " + this.longitud)
    }
}
const co2 = new correa("cuero","30 cm","30 gm");
co2.info();



















