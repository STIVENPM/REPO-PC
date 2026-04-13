class Numeros {
  constructor() {
    this.numeroD = 232.233; 
    this.numeroF = 3.3;     
    this.numeroI = 1231;     
    this.c = 'A';           
    this.texto = "Hola"; 
    this.estado = true;      
  }

  mostrar() {
    console.log("Decimal: " + this.numeroD0);
    console.log("Entero: " + this.numeroI);
    console.log("Carácter: " + this.c);
    console.log("Texto: " + this.texto);
    console.log("Booleano: " + this.estado);
  }
}

const n1 = new Numeros();
n1.mostrar();
