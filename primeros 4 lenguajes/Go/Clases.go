package main

type Clases struct {
	Jugador Jugador
	Enemigo Enemigo
	Arma    Arma
}

type Jugador struct {
	Nombre string
	Nivel  int
}

type Enemigo struct {
	Tipo   string
	Fuerza int
}

type Arma struct {
	Nombre string
	Danio   int
}
