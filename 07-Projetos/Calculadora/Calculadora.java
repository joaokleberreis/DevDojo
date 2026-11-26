package Calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int opcao = -1;

        do {
            System.out.println("\n===== CALCULADORA =====");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            if (!scanner.hasNextInt()) {
                System.out.println("ERRO: informe uma opção válida.");
                scanner.next();
                continue;
            }

            opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Calculadora encerrada.");
                continue;
            }

            if (opcao < 1 || opcao > 4) {
                System.out.println("ERRO: opção inexistente.");
                continue;
            }

            System.out.print("Digite o primeiro número: ");

            if (!scanner.hasNextDouble()) {
                System.out.println("ERRO: informe um número válido.");
                scanner.next();
                continue;
            }

            double primeiroNumero = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");

            if (!scanner.hasNextDouble()) {
                System.out.println("ERRO: informe um número válido.");
                scanner.next();
                continue;
            }

            double segundoNumero = scanner.nextDouble();

            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + (primeiroNumero + segundoNumero));
                    break;

                case 2:
                    System.out.println("Resultado: " + (primeiroNumero - segundoNumero));
                    break;

                case 3:
                    System.out.println("Resultado: " + (primeiroNumero * segundoNumero));
                    break;

                case 4:
                    if (segundoNumero == 0) {
                        System.out.println("ERRO: divisão por zero não permitida.");
                    } else {
                        System.out.println("Resultado: " + (primeiroNumero / segundoNumero));
                    }
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
