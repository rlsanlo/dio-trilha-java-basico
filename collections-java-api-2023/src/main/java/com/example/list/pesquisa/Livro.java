package com.example.list.pesquisa;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicao;

    public Livro(String titulo, String autor, int anoDeLancamento) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicao = anoDeLancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicao() {
        return anoPublicao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoDeLancamento=" + anoPublicao +
                '}';
    }
}
