class Calculadora {
  sumar(a, b) {
    return a + b; // devuelve el resultado
  }
}
const calc = new Calculadora();
let resultado = calc.sumar(10, 5);
console.log("La suma es: " + resultado);



class notas{
    suma(nota1, nota2){
        return nota1 + nota2;
    }
}
const no = new notas();
let resultadoo = no.suma(30,40);
console.log("la nota es " + resultadoo);


class cuenta{
    operacion(saldo,retiro ){
        return saldo - retiro;
    }
}
const cs = new cuenta();
let resultadooo = cs.operacion(300000, 43930);
console.log("el salgo es " + resultadooo);


class dinero{
    cuenta(prestamo,pagado){
        return prestamo - pagado;
    }
}
const p1 = new dinero();
let resultadoooo = p1.cuenta(12345,1233);
console.log("la deuda es " + resultadoooo)


class enviado{
    dinero(envio1,envio2){
        return envio1 * envio2;
    }
}
const e1 = new enviado();
let resultadooooo = e1.dinero(234567,456789);
console.log("el dinero es " + resultadooooo);
