import java.util.Scanner;

public class Exercicio02PodeVotar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");

        while (!scanner.hasNextInt()) {
            System.out.print("Idade inválida. Digite um número inteiro: ");
            scanner.next();
        }

        int idade = scanner.nextInt();

        while (idade < 0 || idade > 120) {
            System.out.print("Idade inválida. Digite uma idade entre 0 e 120: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Digite um número inteiro: ");
                scanner.next();
            }
            idade = scanner.nextInt();
        }

        if (idade < 16) {
            System.out.println("Não pode votar.");
        } else if (idade < 18 || idade > 70) {
            System.out.println("Voto facultativo.");
        } else {
            System.out.println("Voto obrigatório.");
        }

        scanner.close();
    }
}
