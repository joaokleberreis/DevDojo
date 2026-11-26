public class Aula13Strings {
    public static void main(String[] args) {
        String nome = "Java";
        String sobrenome = "Backend";
        String nomeCompleto = nome + " " + sobrenome;

        System.out.println("Texto: " + nome);
        System.out.println("Concatenação: " + nomeCompleto);
        System.out.println("Quantidade de caracteres: " + nomeCompleto.length());
        System.out.println("Maiúsculas: " + nomeCompleto.toUpperCase());
        System.out.println("Contém Java? " + nomeCompleto.contains("Java"));
    }
}
