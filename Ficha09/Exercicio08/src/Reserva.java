import java.time.LocalDate;

/**
 * @sid 2012
 * @aid 9.8
 */
class Reserva {
    private int codigoReserva;
    private LocalDate dataEntrada;
    private int tempoEstadia;
    private Cliente cliente;
    private String tipoQuarto;
    private int numReserva;
    private double custo;

    Reserva(LocalDate dataEntrada, int tempoEstadia, Cliente cliente, String tipoQuarto, int numReserva) {
        this.dataEntrada = dataEntrada;
        this.tempoEstadia = tempoEstadia;
        this.cliente = cliente;
        this.tipoQuarto = tipoQuarto;
        this.numReserva = numReserva;
    }

    int getCodigoReserva() {
        return codigoReserva;
    }

    void setCodigoReserva(int codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    LocalDate getDataEntrada() {
        return dataEntrada;
    }

    void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    int getTempoEstadia() {
        return tempoEstadia;
    }

    void setTempoEstadia(int tempoEstadia) {
        this.tempoEstadia = tempoEstadia;
    }

    Cliente getCliente() {
        return cliente;
    }

    void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    String getTipoQuarto() {
        return tipoQuarto;
    }

    void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }
}
