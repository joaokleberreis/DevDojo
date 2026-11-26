public class Aula17OperadorLogicoAnd {
    public static void main(String[] args) {
        int idade = 25;
        boolean possuiAutorizacao = true;

        boolean podeEntrar = idade >= 18 && possuiAutorizacao;
        System.out.println("Pode entrar? " + podeEntrar);
        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("false && true = " + (false && true));
        System.out.println("false && false = " + (false && false));
    }
}
