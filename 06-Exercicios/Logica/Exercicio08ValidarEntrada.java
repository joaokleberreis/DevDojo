import java.util.Scanner;

public class Exercicio08ValidarEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor;

        do {
            System.out.print("Digite um número entre 1 e 10: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Entrada inválida. Digite um número inteiro: ");
                scanner.next();
            }

            valor = scanner.nextInt();

            if (valor < 1 || valor > 10) {
                System.out.println("Valor fora do intervalo permitido.");
            }

        } while (valor < 1 || valor > 10);

        System.out.println("Valor aceito: " + valor);

        scanner.close();
    }
}
