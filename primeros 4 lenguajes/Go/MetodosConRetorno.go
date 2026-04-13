package main

type MetodosConRetorno struct{}

func (m MetodosConRetorno) ObtenerNivel() int {
	return 15
}

func (m MetodosConRetorno) ObtenerArma() string {
	return "Espada Legendaria"
}

func (m MetodosConRetorno) ObtenerDanio() int {
	return 75
}

func (m MetodosConRetorno) MisionCompletada() bool {
	return true
}

func (m MetodosConRetorno) ObtenerMapa() string {
	return "Bosque Encantado"
}
