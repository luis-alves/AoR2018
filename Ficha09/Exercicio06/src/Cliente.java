import java.util.ArrayList;

/**
 * @sid 2012
 * @aid 9.6
 */
public class Cliente extends Jogador {

    private long numTelefone;
    private ArrayList<Aposta> apostas;

    public Cliente(String nome, int idade) {
        super(nome, idade);
        this.apostas = new ArrayList<>();
    }

    public Cliente(String nome, int idade, long numTelefone) {
        super(nome, idade);
        this.numTelefone = numTelefone;
        this.apostas = new ArrayList<>();
    }

    public long getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(long numTelefone) {
        this.numTelefone = numTelefone;
    }

}
