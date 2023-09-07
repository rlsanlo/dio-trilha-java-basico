package com.example.set.pesquisa;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean finalizado;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isFinalizado() {
        return finalizado;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return isFinalizado() == tarefa.isFinalizado() && Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao(), isFinalizado());
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", finalizado=" + finalizado +
                '}';
    }

}
