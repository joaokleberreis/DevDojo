import java.util.Scanner;

public class Exercicio03MaiorMenorVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");

            while (!scanner.hasNextInt()) {
                System.out.print("Digite um número inteiro: ");
                scanner.next();
            }

            numeros[i] = scanner.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];

        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        scanner.close();
    }
}
