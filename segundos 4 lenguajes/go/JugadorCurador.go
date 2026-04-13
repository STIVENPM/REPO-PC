package main

type JugadorCurador struct {
	Nombre string
	Nivel  int
}

func NewJugadorCurador() JugadorCurador {
	return JugadorCurador{"", 0}
}

func NewJugadorCuradorParams(nombre string, nivel int) JugadorCurador {
	return JugadorCurador{nombre, nivel}
}

func NewJugadorCuradorNombre(nombre string) JugadorCurador {
	return JugadorCurador{nombre, 1}
}

func NewJugadorCuradorCopy(j JugadorCurador) JugadorCurador {
	return JugadorCurador{j.Nombre, j.Nivel}
}

type AbstractCurador interface {
	Curar()
}
