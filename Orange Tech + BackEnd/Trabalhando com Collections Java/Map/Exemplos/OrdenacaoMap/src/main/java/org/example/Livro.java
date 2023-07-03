package org.example;

import java.util.Objects;

public class Livro {
    private String titulo;
    private int quantidadePaginas;

    public Livro(String titulo, int quantidadePaginas) {
        this.titulo = titulo;
        this.quantidadePaginas = quantidadePaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", quantidadePaginas=" + quantidadePaginas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return quantidadePaginas == livro.quantidadePaginas && titulo.equals(livro.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, quantidadePaginas);
    }
}

