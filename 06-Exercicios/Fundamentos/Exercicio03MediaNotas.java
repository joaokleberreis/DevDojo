import java.util.Locale;
import java.util.Scanner;

public class Exercicio03MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("=== MÉDIA DE TRÊS NOTAS ===");

        System.out.print("Primeira nota: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Nota inválida. Digite novamente: ");
            scanner.next();
        }
        double primeiraNota = scanner.nextDouble();

        while (primeiraNota < 0 || primeiraNota > 10) {
            System.out.print("A nota deve estar entre 0 e 10. Digite novamente: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Nota inválida. Digite novamente: ");
                scanner.next();
            }
            primeiraNota = scanner.nextDouble();
        }

        System.out.print("Segunda nota: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Nota inválida. Digite novamente: ");
            scanner.next();
        }
        double segundaNota = scanner.nextDouble();

        while (segundaNota < 0 || segundaNota > 10) {
            System.out.print("A nota deve estar entre 0 e 10. Digite novamente: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Nota inválida. Digite novamente: ");
                scanner.next();
            }
            segundaNota = scanner.nextDouble();
        }

        System.out.print("Terceira nota: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Nota inválida. Digite novamente: ");
            scanner.next();
        }
        double terceiraNota = scanner.nextDouble();

        while (terceiraNota < 0 || terceiraNota > 10) {
            System.out.print("A nota deve estar entre 0 e 10. Digite novamente: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Nota inválida. Digite novamente: ");
                scanner.next();
            }
            terceiraNota = scanner.nextDouble();
        }

        double media = (primeiraNota + segundaNota + terceiraNota) / 3;

        System.out.printf("Média final: %.2f%n", media);

        scanner.close();
    }
}
