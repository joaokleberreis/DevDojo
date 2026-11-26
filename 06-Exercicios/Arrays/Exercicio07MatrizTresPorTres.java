import java.util.Scanner;

public class Exercicio07MatrizTresPorTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("Digite o valor [" + linha + "][" + coluna + "]: ");

                while (!scanner.hasNextInt()) {
                    System.out.print("Digite um número inteiro: ");
                    scanner.next();
                }

                matriz[linha][coluna] = scanner.nextInt();
            }
        }

        System.out.println("Matriz:");

        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
