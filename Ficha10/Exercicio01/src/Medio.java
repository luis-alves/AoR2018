/**
 * @sid: 2012
 * @aid: 10.1
 */
public class Medio extends Jogador {

    private int numGolosMarcados;
    private int numAssitencias;
    private double racio;

    Medio(String nome, int numCamisola) {
        super(nome, numCamisola);
    }

    Medio(String nome, int numCamisola, int numGolosMarcados, int numAssitencias) {
        super(nome, numCamisola);
        this.numGolosMarcados = numGolosMarcados;
        this.numAssitencias = numAssitencias;
        this.racio = pontuacao();
    }

    double pontuacao() {
        return this.numGolosMarcados * 1.5 + numAssitencias;
    }

    void setNumGolosMarcados(int numGolosMarcados) {
        this.numGolosMarcados = numGolosMarcados;
    }

    void setNumAssitencias(int numAssitencias) {
        this.numAssitencias = numAssitencias;
    }

    int getNumGolosMarcados() {
        return numGolosMarcados;
    }

    int getNumAssitencias() {
        return numAssitencias;
    }
}
