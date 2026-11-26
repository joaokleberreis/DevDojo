public class Aula19OperadoresAtribuicao {
    public static void main(String[] args) {
        int numero = 10;

        numero += 5;
        System.out.println("Após += 5: " + numero);

        numero -= 3;
        System.out.println("Após -= 3: " + numero);

        numero *= 2;
        System.out.println("Após *= 2: " + numero);

        numero /= 4;
        System.out.println("Após /= 4: " + numero);

        numero %= 3;
        System.out.println("Após %= 3: " + numero);
    }
}
