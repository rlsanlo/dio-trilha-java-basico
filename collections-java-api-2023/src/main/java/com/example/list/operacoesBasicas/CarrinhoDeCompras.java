package com.example.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> listaDeItens;

    public CarrinhoDeCompras() {
        this.listaDeItens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        listaDeItens.add(item);
    }

    public void removerItem(Item item) {
        listaDeItens.remove(item);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for(Item item : listaDeItens){
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens(){
        for(Item item : listaDeItens){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<Item> listaDeItens = new ArrayList<>();
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        Item item1 = new Item("Arroz", 10.0, 2);
        Item item2 = new Item("Feijão", 5.0, 3);
        Item item3 = new Item("Macarrão", 3.0, 1);
        Item item4 = new Item("Carne", 20.0, 2);

        carrinhoDeCompras.adicionarItem(item1);
        carrinhoDeCompras.adicionarItem(item2);
        carrinhoDeCompras.adicionarItem(item3);
        carrinhoDeCompras.adicionarItem(item4);

        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total: " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem(item1);

        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total: " + carrinhoDeCompras.calcularValorTotal());
    }


}
