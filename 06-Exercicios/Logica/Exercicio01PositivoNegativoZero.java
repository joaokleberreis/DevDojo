import java.util.Scanner;

public class Exercicio01PositivoNegativoZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");

        while (!scanner.hasNextInt()) {
            System.out.print("Entrada inválida. Digite um número inteiro: ");
            scanner.next();
        }

        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        scanner.close();
    }
}
