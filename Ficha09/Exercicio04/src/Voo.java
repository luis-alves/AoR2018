import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @sid 2012
 * @aid 9.4
 */
class Voo {

    private int numVoo;
    private String modeloAviao;
    private String origem;
    private String destino;
    private LocalDateTime horaPartida;
    private LocalDateTime horaChegada;
    private int milhas;
    private int numLugaresMax;
    private ArrayList<Passageiro> passageiros = new ArrayList<>();
    private int qtPassageiros;

    Voo(int numVoo, String modeloAviao, String origem, String destino, LocalDateTime horaPartida, LocalDateTime horaChegada, int milhas, int numLugaresMax) {
        this.numVoo = numVoo;
        this.modeloAviao = modeloAviao;
        this.origem = origem;
        this.destino = destino;
        this.horaPartida = horaPartida;
        this.horaChegada = horaChegada;
        this.milhas = milhas;
        this.numLugaresMax = numLugaresMax;
        this.qtPassageiros = 0;
    }

    int getNumVoo() {
        return numVoo;
    }

    void setNumVoo(int numVoo) {
        this.numVoo = numVoo;
    }

    String getModeloAviao() {
        return modeloAviao;
    }

    void setModeloAviao(String modeloAviao) {
        this.modeloAviao = modeloAviao;
    }

    String getOrigem() {
        return origem;
    }

    void setOrigem(String origem) {
        this.origem = origem;
    }

    String getDestino() {
        return destino;
    }

    void setDestino(String destino) {
        this.destino = destino;
    }

    LocalDateTime getHoraPartida() {
        return horaPartida;
    }

    void setHoraPartida(LocalDateTime horaPartida) {
        this.horaPartida = horaPartida;
    }

    LocalDateTime getHoraChegada() {
        return horaChegada;
    }

    void setHoraChegada(LocalDateTime horaChegada) {
        this.horaChegada = horaChegada;
    }

    int getMilhas() {
        return milhas;
    }

    void setMilhas(int milhas) {
        this.milhas = milhas;
    }

    int getNumLugaresMax() {
        return numLugaresMax;
    }

    void setNumLugaresMax(int numLugaresMax) {
        this.numLugaresMax = numLugaresMax;
    }

    int getQtPassageiros() {
        return qtPassageiros;
    }

    ArrayList<Passageiro> getPassageiros() {
        return passageiros;
    }

    void aumentarQtPassageiros() {
        this.qtPassageiros += 1;
    }

    void diminuirQtPassageiros() {
        this.qtPassageiros -= 1;
    }

    boolean reservarPassagem(Passageiro passageiro) {
        if (this.qtPassageiros <= this.numLugaresMax) {
            this.passageiros.add(passageiro);
            if (passageiro instanceof PassageiroFrequente) {
                PassageiroFrequente p = ((PassageiroFrequente) passageiro);
                p.setNumMilhas(p.getNumMilhas() + this.getMilhas());
            }
            passageiro.setListaReservas(this);
            aumentarQtPassageiros();
            return true;
        }
        return false;
    }

    void removerReserva(Passageiro p) {
        this.passageiros.remove(p);
    }

}
