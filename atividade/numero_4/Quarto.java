// Código Brayan

public class Quarto 
{
    String numero;
    String tipo; // simples, duplo, suíte
    boolean disponibilidade;

    public Quarto(String numero, String tipo) 
    {
        this.numero = numero;
        this.tipo = tipo;
        this.disponibilidade = true;
    }
}


// Código chatgpt

public class Quarto {
    private String numero;
    private String tipo; // simples, duplo, suíte
    private boolean disponibilidade;

    public Quarto(String numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.disponibilidade = true;
    }

    public String getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
