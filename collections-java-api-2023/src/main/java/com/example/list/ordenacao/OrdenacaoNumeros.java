package com.example.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    List<Integer> listaDeNumeros;

    public OrdenacaoNumeros() {
        this.listaDeNumeros = new ArrayList<>();
    }

    public void adicionarNumero(Integer numero) {
        this.listaDeNumeros.add(numero);
    }

    //Ordena os numeros da lista em ordem ascendente usando a interface Comparable e a class Collections
    public List<Integer> ordenarNumeros() {
        List<Integer> numerosOrdenados = new ArrayList<>(listaDeNumeros);
        Collections.sort(numerosOrdenados);
        return numerosOrdenados;
    }

    //Ordena os numeros da lista em ordem descendente usando a interface Comparable e a class Collections
    public List<Integer> ordenarNumerosDescendente() {
        List<Integer> numerosOrdenados = new ArrayList<>(listaDeNumeros);
        Collections.sort(numerosOrdenados, Collections.reverseOrder());
        return numerosOrdenados;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(60);
        ordenacaoNumeros.adicionarNumero(23);
        ordenacaoNumeros.adicionarNumero(12);

        System.out.println(ordenacaoNumeros.ordenarNumeros());
        System.out.println(ordenacaoNumeros.ordenarNumerosDescendente());
    }

}
