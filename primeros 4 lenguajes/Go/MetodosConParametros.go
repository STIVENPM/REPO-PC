package main


import "fmt"

type MetodosConParametros struct{}

func (m MetodosConParametros) Atacar(enemigo string) {
	fmt.Printf("Atacando a %s\n", enemigo)
}

func (m MetodosConParametros) Curar(jugador string, cantidad int) {
	fmt.Printf("%s recuperó %d puntos de vida\n", jugador, cantidad)
}

func (m MetodosConParametros) Mover(direccion string) {
	fmt.Printf("Moviéndose hacia %s\n", direccion)
}

func (m MetodosConParametros) Comprar(objeto string, precio float64) {
	fmt.Printf("Compró %s por $%.2f\n", objeto, precio)
}

func (m MetodosConParametros) Equipar(objeto string) {
	fmt.Printf("Equipó %s\n", objeto)
}
