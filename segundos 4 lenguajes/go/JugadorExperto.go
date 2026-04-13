package main

type JugadorExperto struct {
	Nombre string
	Nivel  int
}

func NewJugadorExperto() JugadorExperto {
	return JugadorExperto{"Experto", 20}
}

func NewJugadorExpertoParams(nombre string, nivel int) JugadorExperto {
	return JugadorExperto{nombre, nivel}
}

func NewJugadorExpertoNombre(nombre string) JugadorExperto {
	return JugadorExperto{nombre, 20}
}

func NewJugadorExpertoCopy(j JugadorExperto) JugadorExperto {
	return JugadorExperto{j.Nombre, j.Nivel}
}
