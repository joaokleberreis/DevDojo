public class Aula27LacosRepeticao {
    public static void main(String[] args) {
        int contadorWhile = 0;
        while (contadorWhile < 3) {
            System.out.println("while: " + contadorWhile);
            contadorWhile++;
        }

        int contadorDoWhile = 0;
        do {
            System.out.println("do while: " + contadorDoWhile);
            contadorDoWhile++;
        } while (contadorDoWhile < 3);

        for (int i = 0; i < 3; i++) {
            System.out.println("for: " + i);
        }
    }
}
