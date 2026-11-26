public class Aula23TabelaVerdade {
    public static void main(String[] args) {
        boolean[] valores = {true, false};

        System.out.println("AND (&&)");
        for (boolean a : valores) {
            for (boolean b : valores) {
                System.out.println(a + " && " + b + " = " + (a && b));
            }
        }

        System.out.println();
        System.out.println("OR (||)");
        for (boolean a : valores) {
            for (boolean b : valores) {
                System.out.println(a + " || " + b + " = " + (a || b));
            }
        }
    }
}
