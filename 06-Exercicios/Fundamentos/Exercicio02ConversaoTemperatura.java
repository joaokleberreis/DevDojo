import java.util.Locale;
import java.util.Scanner;

public class Exercicio02ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("=== CONVERSOR DE TEMPERATURA ===");
        System.out.print("Temperatura em Celsius: ");

        while (!scanner.hasNextDouble()) {
            System.out.print("Valor inválido. Digite a temperatura em Celsius: ");
            scanner.next();
        }

        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("Celsius: %.2f °C%n", celsius);
        System.out.printf("Fahrenheit: %.2f °F%n", fahrenheit);

        scanner.close();
    }
}
