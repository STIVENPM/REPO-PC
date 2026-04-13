package main

import "fmt"

type MetodosSinRetorno struct{}

func (m MetodosSinRetorno) MostrarJugador() {
	fmt.Println("Mostrando datos del jugador.")
}

func (m MetodosSinRetorno) MostrarArma() {
	fmt.Println("Mostrando información del arma.")
}

func (m MetodosSinRetorno) MostrarEnemigo() {
	fmt.Println("Mostrando detalles del enemigo.")
}

func (m MetodosSinRetorno) MostrarMapa() {
	fmt.Println("Mostrando mapa actual.")
}

func (m MetodosSinRetorno) MostrarEstado() {
	fmt.Println("Mostrando estado general del juego.")
}
