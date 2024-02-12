import java.util.Scanner;
public class ContaTerminal {
    ;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;

        System.out.println("Por favor, informe seu nome: ");
        nomeCliente = scanner.nextLine();
        //uso do nextline para capturar um nome com sobrenome

        System.out.println("Por favor, informe o número da Conta: ");
        numero = scanner.nextInt();

        System.out.println("Por favor, informe o número da Agência: ");
        agencia = scanner.next();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n", nomeCliente, agencia, numero, saldo);

        scanner.close();

    }
}