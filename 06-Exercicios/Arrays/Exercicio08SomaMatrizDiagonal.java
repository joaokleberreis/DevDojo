import java.util.Scanner;

public class Exercicio08SomaMatrizDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaTotal = 0;
        int somaDiagonal = 0;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("Digite o valor [" + linha + "][" + coluna + "]: ");

                while (!scanner.hasNextInt()) {
                    System.out.print("Digite um número inteiro: ");
                    scanner.next();
                }

                matriz[linha][coluna] = scanner.nextInt();
                somaTotal += matriz[linha][coluna];

                if (linha == coluna) {
                    somaDiagonal += matriz[linha][coluna];
                }
            }
        }

        System.out.println("Soma total: " + somaTotal);
        System.out.println("Soma da diagonal principal: " + somaDiagonal);

        scanner.close();
    }
}
