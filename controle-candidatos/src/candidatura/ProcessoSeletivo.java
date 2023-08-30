package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo{
    public static void main(String[] args) {
        String [] candidatos = {"João", "Maria", "José", "Ana", "Pedro","Augusto","Monica","Mirela","Daniela"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }
        
    }

    static void entrandoEmContato(String candidato){
        int tentativaRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativaRealizadas++;
            else
                System.out.println("Contato realizado com sucesso!");

        }while (continuarTentando && tentativaRealizadas < 3 );

        if(atendeu)
            System.out.println("Conseguimos contato com o candidato: " + candidato + " na tentativa nº " + tentativaRealizadas);
        else
            System.out.println("Não conseguimos contato com o candidato: " + candidato + " após " + tentativaRealizadas + " tentativas");
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"João", "Maria", "José", "Ana", "Pedro","Augusto","Monica","Mirela","Daniela"};
        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("Candidato de nº " + (indice + 1) + " é: " + candidatos[indice]);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"João", "Maria", "José", "Ana", "Pedro","Augusto","Monica","Mirela","Daniela"};
        
        int candidatoSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatoSelecionado < 5){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("Candidato: " + candidato + " solicitou o salário de: " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("Candidato selecionado: " + candidato);
                candidatoSelecionado++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
    } else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
    } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
    }
    }
}