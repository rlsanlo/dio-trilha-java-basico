package com.example.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(Convidado convidado) {
        this.convidados.add(convidado);
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidado = new Convidado("", codigoConvite);
        this.convidados.remove(convidado);
    }

    public void contarConvidados(){
        System.out.println("Quantidade de convidados: " + this.convidados.size());
    }

    public void exibirConvidados(){
        for(Convidado convidado : this.convidados){
            System.out.println(convidado);
        }
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado(new Convidado("João", 1133));
        conjuntoConvidados.adicionarConvidado(new Convidado("Maria", 2233));
        conjuntoConvidados.adicionarConvidado(new Convidado("José", 2233));
        conjuntoConvidados.adicionarConvidado(new Convidado("Ana", 4545));
        conjuntoConvidados.adicionarConvidado(new Convidado("João", 1112));

        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.contarConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(2233);

        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.contarConvidados();

    }
}
