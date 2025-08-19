public class MainVenda {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Juliana Paes");
        Produto produto1 = new Produto("Cadeira de Escritório", 800.00);
        Produto produto2 = new Produto("Monitor 24 polegadas", 1200.00);

        Venda venda = new Venda(cliente);
        venda.adicionarProduto(produto1);
        venda.adicionarProduto(produto2);

        venda.exibirResumo();

        System.out.println("\n--- Processamento do Pagamento ---");

        System.out.println("Opção à vista: R$ " + String.format("%.2f", venda.valorTotal));

        int parcelas = 12;
        double juros = 0.15;
        double valorFinal = venda.valorTotal * (1 + juros);
        double valorParcela = valorFinal / parcelas;
        System.out.println("Opção em " + parcelas + "x: R$ " + String.format("%.2f", valorParcela) + " por mês.");
        System.out.println("----------------------------------");
    }
}