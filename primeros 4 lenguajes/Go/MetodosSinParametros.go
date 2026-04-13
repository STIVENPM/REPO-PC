package main
import "fmt"

type MetodosSinParametros struct{}

func (m MetodosSinParametros) IniciarJuego() {
	fmt.Println("El juego ha comenzado.")
}

func (m MetodosSinParametros) MostrarMenu() {
	fmt.Println("Mostrando menú principal.")
}

func (m MetodosSinParametros) CargarMapa() {
	fmt.Println("Cargando mapa...")
}

func (m MetodosSinParametros) GuardarPartida() {
	fmt.Println("Partida guardada correctamente.")
}

func (m MetodosSinParametros) SalirJuego() {
	fmt.Println("Saliendo del juego...")
}
