import java.util.Locale;
import java.util.Scanner;

public class Exercicio04Retangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("=== ÁREA E PERÍMETRO DO RETÂNGULO ===");

        System.out.print("Base: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Valor inválido. Digite a base: ");
            scanner.next();
        }
        double base = scanner.nextDouble();

        while (base <= 0) {
            System.out.print("A base deve ser maior que zero. Digite novamente: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Valor inválido. Digite a base: ");
                scanner.next();
            }
            base = scanner.nextDouble();
        }

        System.out.print("Altura: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Valor inválido. Digite a altura: ");
            scanner.next();
        }
        double altura = scanner.nextDouble();

        while (altura <= 0) {
            System.out.print("A altura deve ser maior que zero. Digite novamente: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Valor inválido. Digite a altura: ");
                scanner.next();
            }
            altura = scanner.nextDouble();
        }

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Perímetro: %.2f%n", perimetro);

        scanner.close();
    }
}
