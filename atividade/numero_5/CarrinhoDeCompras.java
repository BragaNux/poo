// Código Brayan

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras 
{
    List<Produto> produtos;
    Cliente cliente;

    public CarrinhoDeCompras(Cliente cliente) 
    {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) 
    {
        produtos.add(produto);
        System.out.println("Produto adicionado ao carrinho: " + produto.nome);
    }

    public void removerProduto(Produto produto) 
    {
        produtos.remove(produto);
        System.out.println("Produto removido do carrinho: " + produto.nome);
    }
}

// Código do chatgpt

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos;
    private Cliente cliente;

    public CarrinhoDeCompras(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto '" + produto.getNome() + "' adicionado ao carrinho.");
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
        System.out.println("Produto '" + produto.getNome() + "' removido do carrinho.");
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }
}

