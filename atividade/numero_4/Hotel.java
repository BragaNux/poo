// Código Brayan

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hotel 
{
    List<Quarto> quartos;
    List<Reserva> reservas;

    public Hotel() 
    {
        quartos = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public void adicionarQuarto(Quarto quarto) 
    {
        quartos.add(quarto);
        System.out.println("Quarto adicionado: " + quarto.numero);
    }

    public void reservarQuarto(Quarto quarto, Cliente cliente, Date checkIn, Date checkOut) 
    {
        if (quarto.disponibilidade) 
        {
            Reserva reserva = new Reserva(quarto, cliente, checkIn, checkOut);
            reservas.add(reserva);
            quarto.disponibilidade = false;
            System.out.println("Reserva feita para o quarto: " + quarto.numero);
        } else 
        {
            System.out.println("Quarto indisponível");
        }
    }

    public void listarQuartosDisponiveis(String tipo) 
    {
        System.out.println("Quartos disponíveis do tipo: " + tipo);
        for (Quarto quarto : quartos) 
        {
            if (quarto.disponibilidade && quarto.tipo.equals(tipo)) 
            {
                System.out.println("Quarto: " + quarto.numero);
            }
        }
    }

    public void cancelarReserva(Quarto quarto) 
    {
        for (Reserva reserva : reservas) 
        {
            if (reserva.quarto.numero.equals(quarto.numero)) 
            {
                reservas.remove(reserva);
                quarto.disponibilidade = true;
                System.out.println("Reserva cancelada para o quarto: " + quarto.numero);
                break;
            }
        }
    }

    public void gerarRelatorioReservasFuturas() 
    {
        System.out.println("Relatório de reservas futuras:");
        for (Reserva reserva : reservas) 
        {
            System.out.println("Quarto: " + reserva.quarto.numero + " - Cliente: " + reserva.cliente.nome);
        }
    }
}


// Código chatgpt

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hotel {
    private List<Quarto> quartos;
    private List<Reserva> reservas;

    public Hotel() {
        quartos = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
        System.out.println("Quarto adicionado: " + quarto.getNumero());
    }

    public void reservarQuarto(Quarto quarto, Cliente cliente, Date checkIn, Date checkOut) {
        if (quarto.isDisponivel()) {
            Reserva reserva = new Reserva(quarto, cliente, checkIn, checkOut);
            reservas.add(reserva);
            quarto.setDisponibilidade(false);
            System.out.println("Reserva feita para o quarto: " + quarto.getNumero());
        } else {
            System.out.println("Quarto indisponível");
        }
    }

    public void listarQuartosDisponiveis(String tipo) {
        System.out.println("Quartos disponíveis do tipo: " + tipo);
        for (Quarto quarto : quartos) {
            if (quarto.isDisponivel() && quarto.getTipo().equals(tipo)) {
                System.out.println("Quarto: " + quarto.getNumero());
            }
        }
    }

    public void cancelarReserva(Quarto quarto) {
        for (Reserva reserva : reservas) {
            if (reserva.getQuarto().getNumero().equals(quarto.getNumero())) {
                reservas.remove(reserva);
                quarto.setDisponibilidade(true);
                System.out.println("Reserva cancelada para o quarto: " + quarto.getNumero());
                break;
            }
        }
    }

    public void gerarRelatorioReservasFuturas() {
        System.out.println("Relatório de reservas futuras:");
        for (Reserva reserva : reservas) {
            System.out.println("Quarto: " + reserva.getQuarto().getNumero() + " - Cliente: " + reserva.getCliente().getNome());
        }
    }
}
