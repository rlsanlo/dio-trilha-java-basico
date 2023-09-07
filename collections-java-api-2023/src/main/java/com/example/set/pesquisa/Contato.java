package com.example.set.pesquisa;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numTelefone;

    public Contato(String nome, int numTelefone) {
        this.nome = nome;
        this.numTelefone = numTelefone;
    }

    public String getNome() {
        return nome;
    }

    public int getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(int numTelefone) {
        this.numTelefone = numTelefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome()) && Objects.equals(getNumTelefone(), contato.getNumTelefone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getNumTelefone());
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numTelefone='" + numTelefone + '\'' +
                '}';
    }
}
