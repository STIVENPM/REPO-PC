package main

import "fmt"

type ModificadoresAcceso struct {
	Publico   string
	privado   string
	protegido string
	defaultV  string
}

func (m ModificadoresAcceso) MostrarPublico() {
	fmt.Println("Accediendo al modificador público.")
}

func (m ModificadoresAcceso) MostrarPrivadoProtegido() {
	fmt.Println("Accediendo al modificador privado y protegido.")
}

func (m ModificadoresAcceso) MostrarDefault() {
	fmt.Println("Accediendo al modificador por defecto.")
}

