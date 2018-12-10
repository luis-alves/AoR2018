/**
 * @sid: 2012
 * @aid: 9.3
 */
public class Defesa extends Jogador{

    private int numRecuperacaoBola;
    private int numFaltasCometidas;
    private double racio;

    public Defesa(String nome, int numCamisola) {
        super(nome, numCamisola);
    }

    Defesa(String nome, int numCamisola, int numRecuperacaoBola, int numFaltasCometidas) {
        super(nome, numCamisola);
        this.numRecuperacaoBola = numRecuperacaoBola;
        this.numFaltasCometidas = numFaltasCometidas;
        this.racio = racioRF();
    }

    private double racioRF() {
        if (this.numFaltasCometidas != 0) {
            return (this.numRecuperacaoBola * 2) / (double) this.numFaltasCometidas;
        } else {
            return this.numRecuperacaoBola * 4;
        }
    }

    double getRacio() {
        return this.racio;
    }

    void setNumRecuperacaoBola(int numRecuperacaoBola) {
        this.numRecuperacaoBola = numRecuperacaoBola;
    }

    void setNumFaltasCometidas(int numFaltasCometidas) {
        this.numFaltasCometidas = numFaltasCometidas;
    }

    int getNumRecuperacaoBola() {
        return numRecuperacaoBola;
    }

    int getNumFaltasCometidas() {
        return numFaltasCometidas;
    }
}
