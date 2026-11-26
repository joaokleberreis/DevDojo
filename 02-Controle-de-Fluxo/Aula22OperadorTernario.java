public class Aula22OperadorTernario {
    public static void main(String[] args) {
        int idade = 19;
        String resultado = idade >= 18 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado);

        double salario = 3000.00;
        double percentual = salario > 2000 ? 0.10 : 0.05;
        System.out.println("Bônus: R$ " + (salario * percentual));
    }
}
