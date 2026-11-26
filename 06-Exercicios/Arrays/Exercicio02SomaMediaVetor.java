import java.util.Scanner;

public class Exercicio02SomaMediaVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");

            while (!scanner.hasNextInt()) {
                System.out.print("Digite um número inteiro: ");
                scanner.next();
            }

            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        double media = (double) soma / numeros.length;

        System.out.println("Soma: " + soma);
        System.out.printf("Média: %.2f%n", media);

        scanner.close();
    }
}
