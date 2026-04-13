package main

type JugadorNovato struct {
	Nombre string
	Nivel  int
}

func NewJugadorNovato() JugadorNovato {
	return JugadorNovato{"Novato", 1}
}

func NewJugadorNovatoParams(nombre string, nivel int) JugadorNovato {
	return JugadorNovato{nombre, nivel}
}

func NewJugadorNovatoNivel(nivel int) JugadorNovato {
	return JugadorNovato{"Novato", nivel}
}

func NewJugadorNovatoCopy(j JugadorNovato) JugadorNovato {
	return JugadorNovato{j.Nombre, j.Nivel}
}
