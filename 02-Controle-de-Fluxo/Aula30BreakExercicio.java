public class Aula30BreakExercicio {
    public static void main(String[] args) {
        // Exemplo: encontrar o primeiro múltiplo de 7 maior que 20.
        for (int numero = 21; numero <= 100; numero++) {
            if (numero % 7 == 0) {
                System.out.println("Primeiro múltiplo encontrado: " + numero);
                break;
            }
        }
    }
}
