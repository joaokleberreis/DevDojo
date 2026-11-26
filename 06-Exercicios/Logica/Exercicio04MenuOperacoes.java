import java.util.Scanner;

public class Exercicio04MenuOperacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Digite um número válido: ");
            scanner.next();
        }
        double primeiro = scanner.nextDouble();

        System.out.print("Segundo número: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Digite um número válido: ");
            scanner.next();
        }
        double segundo = scanner.nextDouble();

        System.out.println("\n1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.print("Escolha: ");

        while (!scanner.hasNextInt()) {
            System.out.print("Escolha uma opção de 1 a 4: ");
            scanner.next();
        }
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + (primeiro + segundo));
                break;
            case 2:
                System.out.println("Resultado: " + (primeiro - segundo));
                break;
            case 3:
                System.out.println("Resultado: " + (primeiro * segundo));
                break;
            case 4:
                if (segundo == 0) {
                    System.out.println("Erro: divisão por zero.");
                } else {
                    System.out.println("Resultado: " + (primeiro / segundo));
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
