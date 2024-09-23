// Código Brayan

import java.util.Date;

public class Pedido 
{
    CarrinhoDeCompras carrinho;
    Date data;
    String status; // processando, enviado, entregue

    public Pedido(CarrinhoDeCompras carrinho, Date data, String status) 
    {
        this.carrinho = carrinho;
        this.data = data;
        this.status = status;
    }
}

// Código do chatgpt

import java.util.Date;

public class Pedido {
    private CarrinhoDeCompras carrinho;
    private Date data;
    private String status; // processando, enviado, entregue

    public Pedido(CarrinhoDeCompras carrinho, Date data, String status) {
        this.carrinho = carrinho;
        this.data = data;
        this.status = status;
    }

    public CarrinhoDeCompras getCarrinho() {
        return carrinho;
    }

    public Date getData() {
        return data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

