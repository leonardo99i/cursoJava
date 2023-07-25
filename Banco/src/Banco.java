import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        String nome = "Leonardo";
        String tipo = "Corrente";
        double saldo = 500.00;

        while (true) {
            System.out.println("*************************");
            System.out.println("Nome: " + nome);
            System.out.println("Tipo de conta: " + tipo);
            System.out.println("Saldo: " + saldo);
            System.out.println("*************************");

            System.out.println("Menu de Interação:");
            System.out.println("1 - Consultar o saldo");
            System.out.println("2 - Depositar Dinheiro");
            System.out.println("3 - Transferir Dinheiro");
            System.out.println("4 - Sair");
            System.out.println("Banco Alura");
            int operacoes = leitura.nextInt();

            switch (operacoes) {
                case 1:
                    System.out.println("Saldo Atual: R$ " + saldo);
                    break;
                case 2:
                    System.out.println("Quanto deseja depositar? ");
                    double deposito = leitura.nextDouble();
                    saldo += deposito;
                    break;
                case 3:
                    System.out.println("Quando deseja transferir? ");
                    double transferir = leitura.nextDouble();
                    if (saldo >= transferir) {
                        saldo -= transferir;
                        System.out.println("Sucesso");
                    } else {
                        System.out.println("Saldo Insuficiente");
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por utilizaro o Alura Bank, até a proxima.");
                    return;
                default:
                    System.out.println("Numero invalido");

            }
        }

    }
}