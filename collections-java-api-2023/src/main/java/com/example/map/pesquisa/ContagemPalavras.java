package com.example.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavras;

    public ContagemPalavras(){
        palavras = new HashMap<>();
    }

    public void adicionarPalavras(String linguagem, Integer contagem){
        palavras.put(linguagem, contagem);
    }

    public void removerPalavras(String palavra){
        if(!palavras.isEmpty()){
            palavras.remove(palavra);
        } else {
            System.out.println("O Map está vazio");
        }
    }

    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        for(int contagem : palavras.values()){
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavrasMaisFrequente(){
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for(Map.Entry<String, Integer> entry : palavras.entrySet()){
            if(entry.getValue() > maiorContagem){
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }
        return linguagemMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavras("Java", 2);
        contagemLinguagens.adicionarPalavras("Python", 8);
        contagemLinguagens.adicionarPalavras("JavaScript", 1);
        contagemLinguagens.adicionarPalavras("C#", 6);

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavrasMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }


}
