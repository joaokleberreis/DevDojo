public class Aula11TiposPrimitivos {
    public static void main(String[] args) {
        // Inteiros
        byte idade = 26;
        short ano = 2026;
        int populacao = 2_000_000;
        long habitantes = 8_000_000_000L;

        // Ponto flutuante
        float altura = 1.70F;
        double salario = 2000.00;

        // Caractere e booleano
        char inicial = 'J';
        boolean estudante = true;

        System.out.println("byte: " + idade + " (1 byte)");
        System.out.println("short: " + ano + " (2 bytes)");
        System.out.println("int: " + populacao + " (4 bytes)");
        System.out.println("long: " + habitantes + " (8 bytes)");
        System.out.println("float: " + altura + " (4 bytes)");
        System.out.println("double: " + salario + " (8 bytes)");
        System.out.println("char: " + inicial + " (2 bytes)");
        System.out.println("boolean: " + estudante + " (tamanho depende da JVM)");
    }
}
