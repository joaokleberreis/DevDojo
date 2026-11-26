public class Aula18OperadorLogicoOr {
    public static void main(String[] args) {
        boolean temIngresso = false;
        boolean estaNaLista = true;

        boolean podeEntrar = temIngresso || estaNaLista;
        System.out.println("Pode entrar? " + podeEntrar);
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));
    }
}
