import java.util.Locale;
import java.util.Scanner;

public class ControleDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double[] notas = new double[5];
        int quantidade = 0;
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n===== CONTROLE DE NOTAS =====");
            System.out.println("1 - Cadastrar nota");
            System.out.println("2 - Listar notas");
            System.out.println("3 - Calcular média e situação");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.nextLine();
                continue;
            }

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if (quantidade == notas.length) {
                        System.out.println("Limite de 5 notas atingido.");
                        break;
                    }

                    System.out.print("Digite a nota (0 a 10): ");

                    if (!scanner.hasNextDouble()) {
                        System.out.println("Nota inválida.");
                        scanner.nextLine();
                        break;
                    }

                    double nota = scanner.nextDouble();

                    if (nota < 0 || nota > 10) {
                        System.out.println("A nota deve estar entre 0 e 10.");
                        break;
                    }

                    notas[quantidade] = nota;
                    quantidade++;
                    System.out.println("Nota cadastrada com sucesso.");
                    break;

                case 2:
                    if (quantidade == 0) {
                        System.out.println("Nenhuma nota cadastrada.");
                        break;
                    }

                    System.out.println("===== NOTAS CADASTRADAS =====");

                    for (int i = 0; i < quantidade; i++) {
                        System.out.printf("Nota %d: %.2f%n", i + 1, notas[i]);
                    }
                    break;

                case 3:
                    if (quantidade == 0) {
                        System.out.println("Cadastre pelo menos uma nota.");
                        break;
                    }

                    double soma = 0;

                    for (int i = 0; i < quantidade; i++) {
                        soma += notas[i];
                    }

                    double media = soma / quantidade;

                    System.out.printf("Média: %.2f%n", media);

                    if (media >= 7) {
                        System.out.println("Situação: Aprovado.");
                    } else if (media >= 5) {
                        System.out.println("Situação: Recuperação.");
                    } else {
                        System.out.println("Situação: Reprovado.");
                    }
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inexistente. Escolha de 0 a 3.");
            }
        }

        scanner.close();
    }
}
