import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário
        System.out.println("Bem vindo ao Bytebank");


        //Obter pela classe Scanner os valores digitados no terminal
        System.out.println("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite a agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem da conta criada
        System.out.println("Olá " + titular + ", obrigado por criar uma conta em nosso banco, sua agencia é "+agencia+", conta "+numero+", e seu saldo "+saldo+", já está disponivel para saque");
    }
}
