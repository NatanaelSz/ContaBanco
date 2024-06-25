import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Conta!");
        numero = sc.nextInt();
        System.out.println("Por favor, digite o número da Agência!");
        sc.nextLine();
        agencia = sc.nextLine();
        System.out.println("Por favor, digite o seu da Nome!");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o seu da Saldo!");
        saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque\".", nomeCliente, agencia, numero, saldo);



        sc.close();
    }
}
