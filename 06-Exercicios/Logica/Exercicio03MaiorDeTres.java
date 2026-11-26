import java.util.Scanner;

public class Exercicio03MaiorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Digite um número inteiro: ");
            scanner.next();
        }
        int primeiro = scanner.nextInt();

        System.out.print("Segundo número: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Digite um número inteiro: ");
            scanner.next();
        }
        int segundo = scanner.nextInt();

        System.out.print("Terceiro número: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Digite um número inteiro: ");
            scanner.next();
        }
        int terceiro = scanner.nextInt();

        int maior = primeiro;

        if (segundo > maior) {
            maior = segundo;
        }

        if (terceiro > maior) {
            maior = terceiro;
        }

        System.out.println("Maior número: " + maior);

        scanner.close();
    }
}
