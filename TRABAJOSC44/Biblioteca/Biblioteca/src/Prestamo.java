import java.time.LocalDate;

public class Prestamo {
    Libro libro;
    Lector lector;
    LocalDate fechaPrestamo;

    Prestamo(Libro libro, Lector lector) {
        this.libro = libro;
        this.lector = lector;
        this.fechaPrestamo = LocalDate.now();
    }

    @Override
    public String toString() {
        return "prestamo [libro=" + libro.titulo + ", lector=" + lector.nombre + ", fecha=" + fechaPrestamo + "]";
    }
}