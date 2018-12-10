/**
 * @sid: 2012
 * @aid: 10.1
 */
public class Avancado extends Jogador {

    private double numGolosMarcados;

    Avancado(String nome, int numCamisola) {
        super(nome, numCamisola);
    }

    Avancado(String nome, int numCamisola, int numGolosMarcados) {
        super(nome, numCamisola);
        this.numGolosMarcados = numGolosMarcados;
    }

    void setNumGolosMarcados(double numGolosMarcados) {
        this.numGolosMarcados = numGolosMarcados;
    }

    double pontuacao() {
        return this.numGolosMarcados;
    }
}
