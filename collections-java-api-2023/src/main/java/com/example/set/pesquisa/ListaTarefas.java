package com.example.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        this.tarefaSet.add(tarefa);
    }

    public void removerTarefa(Tarefa tarefa) {
        this.tarefaSet.remove(tarefa);
    }

    public void exibirTarefas() {
        for(Tarefa tarefa : this.tarefaSet) {
            System.out.println(tarefa);
        }
    }

    public void contarTarefas() {
        System.out.println("Quantidade de tarefas: " + this.tarefaSet.size());
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa tarefa : this.tarefaSet){
            if(tarefa.isFinalizado()){
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa tarefa : this.tarefaSet){
            if(!tarefa.isFinalizado()){
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }

    // Método que marca uma tarefa como concluída de acordo com a descrição
    public void marcarTarefaComoConcluida(String descricao){
        for(Tarefa tarefa : this.tarefaSet){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setFinalizado(true);
            }
        }
    }

    // Método que marca uma tarefa como pendente de acordo com a descrição
    public void marcarTarefaComoPendente(String descricao){
        for(Tarefa tarefa : this.tarefaSet){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setFinalizado(false);
            }
        }
    }

    // Método que remove todas as tarefas da lista de tarefas
    public void limparListaDeTarefas(){
        if(!this.tarefaSet.isEmpty()){
            this.tarefaSet.clear();
            System.out.println("Lista de tarefas limpa com sucesso!");
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa(new Tarefa("Lavar o carro"));
        listaTarefas.adicionarTarefa(new Tarefa("Lavar a louça"));
        listaTarefas.adicionarTarefa(new Tarefa("Lavar a roupa"));
        listaTarefas.adicionarTarefa(new Tarefa("Lavar a casa"));
        listaTarefas.adicionarTarefa(new Tarefa("Lavar o quintal"));
        listaTarefas.adicionarTarefa(new Tarefa("Lavar o banheiro"));
        listaTarefas.adicionarTarefa(new Tarefa("Lavar a cozinha"));
        listaTarefas.adicionarTarefa(new Tarefa("Lavar a sala"));
        listaTarefas.adicionarTarefa(new Tarefa("Lavar o quarto"));
        listaTarefas.adicionarTarefa(new Tarefa("Lavar a calçada"));
        listaTarefas.adicionarTarefa(new Tarefa("Lavar a varanda"));
        listaTarefas.adicionarTarefa(new Tarefa("Lavar o jardim"));
        listaTarefas.adicionarTarefa(new Tarefa("Lavar o telhado"));
        listaTarefas.adicionarTarefa(new Tarefa("Lavar o muro"));
        listaTarefas.adicionarTarefa(new Tarefa("Lavar a piscina"));
        listaTarefas.adicionarTarefa(new Tarefa("Lavar o carro"));
        listaTarefas.adicionarTarefa(new Tarefa("Lavar a louça"));
        listaTarefas.adicionarTarefa(new Tarefa("Lavar a roupa"));
        listaTarefas.adicionarTarefa(new Tarefa("Lavar a casa"));
        listaTarefas.adicionarTarefa(new Tarefa("Lavar o quintal"));
        listaTarefas.adicionarTarefa(new Tarefa("Lavar o banheiro"));
        listaTarefas.adicionarTarefa(new Tarefa("Lavar a cozinha"));
        listaTarefas.adicionarTarefa(new Tarefa("Lavar a sala"));
        listaTarefas.adicionarTarefa(new Tarefa("Lavar o quarto"));
        listaTarefas.adicionarTarefa(new Tarefa("Lavar a calçada"));

        listaTarefas.exibirTarefas();
        listaTarefas.contarTarefas();

        listaTarefas.marcarTarefaComoConcluida("Lavar o carro");
        listaTarefas.marcarTarefaComoConcluida("Lavar a louça");

        listaTarefas.exibirTarefas();
        listaTarefas.contarTarefas();

        listaTarefas.marcarTarefaComoPendente("Lavar o carro");
        listaTarefas.marcarTarefaComoPendente("Lavar a louça");

        listaTarefas.exibirTarefas();
        listaTarefas.contarTarefas();

        listaTarefas.limparListaDeTarefas();
    }

}
