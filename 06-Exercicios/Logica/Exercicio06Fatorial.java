import java.util.Scanner;

public class Exercicio06Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número entre 0 e 20: ");

        while (!scanner.hasNextInt()) {
            System.out.print("Digite um número inteiro: ");
            scanner.next();
        }

        int numero = scanner.nextInt();

        while (numero < 0 || numero > 20) {
            System.out.print("O número deve estar entre 0 e 20: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Digite um número inteiro: ");
                scanner.next();
            }
            numero = scanner.nextInt();
        }

        long fatorial = 1;

        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println(numero + "! = " + fatorial);

        scanner.close();
    }
}
