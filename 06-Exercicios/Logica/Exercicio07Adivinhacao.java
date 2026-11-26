import java.util.Scanner;
import java.util.Random;

public class Exercicio07Adivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 7;
        boolean acertou = false;

        System.out.println("=== JOGO DE ADIVINHAÇÃO ===");
        System.out.println("Adivinhe o número entre 1 e 100.");
        System.out.println("Você tem 7 tentativas.");

        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + ": ");

            while (!scanner.hasNextInt()) {
                System.out.print("Digite um número inteiro: ");
                scanner.next();
            }

            int palpite = scanner.nextInt();

            while (palpite < 1 || palpite > 100) {
                System.out.print("Digite um número entre 1 e 100: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Digite um número inteiro: ");
                    scanner.next();
                }
                palpite = scanner.nextInt();
            }

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou.");
                acertou = true;
                break;
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior.");
            } else {
                System.out.println("O número secreto é menor.");
            }
        }

        if (!acertou) {
            System.out.println("Fim de jogo. Número secreto: " + numeroSecreto);
        }

        scanner.close();
    }
}
