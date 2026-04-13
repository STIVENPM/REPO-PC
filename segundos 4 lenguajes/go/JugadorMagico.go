package main

type JugadorMagico struct {
	Nombre string
	Nivel  int
}

func NewJugadorMagico() JugadorMagico {
	return JugadorMagico{"Mago", 5}
}

func NewJugadorMagicoNombre(nombre string) JugadorMagico {
	return JugadorMagico{nombre, 10}
}

func NewJugadorMagicoParams(nombre string, nivel int) JugadorMagico {
	return JugadorMagico{nombre, nivel}
}

func NewJugadorMagicoCopy(j JugadorMagico) JugadorMagico {
	return JugadorMagico{j.Nombre, j.Nivel}
}

type AbstractMagico interface {
	LanzarHechizo()
}
