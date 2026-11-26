package MenuInterativo;

import java.util.Locale;
import java.util.Scanner;

public class MenuInterativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n===== MENU DE UTILIDADES =====");
            System.out.println("1 - Calcular média de três notas");
            System.out.println("2 - Converter Celsius para Fahrenheit");
            System.out.println("3 - Verificar par ou ímpar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.nextLine();
                continue;
            }

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    double soma = 0;
                    boolean notasValidas = true;

                    for (int i = 1; i <= 3; i++) {
                        System.out.print("Digite a " + i + "ª nota (0 a 10): ");

                        if (!scanner.hasNextDouble()) {
                            System.out.println("Nota inválida.");
                            scanner.nextLine();
                            notasValidas = false;
                            break;
                        }

                        double nota = scanner.nextDouble();

                        if (nota < 0 || nota > 10) {
                            System.out.println("A nota deve estar entre 0 e 10.");
                            notasValidas = false;
                            break;
                        }

                        soma += nota;
                    }

                    if (notasValidas) {
                        System.out.printf("Média: %.2f%n", soma / 3);
                    }
                    break;

                case 2:
                    System.out.print("Temperatura em Celsius: ");

                    if (scanner.hasNextDouble()) {
                        double celsius = scanner.nextDouble();
                        double fahrenheit = (celsius * 9 / 5) + 32;
                        System.out.printf("%.2f °C = %.2f °F%n", celsius, fahrenheit);
                    } else {
                        System.out.println("Temperatura inválida.");
                        scanner.nextLine();
                    }
                    break;

                case 3:
                    System.out.print("Digite um número inteiro: ");

                    if (scanner.hasNextInt()) {
                        int numero = scanner.nextInt();

                        if (numero % 2 == 0) {
                            System.out.println(numero + " é par.");
                        } else {
                            System.out.println(numero + " é ímpar.");
                        }
                    } else {
                        System.out.println("Número inválido.");
                        scanner.nextLine();
                    }
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inexistente. Escolha de 0 a 3.");
            }
        }

        scanner.close();
    }
}
