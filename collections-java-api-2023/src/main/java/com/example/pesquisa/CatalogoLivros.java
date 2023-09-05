package com.example.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livroList.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }

        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicao() >= anoInicial && l.getAnoPublicao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
     List<Livro> livros = new ArrayList<>();
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        Livro livro1 = new Livro("Harry Potter", "J. K. Rowling", 1997);
        Livro livro2 = new Livro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954);
        Livro livro3 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        Livro livro4 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605);

        catalogoLivros.adicionarLivro(livro1);
        catalogoLivros.adicionarLivro(livro2);
        catalogoLivros.adicionarLivro(livro3);
        catalogoLivros.adicionarLivro(livro4);

        // testar pesquisar por autor
        System.out.println(catalogoLivros.pesquisarPorAutor("J. K. Rowling"));

        // testar pesquisar por intervalo de anos
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1954, 2000));

        // testar pesquisar por titulo
        System.out.println(catalogoLivros.pesquisarPorTitulo("O Pequeno Príncipe"));

    }

}
