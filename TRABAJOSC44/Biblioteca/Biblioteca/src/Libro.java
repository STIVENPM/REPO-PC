import java.time.LocalDate;

public class Libro {
    public String isbn;
    public String titulo;
    public String autor;
    public String genero;
    public LocalDate fechaPublicacion;
    public boolean prestado = false;

    public Libro() {}

    public Libro(String isbn, String titulo, String autor, String genero, LocalDate fechaPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        return "libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor +
               ", genero=" + genero + ", publicado=" + fechaPublicacion + ", prestado=" + prestado + "]";
    }
}