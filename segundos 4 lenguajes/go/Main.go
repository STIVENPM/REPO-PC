package main

import "fmt"

func main() {

	// Instancias de clases normales

	jn1 := NewJugadorNormal()
	jn2 := NewJugadorNormalParams("Santiago", 15)
	jn3 := NewJugadorNormalNombre("Mafe")
	jn4 := NewJugadorNormalCopy(jn2)

	jp1 := NewJugadorPro()
	jp2 := NewJugadorProParams("Luis", 30)
	jp3 := NewJugadorProNivel(50)
	jp4 := NewJugadorProCopy(jp2)

	jv1 := NewJugadorVIP()
	jv2 := NewJugadorVIPParams("Sofía", 100)
	jv3 := NewJugadorVIPNombre("Marta")
	jv4 := NewJugadorVIPCopy(jv2)

	jno1 := NewJugadorNovato()
	jno2 := NewJugadorNovatoParams("Pepito", 2)
	jno3 := NewJugadorNovatoNivel(5)
	jno4 := NewJugadorNovatoCopy(jno2)

	je1 := NewJugadorExperto()
	je2 := NewJugadorExpertoParams("Raúl", 40)
	je3 := NewJugadorExpertoNombre("Andrea")
	je4 := NewJugadorExpertoCopy(je2)

	fmt.Println("Instancias creadas:")
	fmt.Println(jn1, jn2, jn3, jn4)
	fmt.Println(jp1, jp2, jp3, jp4)
	fmt.Println(jv1, jv2, jv3, jv4)
	fmt.Println(jno1, jno2, jno3, jno4)
	fmt.Println(je1, je2, je3, je4)
}
