package main

type JugadorVIP struct {
	Nombre string
	Nivel  int
}

func NewJugadorVIP() JugadorVIP {
	return JugadorVIP{"VIP Juan", 50}
}

func NewJugadorVIPParams(nombre string, nivel int) JugadorVIP {
	return JugadorVIP{nombre, nivel}
}

func NewJugadorVIPNombre(nombre string) JugadorVIP {
	return JugadorVIP{nombre, 99}
}

func NewJugadorVIPCopy(j JugadorVIP) JugadorVIP {
	return JugadorVIP{j.Nombre, j.Nivel}
}
