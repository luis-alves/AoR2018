/**
 * @sid: 2012
 * @aid: 9.3
 */
public class Medio extends Jogador{

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
        this.racio = racioRF();
    }

    private double racioRF() {
        return this.numGolosMarcados * 1.5 + numAssitencias;
    }

    double getRacio() {
        return racio;
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
