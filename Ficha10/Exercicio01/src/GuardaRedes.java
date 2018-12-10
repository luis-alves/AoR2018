/**
 * @sid; 2012
 * @aid: 10.1
 */
public class GuardaRedes extends Jogador {

    private double numGolosSofridos;

    public GuardaRedes(String nome, int numCamisola) {
        super(nome, numCamisola);
        this.numGolosSofridos = this.pontuacao();
    }

    public GuardaRedes(String nome, int numCamisola, int numGolosSofridos) {
        super(nome, numCamisola);
        this.numGolosSofridos = numGolosSofridos;
    }

    public void setNumGolosSofridos(double numGolosSofridos) {
        this.numGolosSofridos = numGolosSofridos;
    }

    double pontuacao() {
        return this.numGolosSofridos;
    }

}
