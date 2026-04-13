package main

type JugadorPro struct {
	Nombre string
	Nivel  int
}

func NewJugadorPro() JugadorPro {
	return JugadorPro{"Juan", 10}
}

func NewJugadorProParams(nombre string, nivel int) JugadorPro {
	return JugadorPro{nombre, nivel}
}

func NewJugadorProNivel(nivel int) JugadorPro {
	return JugadorPro{"Desconocido", nivel}
}

func NewJugadorProCopy(j JugadorPro) JugadorPro {
	return JugadorPro{j.Nombre, j.Nivel}
}
