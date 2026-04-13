package main

type JugadorAtaque struct {
	Nombre string
	Nivel  int
}

func NewJugadorAtaque() JugadorAtaque {
	return JugadorAtaque{"", 0}
}

func NewJugadorAtaqueParams(nombre string, nivel int) JugadorAtaque {
	return JugadorAtaque{nombre, nivel}
}

func NewJugadorAtaqueNivel(nivel int) JugadorAtaque {
	return JugadorAtaque{"Anon", nivel}
}

func NewJugadorAtaqueCopy(j JugadorAtaque) JugadorAtaque {
	return JugadorAtaque{j.Nombre, j.Nivel}
}

type AbstractAtaque interface {
	Golpear()
}
