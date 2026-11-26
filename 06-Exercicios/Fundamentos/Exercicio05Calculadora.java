import java.util.Locale;
import java.util.Scanner;

public class Exercicio05Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("=== CALCULADORA SIMPLES ===");

        System.out.print("Primeiro número: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Número inválido. Digite novamente: ");
            scanner.next();
        }
        double primeiroNumero = scanner.nextDouble();

        System.out.print("Segundo número: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Número inválido. Digite novamente: ");
            scanner.next();
        }
        double segundoNumero = scanner.nextDouble();

        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Opção: ");

        while (!scanner.hasNextInt()) {
            System.out.print("Opção inválida. Digite um número de 1 a 4: ");
            scanner.next();
        }
        int opcao = scanner.nextInt();

        while (opcao < 1 || opcao > 4) {
            System.out.print("Escolha uma opção entre 1 e 4: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Opção inválida. Digite um número de 1 a 4: ");
                scanner.next();
            }
            opcao = scanner.nextInt();
        }

        if (opcao == 1) {
            System.out.printf("Resultado: %.2f%n", primeiroNumero + segundoNumero);
        } else if (opcao == 2) {
            System.out.printf("Resultado: %.2f%n", primeiroNumero - segundoNumero);
        } else if (opcao == 3) {
            System.out.printf("Resultado: %.2f%n", primeiroNumero * segundoNumero);
        } else if (opcao == 4) {
            if (segundoNumero == 0) {
                System.out.println("Erro: não é possível dividir por zero.");
            } else {
                System.out.printf("Resultado: %.2f%n", primeiroNumero / segundoNumero);
            }
        }

        scanner.close();
    }
}
