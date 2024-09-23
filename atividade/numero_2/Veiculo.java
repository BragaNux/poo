// Código Brayan

public class Veiculo
{
    String modelo;
    String placa;
    int capacidade;

    public Veiculo(String modelo, String placa, int capacidade)
    {
        this.modelo = modelo;
        this.placa = placa;
        this.capacidade = capacidade;
    }
}

// Código chatgpt


public class Veiculo {
    private String modelo;
    private String placa;
    private int capacidade;

    public Veiculo(String modelo, String placa, int capacidade) {
        this.modelo = modelo;
        this.placa = placa;
        this.capacidade = capacidade;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getCapacidade() {
        return capacidade;
    }
}
