// 1. Produto:
// O que faz: Guarda o nome e o preço de um item.
// Papel: Representa o que é vendido.
class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}

// 2. Cliente:
// O que faz: Guarda o nome do comprador.
// Papel: Identifica quem compra.
class Cliente {
    String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }
}

// 3. Venda:
// O que faz: Junta o cliente e uma lista de produtos. Calcula o total.
// Papel: Representa a operação de compra, o "carrinho".
public class Venda {
    Cliente cliente;
    Produto[] produtos;
    double valorTotal;
    int quantidadeDeProdutos;

    public Venda(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new Produto[10];
        this.valorTotal = 0.0;
        this.quantidadeDeProdutos = 0;
    }

    public void adicionarProduto(Produto produto) {
        if (quantidadeDeProdutos < produtos.length) {
            this.produtos[quantidadeDeProdutos] = produto;
            this.valorTotal += produto.preco;
            this.quantidadeDeProdutos++;
        } else {
            System.out.println("Carrinho está cheio! Não é possível adicionar mais produtos.");
        }
    }

    public void exibirResumo() {
        System.out.println("\n--- Resumo da Venda ---");
        System.out.println("Cliente: " + this.cliente.nome);
        System.out.println("Produtos:");
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            Produto p = produtos[i];
            System.out.println("- " + p.nome + " (R$ " + String.format("%.2f", p.preco) + ")");
        }
        System.out.println("Total: R$ " + String.format("%.2f", this.valorTotal));
        System.out.println("-----------------------");
    }
}
