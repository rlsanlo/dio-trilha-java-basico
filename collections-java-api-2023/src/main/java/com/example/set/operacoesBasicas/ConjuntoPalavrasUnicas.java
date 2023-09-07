package com.example.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        this.palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        this.palavrasUnicas.remove(palavra);
    }

    public void verificarPalavra(String palavra) {
        System.out.println("A palavra " + palavra + " está no conjunto? " + this.palavrasUnicas.contains(palavra));
    }

    public void exibirPalavrasUnicas() {
        for(String palavra : this.palavrasUnicas) {
            System.out.println(palavra);
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("João");
        conjuntoPalavrasUnicas.adicionarPalavra("Maria");
        conjuntoPalavrasUnicas.adicionarPalavra("José");
        conjuntoPalavrasUnicas.adicionarPalavra("Ana");
        conjuntoPalavrasUnicas.adicionarPalavra("João");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.verificarPalavra("João");
        conjuntoPalavrasUnicas.verificarPalavra("Pedro");

        conjuntoPalavrasUnicas.removerPalavra("João");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.verificarPalavra("João");
    }


}
