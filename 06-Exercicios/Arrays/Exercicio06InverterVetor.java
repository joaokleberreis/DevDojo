import java.util.Arrays;
import java.util.Scanner;

public class Exercicio06InverterVetor {
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

        for (int inicio = 0, fim = numeros.length - 1;
             inicio < fim; inicio++, fim--) {
            int temporario = numeros[inicio];
            numeros[inicio] = numeros[fim];
            numeros[fim] = temporario;
        }

        System.out.println("Vetor invertido: " + Arrays.toString(numeros));

        scanner.close();
    }
}
