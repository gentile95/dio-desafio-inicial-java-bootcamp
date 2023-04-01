import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Digite o número da Agencia: ");
        conta.setAgencia(scan.next());
        System.out.println("Digite o número da sua Conta: ");
        conta.setNumero(scan.nextInt());
        System.out.println("Informe o saldo da sua Conta: ");
        conta.setSaldo(scan.nextDouble());
        System.out.println("Digite o seu nome: ");
        scan.nextLine();
        conta.setNomeCliente(scan.next());

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, " +
                "conta %d e seu saldo de R$ %.2f já está disponível para saque.", conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());

    }
}