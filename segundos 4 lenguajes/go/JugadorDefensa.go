package main

type JugadorDefensa struct {
	Nombre string
	Nivel  int
}

func NewJugadorDefensa() JugadorDefensa {
	return JugadorDefensa{"", 0}
}

func NewJugadorDefensaNombre(nombre string) JugadorDefensa {
	return JugadorDefensa{nombre, 1}
}

func NewJugadorDefensaParams(nombre string, nivel int) JugadorDefensa {
	return JugadorDefensa{nombre, nivel}
}

func NewJugadorDefensaCopy(j JugadorDefensa) JugadorDefensa {
	return JugadorDefensa{j.Nombre, j.Nivel}
}

type AbstractDefensa interface {
	Defender()
}
