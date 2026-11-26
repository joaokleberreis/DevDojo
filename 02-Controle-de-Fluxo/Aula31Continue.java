public class Aula31Continue {
    public static void main(String[] args) {
        // Pula os números ímpares e imprime somente os pares.
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
