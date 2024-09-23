// Código Brayan

public class Viagem
 {
    Veiculo veiculo;
    Motorista motorista;
    String origem;
    String destino;
    double distancia;

    public Viagem(Veiculo veiculo, Motorista motorista, String origem, String destino, double distancia) 
    {
        this.veiculo = veiculo;
        this.motorista = motorista;
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
    }
}

// Código chatgpt

public class Viagem {
    private Veiculo veiculo;
    private Motorista motorista;
    private String origem;
    private String destino;
    private double distancia;

    public Viagem(Veiculo veiculo, Motorista motorista, String origem, String destino, double distancia) {
        this.veiculo = veiculo;
        this.motorista = motorista;
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public double getDistancia() {
        return distancia;
    }
}

