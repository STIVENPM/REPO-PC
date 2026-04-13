package main

import "fmt"

func main() {
	fmt.Println("=== Atributos ===")
	attr := Atributos{
		Nombre:  "Juan",
		Salud:   100,
		Energia: 80,
		Clase:   "Guerrero",
		Activo:  true,
	}
	fmt.Printf("Nombre: %s, Salud: %d, Energía: %d, Clase: %s, Activo: %t\n",
		attr.Nombre, attr.Salud, attr.Energia, attr.Clase, attr.Activo)

	fmt.Println("\n=== Clases ===")
	cls := Clases{
		Jugador: Jugador{Nombre: "Heroe", Nivel: 20},
		Enemigo: Enemigo{Tipo: "Dragón", Fuerza: 50},
		Arma:    Arma{Nombre: "Espada", Danio: 70},
	}
	fmt.Printf("Jugador: %s, Nivel: %d\n", cls.Jugador.Nombre, cls.Jugador.Nivel)
	fmt.Printf("Enemigo: %s, Fuerza: %d\n", cls.Enemigo.Tipo, cls.Enemigo.Fuerza)
	fmt.Printf("Arma: %s, Daño: %d\n", cls.Arma.Nombre, cls.Arma.Danio)

	fmt.Println("\n=== Métodos con parámetros ===")
	mp := MetodosConParametros{}
	mp.Atacar("Dragón")
	mp.Curar("Juan", 50)
	mp.Mover("Norte")
	mp.Comprar("Poción", 25.5)
	mp.Equipar("Espada")

	fmt.Println("\n=== Métodos con retorno ===")
	mr := MetodosConRetorno{}
	fmt.Println("Nivel:", mr.ObtenerNivel())
	fmt.Println("Arma:", mr.ObtenerArma())
	fmt.Println("Daño:", mr.ObtenerDanio())
	fmt.Println("Misión completada:", mr.MisionCompletada())
	fmt.Println("Mapa:", mr.ObtenerMapa())

	fmt.Println("\n=== Métodos sin parámetros ===")
	sp := MetodosSinParametros{}
	sp.IniciarJuego()
	sp.MostrarMenu()
	sp.CargarMapa()
	sp.GuardarPartida()
	sp.SalirJuego()

	fmt.Println("\n=== Métodos sin retorno ===")
	sr := MetodosSinRetorno{}
	sr.MostrarJugador()
	sr.MostrarArma()
	sr.MostrarEnemigo()
	sr.MostrarMapa()
	sr.MostrarEstado()

	fmt.Println("\n=== Modificadores de acceso ===")
	acc := ModificadoresAcceso{}
	acc.MostrarPublico()
	acc.MostrarPrivadoProtegido()
	acc.MostrarDefault()

	fmt.Println("\n=== Objetos ===")
obj := Objetos{
	Jugador1: JugadorObj{Nombre: "Heroe", Nivel: 20},
	Espada:   ArmaObj{Tipo: "Espada", Danio: 70},
	Dragon:   EnemigoObj{Nombre: "Dragon", Salud: 150},
}
fmt.Printf("Jugador: %s, Nivel: %d\n", obj.Jugador1.Nombre, obj.Jugador1.Nivel)
fmt.Printf("Arma: %s, Daño: %d\n", obj.Espada.Tipo, obj.Espada.Danio)
fmt.Printf("Enemigo: %s, Salud: %d\n", obj.Dragon.Nombre, obj.Dragon.Salud)

	fmt.Println("\n=== Tipos de datos ===")
	tipos := TiposDeDatos{
		Jugador: "Juan",
		Nivel:   15,
		Puntos:  300.5,
		Vivo:    true,
		Armas:   []string{"Espada", "Arco", "Hacha"},
	}
	fmt.Printf("Jugador: %s, Nivel: %d, Puntos: %.2f, Vivo: %t\n", tipos.Jugador, tipos.Nivel, tipos.Puntos, tipos.Vivo)
	fmt.Println("Armas:", tipos.Armas)
}

