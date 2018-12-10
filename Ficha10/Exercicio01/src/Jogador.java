
/**
 * @sid: 2012
 * @aid: 10.1
 */
public abstract class Jogador {

    private String nome;
    private int numCamisola;
    private String clube;


    Jogador() {
        this.nome = "";
        this.numCamisola = 0;
        this.clube = "";
    }

    Jogador(String nome, int numCamisola) {
        this.nome = nome;
        this.numCamisola = numCamisola;
    }

    abstract double pontuacao();

    int tipoJogador() {
        if (this instanceof GuardaRedes) {
            return 1;
        } else if (this instanceof Defesa) {
            return 2;
        } else if (this instanceof Medio) {
            return 3;
        } else if (this instanceof Avancado) {
            return 4;
        }
        return -1;
    }

    String getNome() {
        return nome;
    }

    public int getNumCamisola() {
        return numCamisola;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }
}
