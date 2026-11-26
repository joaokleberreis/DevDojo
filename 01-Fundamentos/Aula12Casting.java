public class Aula12Casting {
    public static void main(String[] args) {
        // Widening: conversão implícita, de tipo menor para tipo compatível maior
        int numeroInteiro = 100;
        double numeroDecimal = numeroInteiro;

        // Narrowing: conversão explícita, pode perder informação
        double valorDecimal = 9.75;
        int valorInteiro = (int) valorDecimal;

        // Exemplo de perda da parte decimal
        double preco = 19.99;
        int precoConvertido = (int) preco;

        System.out.println("Conversão implícita: " + numeroDecimal);
        System.out.println("Conversão explícita: " + valorInteiro);
        System.out.println("Perda da parte decimal: " + precoConvertido);
    }
}
