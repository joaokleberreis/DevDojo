public class Aula33ArraysIndices {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        // O Java inicializa elementos numéricos de arrays com zero.
        System.out.println("Valor padrão: " + numeros[0]);

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        System.out.println("Primeiro índice: " + numeros[0]);
        System.out.println("Último índice: " + numeros[numeros.length - 1]);
        System.out.println("Tamanho: " + numeros.length);
    }
}
