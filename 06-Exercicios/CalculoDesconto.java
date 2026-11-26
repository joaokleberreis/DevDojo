public class CalculoDesconto {
    public static void main(String[] args) {
        // Próximo desafio do DevDojo:
        // Calcular o preço final de um produto
        // aplicando um percentual de desconto.

        double precoProduto= 200.00;
        double desconto = 0.10;
        double valorTotalDesconto = precoProduto * desconto;
        double valorFinalProduto =  precoProduto - valorTotalDesconto;

        System.out.printf("Preço: %.2f%n", precoProduto);
        System.out.printf("Desconto: %.0f%%%n", desconto * 100);
        System.out.printf("Valor do desconto: %.2f%n", valorTotalDesconto);
        System.out.printf("Valor final do produto: %.2f%n", valorFinalProduto);
    }
}
