import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome");
        String nome = scanner.next();

        System.out.println("Informe seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
