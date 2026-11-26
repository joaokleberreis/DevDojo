public class CalculoProduto {
    public static void main(String[] args) {
        String produto = "iPhone";
        double preco = 3800.00;
        int quantidade = 5;

        double total = preco * quantidade;

        System.out.println("Produto: " + produto);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total: R$ " + total);
    }
}
