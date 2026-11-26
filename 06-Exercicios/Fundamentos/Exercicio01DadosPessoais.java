import java.util.Locale;
import java.util.Scanner;

public class Exercicio01DadosPessoais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("=== DADOS PESSOAIS ===");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Digite uma idade válida: ");
            scanner.next();
        }
        int idade = scanner.nextInt();

        while (idade < 0) {
            System.out.print("A idade não pode ser negativa. Digite novamente: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Digite uma idade válida: ");
                scanner.next();
            }
            idade = scanner.nextInt();
        }

        System.out.print("Altura em metros: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Digite uma altura válida: ");
            scanner.next();
        }
        double altura = scanner.nextDouble();

        while (altura <= 0) {
            System.out.print("A altura deve ser maior que zero. Digite novamente: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Digite uma altura válida: ");
                scanner.next();
            }
            altura = scanner.nextDouble();
        }

        System.out.print("Salário: R$ ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Digite um salário válido: R$ ");
            scanner.next();
        }
        double salario = scanner.nextDouble();

        while (salario < 0) {
            System.out.print("O salário não pode ser negativo. Digite novamente: R$ ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Digite um salário válido: R$ ");
                scanner.next();
            }
            salario = scanner.nextDouble();
        }

        System.out.println("\n=== RESUMO DOS DADOS ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.printf("Altura: %.2f m%n", altura);
        System.out.printf("Salário: R$ %.2f%n", salario);

        scanner.close();
    }
}
