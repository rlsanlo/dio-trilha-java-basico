package com.example.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa(List<Tarefa> tarefaList) {
        this.tarefaList = tarefaList;
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }


    public int obterNumeroTotalDeTarefas() {
        return tarefaList.size();
    }

    public void obterDescricaoTarefas(){
        for(Tarefa tarefa : tarefaList){
            System.out.println(tarefa.getDescricao());
        }
    }

    public static void main(String[] args) {
        List<Tarefa> tarefas = new ArrayList<>();
        ListaTarefa listaTarefa = new ListaTarefa(tarefas);
        listaTarefa.adicionarTarefa("Lavar o carro");
        listaTarefa.adicionarTarefa("Lavar a louça");
        listaTarefa.adicionarTarefa("Lavar a roupa");
        listaTarefa.adicionarTarefa("Lavar a casa");
        listaTarefa.adicionarTarefa("Lavar o quintal");
        listaTarefa.adicionarTarefa("Lavar o banheiro");
        listaTarefa.adicionarTarefa("Lavar a cozinha");
        listaTarefa.adicionarTarefa("Lavar a sala");
        listaTarefa.adicionarTarefa("Lavar o quarto");
        listaTarefa.adicionarTarefa("Lavar a calçada");
        listaTarefa.adicionarTarefa("Lavar a varanda");
        listaTarefa.adicionarTarefa("Lavar o jardim");
        listaTarefa.adicionarTarefa("Lavar o telhado");
        listaTarefa.adicionarTarefa("Lavar o muro");
        listaTarefa.adicionarTarefa("Lavar a piscina");
        listaTarefa.adicionarTarefa("Lavar o carro");
        listaTarefa.adicionarTarefa("Lavar a louça");
        listaTarefa.adicionarTarefa("Lavar a roupa");
        listaTarefa.adicionarTarefa("Lavar a casa");
        listaTarefa.adicionarTarefa("Lavar o quintal");
        listaTarefa.adicionarTarefa("Lavar o banheiro");
        listaTarefa.adicionarTarefa("Lavar a cozinha");
        listaTarefa.adicionarTarefa("Lavar a sala");
        listaTarefa.adicionarTarefa("Lavar o quarto");
        listaTarefa.adicionarTarefa("Lavar a calçada");
        listaTarefa.adicionarTarefa("Lavar a varanda");
        listaTarefa.adicionarTarefa("Lavar o jardim");
        listaTarefa.adicionarTarefa("Lavar o telhado");
        listaTarefa.adicionarTarefa("Lavar o muro");
        listaTarefa.adicionarTarefa("Lavar a piscina");
        listaTarefa.adicionarTarefa("Lavar o carro");

        // testar remover tarefa
        listaTarefa.removerTarefa("Lavar o carro");

        // testar obter descricao tarefas
        listaTarefa.obterDescricaoTarefas();

        System.out.println("O numero total de tarefas é: " + listaTarefa.obterNumeroTotalDeTarefas());
    }

}
