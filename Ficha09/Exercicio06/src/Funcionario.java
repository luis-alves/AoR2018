/**
 * @sid 2012
 * @aid 9.6
 */
public class Funcionario extends Jogador {

    private long numTelefone;
    private long id;

    public Funcionario(String nome, int idade) {
        super(nome, idade);
    }

    public Funcionario(String nome, int idade, long numTelefone, long id) {
        super(nome, idade);
        this.numTelefone = numTelefone;
        this.id = id;
    }

    public long getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(long numTelefone) {
        this.numTelefone = numTelefone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
