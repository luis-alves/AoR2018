/**
 * @sid; 2012
 * @aid: 9.3
 */
public class GuardaRedes extends Jogador {

    private int numGolosSofridos;

    public GuardaRedes(String nome, int numCamisola) {
        super(nome, numCamisola);
        this.numGolosSofridos = 0;
    }

    public GuardaRedes(String nome, int numCamisola, int numGolosSofridos) {
        super(nome, numCamisola);
        this.numGolosSofridos = numGolosSofridos;
    }

    public void setNumGolosSofridos(int numGolosSofridos) {
        this.numGolosSofridos = numGolosSofridos;
    }

    public int getNumGolosSofridos() {
        return numGolosSofridos;
    }

}
