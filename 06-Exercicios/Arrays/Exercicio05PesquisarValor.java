import java.util.Scanner;

public class Exercicio05PesquisarValor {
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

        System.out.print("Digite o valor que deseja pesquisar: ");

        while (!scanner.hasNextInt()) {
            System.out.print("Digite um número inteiro: ");
            scanner.next();
        }

        int pesquisa = scanner.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == pesquisa) {
                System.out.println("Valor encontrado no índice " + i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Valor não encontrado.");
        }

        scanner.close();
    }
}
