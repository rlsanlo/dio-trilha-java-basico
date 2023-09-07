package com.example.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(Contato contato) {
        this.contatoSet.add(contato);
    }

    public void exibirContatos() {
        for(Contato contato : this.contatoSet) {
            System.out.println(contato);
        }
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosEncontrados = new HashSet<>();
        for(Contato contato : this.contatoSet){
            if(contato.getNome().equals(nome)){
                contatosEncontrados.add(contato);
            }
        }
        return contatosEncontrados;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoEncontrado = null;
        for(Contato contato : this.contatoSet){
            if(contato.getNome().equals(nome)){
                contato.setNumTelefone(novoNumero);
                contatoEncontrado = contato;
                break;
            }
        }
        return contatoEncontrado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato(new Contato("João", 12343213));
        agendaContatos.adicionarContato(new Contato("Maria", 22345454));
        agendaContatos.adicionarContato(new Contato("José", 32545434));
        agendaContatos.adicionarContato(new Contato("Ana", 42121234));
        agendaContatos.adicionarContato(new Contato("João", 54121234));

        agendaContatos.exibirContatos();

        System.out.println("Pesquisando por João");
        Set<Contato> contatosEncontrados = agendaContatos.pesquisarPorNome("João");
        for(Contato contato : contatosEncontrados){
            System.out.println(contato);
        }

        System.out.println("Atualizando número de telefone de João");
        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("João", 9999);
        System.out.println(contatoAtualizado);

        System.out.println("Exibindo contatos novamente");
        agendaContatos.exibirContatos();
    }
}
