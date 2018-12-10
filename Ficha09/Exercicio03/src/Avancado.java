/**
 * @sid: 2012
 * @aid: 9.3
 */
public class Avancado extends Jogador{

    private int numGolosMarcados;

    Avancado(String nome, int numCamisola) {
        super(nome, numCamisola);
    }

    Avancado(String nome, int numCamisola, int numGolosMarcados) {
        super(nome, numCamisola);
        this.numGolosMarcados = numGolosMarcados;
    }

    void setNumGolosMarcados(int numGolosMarcados) {
        this.numGolosMarcados = numGolosMarcados;
    }

    int getNumGolosMarcados() {
        return numGolosMarcados;
    }
}
