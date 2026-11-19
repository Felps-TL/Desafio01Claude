package exercicios.mini06contabancaria.test;

import exercicios.mini06contabancaria.domain.Conta;

import java.util.Scanner;

public class ContaTest {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in);
        double saque = 0;
        double deposito = 0;
        int desejaContinuar = 1;

        do {
            System.out.println("-------------------------");
            System.out.println("Digite a opção desejada: ");
            System.out.println("1. Ver Saldo");
            System.out.println("2. Sacar");
            System.out.println("3. Depositar");
            System.out.println("4. Sair");
            int escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.println("------------------------------------------");
                System.out.println("Seu saldo é de: R$ %.2f%n" + conta.getSaldo());
                System.out.println("------------------------------------------");
                System.out.println("Deseja continuar?");
                System.out.println("1.Sim");
                System.out.println("2.Não");
                desejaContinuar = scanner.nextInt();

            } else if (escolha == 2) {
                System.out.println("------------------------------------------");
                System.out.println("Digite o valor desejado para sacar: ");
                saque = scanner.nextDouble();

                if (conta.sacar(saque)) {
                    System.out.println("------------------------------------------");
                    System.out.println("Seu novo saldo é de: R$ %.2f%n" + conta.getSaldo());

                } else {
                    System.out.println("Saque inválido ou saldo insulficiente! Saldo atual: R$ %.2f%n" + conta.getSaldo());
                }

                System.out.println("------------------------------------------");
                System.out.println("Deseja continuar?");
                System.out.println("1.Sim");
                System.out.println("2.Não");
                desejaContinuar = scanner.nextInt();

            } else if (escolha == 3) {
                System.out.println("------------------------------------------");
                System.out.println("Digite o valor desejado para depositar: ");
                deposito = scanner.nextDouble();
                conta.depositar(deposito);
                System.out.println("Seu novo saldo é de: R$ %.2f%n" + conta.getSaldo());
                System.out.println("------------------------------------------");
                System.out.println("Deseja continuar?");
                System.out.println("1.Sim");
                System.out.println("2.Não");
                desejaContinuar = scanner.nextInt();

            } else {
                System.out.println("Obrigado. Tenha um bom dia!");
                break;

            }

        } while (desejaContinuar == 1);
    }
}
