import java.util.Scanner;

public class Exercicio05ContagemESoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um limite entre 1 e 1000000: ");

        while (!scanner.hasNextInt()) {
            System.out.print("Digite um número inteiro válido: ");
            scanner.next();
        }

        int limite = scanner.nextInt();

        while (limite < 1 || limite > 1000000) {
            System.out.print("O limite deve estar entre 1 e 1000000: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Digite um número inteiro: ");
                scanner.next();
            }
            limite = scanner.nextInt();
        }

        long soma = 0;

        for (int numero = 1; numero <= limite; numero++) {
            System.out.println(numero);
            soma += numero;
        }

        System.out.println("Soma: " + soma);

        scanner.close();
    }
}
