// Código Brayan

import java.util.ArrayList;
import java.util.List;

public class LojaVirtual 
{
    List<Produto> produtos;
    List<Pedido> pedidos;

    public LojaVirtual() 
    {
        produtos = new ArrayList<>();
        pedidos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) 
    {
        produtos.add(produto);
        System.out.println("Produto adicionado à loja: " + produto.nome);
    }

    public void processarPedido(Pedido pedido) 
    {
        for (Produto produto : pedido.carrinho.produtos) {
            produto.estoque--;
        }
        pedido.status = "enviado";
        pedidos.add(pedido);
        System.out.println("Pedido processado");
    }

    public void atualizarEstoque(Produto produto, int quantidade) 
    {
        produto.estoque += quantidade;
        System.out.println("Estoque atualizado para o produto: " + produto.nome);
    }

    public double calcularTotalCarrinho(CarrinhoDeCompras carrinho) 
    {
        double total = 0;
        for (Produto produto : carrinho.produtos) 
        {
            total += produto.preco;
        }
        return total;
    }

    public void gerarRelatorioVendas() 
    {
        System.out.println("Relatório de vendas:");
        for (Pedido pedido : pedidos) 
        {
            System.out.println("Pedido: " + pedido.data + " - Status: " + pedido.status);
        }
    }
}

// Código do chatgpt

import java.util.ArrayList;
import java.util.List;

public class LojaVirtual {
    private List<Produto> produtos;
    private List<Pedido> pedidos;

    public LojaVirtual() {
        produtos = new ArrayList<>();
        pedidos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto '" + produto.getNome() + "' adicionado à loja.");
    }

    public void processarPedido(Pedido pedido) {
        for (Produto produto : pedido.getCarrinho().getProdutos()) {
            produto.setEstoque(produto.getEstoque() - 1);
        }
        pedido.setStatus("enviado");
        pedidos.add(pedido);
        System.out.println("Pedido processado.");
    }

    public void atualizarEstoque(Produto produto, int quantidade) {
        produto.setEstoque(produto.getEstoque() + quantidade);
        System.out.println("Estoque do produto '" + produto.getNome() + "' atualizado.");
    }

    public double calcularTotalCarrinho(CarrinhoDeCompras carrinho) {
        double total = 0;
        for (Produto produto : carrinho.getProdutos()) {
            total += produto.getPreco();
        }
        return total;
    }

    public void gerarRelatorioVendas() {
        System.out.println("Relatório de vendas:");
        for (Pedido pedido : pedidos) {
            System.out.println("Pedido realizado em: " + pedido.getData() + " - Status: " + pedido.getStatus());
        }
    }
}

