package com.juanbecerra.practico2;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int cantPaginas;
    private int anioLanzammiento;
    private String genero;
    private String descripcion;
    private int imagen;

    public Libro(){}
    public Libro(String isbn, String titulo, String autor, int cantPaginas, int anioLanzammiento, String genero, String descripcion, int imagen){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.cantPaginas = cantPaginas;
        this.anioLanzammiento = anioLanzammiento;
        this.genero = genero;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public int getAnioLanzammiento() {
        return anioLanzammiento;
    }

    public void setAnioLanzammiento(int anioLanzammiento) {
        this.anioLanzammiento = anioLanzammiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
