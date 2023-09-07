package com.example.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> listaDeNumeros;

public SomaNumeros() {
        this.listaDeNumeros = new ArrayList<>();
    }

public void adicionarNumero(Integer numero) {
        this.listaDeNumeros.add(numero);
    }
// Método que calcula a soma de todos os numeros na lista e retorna o resultado
public Integer calcularSoma() {
        Integer soma = 0;
        for (Integer numero : listaDeNumeros) {
            soma += numero;
        }
        return soma;
    }
    // Encontra o maior numero na lista e retorna o valor
    public Integer encontrarMaiorNumero() {
        Integer maiorNumero = 0;
        for (Integer numero : listaDeNumeros) {
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        return maiorNumero;
    }

    // Encontra o menor numero na lista e retorna o valor
    public Integer encontrarMenorNumero() {
        Integer menorNumero = listaDeNumeros.get(0);
        for (Integer numero : listaDeNumeros) {
            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }
        return menorNumero;
    }

    // Retorna uma lista contendo todos os numeros presentes na lista
    public List<Integer> encontrarTodosNumeros() {
        return listaDeNumeros;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(60);
        somaNumeros.adicionarNumero(23);
        somaNumeros.adicionarNumero(12);
        somaNumeros.adicionarNumero(34);

        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
        System.out.println(somaNumeros.encontrarTodosNumeros());



    }
}
