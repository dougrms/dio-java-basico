import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 

        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Digie seu nome: ");
        nomeCliente = sc.next();

        System.out.println("Por favor, digite o número da Agência! ");
        agencia = sc.next();

        System.out.println("Digite o numero da conta: ");
        numero = sc.nextInt();

        System.out.println("Digite o saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Olá "+nomeCliente
        +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia
        + ", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
    }
}
