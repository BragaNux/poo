// Código Brayan

import java.util.ArrayList;
import java.util.List;

public class Frota 
{
    List<Veiculo> veiculos;
    List<Viagem> viagens;

    public Frota() 
    {
        veiculos = new ArrayList<>();
        viagens = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo)
    {
        veiculos.add(veiculo);
        System.out.println("Veículo adicionado: " + veiculo.modelo);
    }

    public void registrarViagem(Veiculo veiculo, Motorista motorista, String origem, String destino, double distancia)
    {
        Viagem viagem = new Viagem(veiculo, motorista, origem, destino, distancia);
        viagens.add(viagem);
        System.out.println("Viagem registrada");
    }

    public void listarViagensPorVeiculo(String placa)
    {
        System.out.println("Viagens do veículo com placa: " + placa);
        for (Viagem viagem : viagens) 
        {
            if (viagem.veiculo.placa.equals(placa)) 
            {
                System.out.println(viagem.origem + " para " + viagem.destino);
            }
        }
    }

    public double calcularQuilometragemTotal() 
    {
        double total = 0;
        for (Viagem viagem : viagens) 
        {
            total += viagem.distancia;
        }
        return total;
    }
}

// Código chatgpt

import java.util.ArrayList;
import java.util.List;

public class Frota {
    private List<Veiculo> veiculos;
    private List<Viagem> viagens;

    public Frota() {
        veiculos = new ArrayList<>();
        viagens = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
        System.out.println("Veículo adicionado: " + veiculo.getModelo());
    }

    public void registrarViagem(Veiculo veiculo, Motorista motorista, String origem, String destino, double distancia) {
        if (veiculos.contains(veiculo)) {
            Viagem viagem = new Viagem(veiculo, motorista, origem, destino, distancia);
            viagens.add(viagem);
            System.out.println("Viagem registrada: " + origem + " para " + destino);
        } else {
            System.out.println("Veículo não registrado na frota.");
        }
    }

    public void listarViagensPorVeiculo(String placa) {
        System.out.println("Viagens do veículo com placa: " + placa);
        for (Viagem viagem : viagens) {
            if (viagem.getVeiculo().getPlaca().equals(placa)) {
                System.out.println(viagem.getOrigem() + " para " + viagem.getDestino());
            }
        }
    }

    public double calcularQuilometragemTotal() {
        double total = 0;
        for (Viagem viagem : viagens) {
            total += viagem.getDistancia();
        }
        return total;
    }
}

