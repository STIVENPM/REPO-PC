class Calculadora {
  sumar(a, b) {
    console.log("La suma es " + (a + b));
  }
}

const calc = new Calculadora();
calc.sumar(5, 3); 


class Persona {
    hablar(saludo) {
        console.log("La persona dice: " + saludo);
    }
}

const p = new Persona();
p.hablar("Hola");

class computador{
    encender(imagen){
        console.log("la pc " + imagen);
    }
}
const p1 = new computador("lenovo");
p1.encender("lenovo");


class suma{
    operacion(a,b,c){
        const resultado = a + b + c;
        console.log("el resultado de la suma es " + resultado  );
    }
}
const s1 = new suma();
s1.operacion( 7,  8 , 9 );

class celular{
     apagar(mostrar){
        console.log("el celular se " + mostrar);
     }
}
const c1 = new celular();
c1.apagar("apago");