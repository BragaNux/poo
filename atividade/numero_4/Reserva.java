// Código Brayan

import java.util.Date;

public class Reserva 
{
    Quarto quarto;
    Cliente cliente;
    Date dataCheckIn;
    Date dataCheckOut;

    public Reserva(Quarto quarto, Cliente cliente, Date dataCheckIn, Date dataCheckOut) 
    {
        this.quarto = quarto;
        this.cliente = cliente;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
    }
}


// Código chatgpt

import java.util.Date;

public class Reserva {
    private Quarto quarto;
    private Cliente cliente;
    private Date dataCheckIn;
    private Date dataCheckOut;

    public Reserva(Quarto quarto, Cliente cliente, Date dataCheckIn, Date dataCheckOut) {
        this.quarto = quarto;
        this.cliente = cliente;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Date getDataCheckIn() {
        return dataCheckIn;
    }

    public Date getDataCheckOut() {
        return dataCheckOut;
    }
}
