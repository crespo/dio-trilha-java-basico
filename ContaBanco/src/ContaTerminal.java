import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta: ");
        int conta = scan.nextInt();
        scan.nextLine();

        System.out.print("Por favor, digite o número da agência: ");
        String agencia = scan.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        String nome = scan.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        double saldo = scan.nextDouble();

        scan.close();

        String resposta = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                nome, agencia, conta, saldo);

        System.out.println(resposta);
    }
}
