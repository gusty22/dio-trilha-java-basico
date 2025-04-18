import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomeCliente;
        String agencia;
        int numero;
        double saldo;

        System.out.println("Digite o nome do cliente: ");
        nomeCliente = input.nextLine();
        System.out.println("Digite o agencia do cliente: ");
        agencia = input.nextLine();
        System.out.println("Digite o numero da conta do cliente: ");
        numero = input.nextInt();
        System.out.println("Digite o saldo do cliente: ");
        saldo = input.nextDouble();

        System.out.println("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é "+agencia+", conta "+numero+" e seu saldo de "+saldo+" já está disponível para saque");
    }
}
