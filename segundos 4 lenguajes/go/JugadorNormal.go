package main

type JugadorNormal struct {
	Nombre string
	Nivel  int
}

func NewJugadorNormal() JugadorNormal {
	return JugadorNormal{"Juan", 10}
}

func NewJugadorNormalParams(nombre string, nivel int) JugadorNormal {
	return JugadorNormal{nombre, nivel}
}

func NewJugadorNormalNombre(nombre string) JugadorNormal {
	return JugadorNormal{nombre, 1}
}

func NewJugadorNormalCopy(j JugadorNormal) JugadorNormal {
	return JugadorNormal{j.Nombre, j.Nivel}
}
