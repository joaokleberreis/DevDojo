public class Aula24ExercicioCondicionalResolvido {
    public static void main(String[] args) {
        double salarioAnual = 50000.00;
        double primeiraFaixa = 34712.00;
        double segundaFaixa = 68507.00;
        double imposto;

        if (salarioAnual <= primeiraFaixa) {
            imposto = salarioAnual * 0.097;
        } else if (salarioAnual <= segundaFaixa) {
            imposto = salarioAnual * 0.3735;
        } else {
            imposto = salarioAnual * 0.495;
        }

        System.out.printf("Imposto estimado: R$ %.2f%n", imposto);
    }
}
