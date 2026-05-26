package es.ing.tomillo.library.model;

import java.util.Objects;

public class Book {
    // TODO: Implementar los atributos según el ejercicio 1
    // - titulo (String)
    // - autor (String)
    // - isbn (String)
    // - disponible (boolean)
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponibles;


    // TODO: Implementar constructor según el ejercicio 1
    public Book( String titulo, String autor, String isbn)  {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponibles = true;
    }

    // TODO: Implementar getters y setters según el ejercicio 1
    public String getTitulo () {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo; }
    public String getAutor()  {return autor; }
    public void setAutor(String autor) {this.autor = autor; }
    public String getIsbn() {return isbn; }
    public void setIsbn(String isbn) {this.isbn = isbn; }
    public boolean isAvailable() {return disponibles; }
    public void setAvailable(boolean disponibles) {this.disponibles = disponibles; }
    public String getTitle () {return titulo;}
    public String getAuthor() {return autor;}
    public void setTitle(String titulo) {this.titulo = titulo; }
    // TODO: Implementar método toString según el ejercicio 1
    @Override
    public String toString() {
        return "Book{titulo='" + titulo + "', autor='" + autor + "', isbn='" + isbn + "'}";
    }
    // TODO: Implementar método equals para comparar libros por ISBN
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn,book.isbn);
    }
}


