import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        System.out.print("Por favor, digite o número da sua conta: ");
        int numero_da_conta = leia.nextInt();

        System.out.print("Por favor, digite o número da agencia: ");
        String agencia_da_conta = leia.next();

        System.out.print("Por favor, digite o seu nome: ");
        String nome_do_cliente = leia.next();

        System.out.print("Por favor, digite o saldo de sua conta: ");
        double saldo_da_conta = leia.nextDouble();

        System.out.println("Olá " + nome_do_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia_da_conta + ", conta " + numero_da_conta + " e seu saldo " + saldo_da_conta + " já está disponível para saque");
    }
}