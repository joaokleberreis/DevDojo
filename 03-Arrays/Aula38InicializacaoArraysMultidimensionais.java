public class Aula38InicializacaoArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] matrizRegular = new int[2][3];
        int[][] matrizInicializada = {
            {10, 20},
            {30, 40, 50},
            {60}
        };

        System.out.println("Matriz regular:");
        for (int[] linha : matrizRegular) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz irregular:");
        for (int[] linha : matrizInicializada) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
