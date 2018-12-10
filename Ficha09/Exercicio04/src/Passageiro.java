import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @sid 2012
 * @aid 9.4
 */
class Passageiro {

    private String nome;
    private long numBI;
    private String nacionalidade;
    private LocalDate dataNacimento;
    private char genero;
    private ArrayList<Voo> listaReservas = new ArrayList<>();

    Passageiro(String nome, long numBI, String nacionalidade, LocalDate dataNacimento, char genero) {
        this.nome = nome;
        this.numBI = numBI;
        this.nacionalidade = nacionalidade;
        this.dataNacimento = dataNacimento;
        this.genero = genero;
    }

    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    long getNumBI() {
        return numBI;
    }

    void setNumBI(long numBI) {
        this.numBI = numBI;
    }

    String getNacionalidade() {
        return nacionalidade;
    }

    void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    LocalDate getDataNacimento() {
        return dataNacimento;
    }

    void setDataNacimento(LocalDate dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    char getGenero() {
        return genero;
    }

    void setGenero(char genero) {
        this.genero = genero;
    }

    void removerVoo(Voo voo) {
        this.listaReservas.remove(voo);
    }

    void setListaReservas(Voo voo) {
        this.listaReservas.add(voo);
    }

    void getListaReservas() {
        if (this.listaReservas.size() > 0) {
            System.out.format("O passageiro %s, tem as seguintes reservas:%n", this.getNome());
            for (Voo voo : this.listaReservas) {
                System.out.format("Voo com origem em %s e destino em %s, no dia %tF às %tR.%n", voo.getOrigem(), voo.getDestino(), voo.getHoraPartida(), voo.getHoraPartida());
            }
            System.out.println();
        } else
            System.out.println("O passageiro não tem nenhuma reserva.");
    }

}
