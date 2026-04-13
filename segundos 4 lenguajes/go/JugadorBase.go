package main

type JugadorBase struct {
	Nombre string
	Nivel  int
}

func NewJugadorBase() JugadorBase {
	return JugadorBase{"Juan", 10}
}

func NewJugadorBaseParams(nombre string, nivel int) JugadorBase {
	return JugadorBase{nombre, nivel}
}

func NewJugadorBaseNombre(nombre string) JugadorBase {
	return JugadorBase{nombre, 1}
}

func NewJugadorBaseCopy(j JugadorBase) JugadorBase {
	return JugadorBase{j.Nombre, j.Nivel}
}

// Método abstracto simulado con interfaz
type AbstractBase interface {
	Atacar()
}
