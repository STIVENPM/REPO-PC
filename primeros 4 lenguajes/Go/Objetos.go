package main

type Objetos struct {
	Jugador1 JugadorObj
	Espada   ArmaObj
	Dragon   EnemigoObj
}

type JugadorObj struct {
	Nombre string
	Nivel  int
}

type ArmaObj struct {
	Tipo string
	Danio int
}

type EnemigoObj struct {
	Nombre string
	Salud  int
}

func NewObjetos() Objetos {
	return Objetos{
		Jugador1: JugadorObj{"Héroe", 20},
		Espada:   ArmaObj{"Espada", 70},
		Dragon:   EnemigoObj{"Dragón", 150},
	}
}
