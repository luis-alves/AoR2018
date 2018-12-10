import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @sid 2012
 * @aid 9.4
 */
public class CompanhiaAeria {

    private String nome;
    private String pais;
    private ArrayList<Voo> voos;
    private ArrayList<Passageiro> passageiros;
    private int numPassFrequente;

    public CompanhiaAeria(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
        this.voos = new ArrayList<>();
        this.passageiros = new ArrayList<>();
        this.numPassFrequente = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumPassFrequente() {
        this.numPassFrequente = numPassFrequente + 1;
        return numPassFrequente;
    }

    public void setNumPassFrequente(int numPassFrequente) {
        this.numPassFrequente = numPassFrequente + 1;
    }

    void imprimirListaVoos() {
        System.out.println("Os voos agendados são os seguintes:");
        for (Voo v : voos) {
            System.out.format("Voo n.º %d, com origem em %s e destino em %s%n", v.getNumVoo(), v.getOrigem(), v.getDestino());
        }
        System.out.println();
    }

    void imprimirListaPassageiros(Voo voo) {
        System.out.format("As reservas para o voo n.º %d, com partida de %s e detino %s são as seguintes:%n", voo.getNumVoo(), voo.getOrigem(), voo.getDestino());
        for (Passageiro p : voo.getPassageiros()) {
            System.out.format("Passageiro com BI n.º %d e com nome: %s%n", p.getNumBI(), p.getNome());
        }
        System.out.println();
    }

    Passageiro criarPassageiro(String nome, long numBI, String nacionalidade, LocalDate dataNacimento, char genero) {
        Passageiro passageiro = new Passageiro(nome, numBI, nacionalidade, dataNacimento, genero);
        this.passageiros.add(passageiro);
        return passageiro;
    }

    Passageiro criarPassageiroFrequente(String nome, long numBI, String nacionalidade, LocalDate dataNacimento, char genero) {
        Passageiro passageiro = new PassageiroFrequente(nome, numBI, nacionalidade, dataNacimento, genero);
        if (this.passageiros.contains(passageiro)) {
            System.out.println("Não é necessário criar a ficha de cliente pois este já está na base de dados!");
            return null;
        }
        ((PassageiroFrequente) passageiro).setNumPassageiroFrequente(this.getNumPassFrequente());
        this.passageiros.add(passageiro);
        return passageiro;
    }

    Voo criarVooDomestico(int numVoo, String modeloAviao, String origem, String destino, LocalDateTime horaPartida, LocalDateTime horaChegada, int milhas, int numLugaresMax) {
        Voo voo = new VooDomestico(numVoo, modeloAviao, origem, destino, horaPartida, horaChegada, milhas, numLugaresMax);
        this.voos.add(voo);
        return voo;
    }

    Voo criarVooInternacional(int numVoo, String modeloAviao, String origem, String destino, LocalDateTime horaPartida, LocalDateTime horaChegada, int milhas, int numLugaresMax) {
        Voo voo = new VooInternacional(numVoo, modeloAviao, origem, destino, horaPartida, horaChegada, milhas, numLugaresMax);
        this.voos.add(voo);
        return voo;
    }

    void reservarPassagem(Passageiro passageiro, Voo voo) {
        boolean reserva = voo.reservarPassagem(passageiro);
        if (reserva) {
            passageiros.add(passageiro);
            System.out.println("Reserva efectuada!\n");
        } else
            System.out.println("Não foi possivel efectuar a reserva, porque o voo está totalmente reservado.");
    }

    void cancelarReserva(Passageiro p, Voo v) {
        p.removerVoo(v);
        v.removerReserva(p);
        System.out.println("A reserva foi cancelada com sucesso.");
        System.out.println();
    }

    void alterarReserva(Voo vooAdicionar, Passageiro p, Voo aCancelar) {
        System.out.println("Estamos a tentar cancelar a reserva...");
        this.cancelarReserva(p, aCancelar);
        System.out.println("Estamos a tentar reservar um novo voo...");
        this.reservarPassagem(p, vooAdicionar);
        System.out.println("O processo de alteração de reserva foi efetuada com sucesso.");
    }
}
