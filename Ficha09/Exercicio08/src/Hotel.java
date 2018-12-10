import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @sid 2012
 * @aid 9.8
 */
class Hotel {

    private String nome;
    private String morada;
    private int codigoCliente;
    private int numQuartosSimples;
    private int numQuartosDuplos;
    private double precoSimples;
    private double precoDuplo;
    private ArrayList<Cliente> clientes;
    private ArrayList<Reserva> reservas;
    private ArrayList<Empresa> empresas;
    private int numReserva;
    private double taxaDesconto;

    public Hotel(String nome, String morada) {
        this.nome = nome;
        this.morada = morada;
        this.numQuartosSimples = 20;
        this.numQuartosDuplos = 2;
        this.precoSimples = 10.3;
        this.precoDuplo = 15.4;
        this.clientes = new ArrayList<>();
        this.reservas = new ArrayList<>();
        this.empresas = new ArrayList<>();
        this.numReserva = 0;
        this.taxaDesconto = 0.15;
    }

    Reserva criarReserva(Cliente cliente, LocalDate data, int tempoEstadia, String tipoQuarto) {
        setNumReserva();
        Reserva r = new Reserva(data, tempoEstadia, cliente, tipoQuarto, getNumReserva());
        r.setCusto(tipoQuarto.equals("Simples") ? getPrecoSimples() :getPrecoDuplo());
        this.reservas.add(r);
        return r;
    }

    void alterarReserva(Reserva r, LocalDate data, int tempoEstadia, String tipoQuarto) {
        for (Reserva reserva: this.reservas) {
            if (reserva.equals(r)) {
                reserva.setDataEntrada(data);
            }
        }
    }

    void eliminarReserva(Reserva r) {
        this.reservas.remove(r);
        System.out.println("A reserva foi removida.");
    }

    boolean existeReserva(Reserva r) {
        return this.reservas.contains(r);
    }

    void listarReservas() {
        for (Reserva r: this.reservas) {
            if (r.getCliente() instanceof ClienteIndividual) {
                System.out.format("Reserva do cliente n.º %d no nome individual de: %s, com o contato telefonico de %s. Na data de %tF%n",
                        r.getCliente().getNumCliente(), r.getCliente().getNome(), r.getCliente().getTelefone(), r.getDataEntrada());
            } else if (r.getCliente() instanceof ClienteEmpresarial) {
                System.out.format("Reserva do cliente n.º %d no nome individual de: %s, com o contato telefonico de %s. Da empresa %s. Na data de %tF%n",
                        r.getCliente().getNumCliente(), r.getCliente().getNome(), r.getCliente().getTelefone(), ((ClienteEmpresarial) r.getCliente()).getEmpresa().getNome(), r.getDataEntrada());
            }
        }
    }

    Empresa criarRegistoEmpresa(String nome, String morada, String telefone, String nif) {
        Empresa e = new Empresa(nome, morada, telefone, nif);
        e.setTaxaDesconto(this.getTaxaDesconto());
        this.empresas.add(e);
        return e;
    }

    Cliente criarFichaClienteEmpresarial(String nome, String telefone, Empresa empresa) {
        Cliente c = new ClienteEmpresarial(nome, telefone, empresa);
        setCodigoCliente();
        c.setNumCliente(this.getCodigoCliente());
        this.clientes.add(c);
        return c;
    }

    Cliente criarFichaClienteIndividual(String nome, String telefone, String morada, String bi) {
        Cliente c = new ClienteIndividual(nome, telefone, morada, bi);
        setCodigoCliente();
        c.setNumCliente(this.getCodigoCliente());
        this.clientes.add(c);
        return c;
    }

    void modificarFichaClienteIndividual(Cliente cliente, String nome, String telefone, String morada, String bi) {
        for (Cliente c : this.clientes) {
            if (c.equals(cliente)) {
                c.setNome(nome);
                c.setTelefone(telefone);
                ((ClienteIndividual) c).setMorada(morada);
                ((ClienteIndividual) c).setNumBi(bi);
            }
        }
    }

    private double getTaxaDesconto() {
        return taxaDesconto;
    }

    private int getCodigoCliente() {
        return codigoCliente;
    }

    private void setCodigoCliente() {
        this.codigoCliente += 1;
    }

    private int getNumReserva() {
        return numReserva;
    }

    private void setNumReserva() {
        this.numReserva += 1;
    }

    String getNome() {
        return nome;
    }

    String getMorada() {
        return morada;
    }

    void setMorada(String morada) {
        this.morada = morada;
    }

    int getNumQuartosSimples() {
        return numQuartosSimples;
    }

    int getNumQuartosDuplos() {
        return numQuartosDuplos;
    }

    double getPrecoSimples() {
        return precoSimples;
    }

    double getPrecoDuplo() {
        return precoDuplo;
    }

    void setNumQuartosSimples(int numQuartosSimples) {
        this.numQuartosSimples = numQuartosSimples;
    }

    void setNumQuartosDuplos(int numQuartosDuplos) {
        this.numQuartosDuplos = numQuartosDuplos;
    }

    void setPrecoSimples(double precoSimples) {
        this.precoSimples = precoSimples;
    }

    void setPrecoDuplo(double precoDuplo) {
        this.precoDuplo = precoDuplo;
    }
}
