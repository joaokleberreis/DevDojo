public class Aula29Break {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // encerra o laço imediatamente
            }
            System.out.println(i);
        }
        System.out.println("Laço encerrado");
    }
}
