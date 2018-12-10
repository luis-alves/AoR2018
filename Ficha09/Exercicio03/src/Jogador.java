/**
 * @sid: 2012
 * @aid: 9.3
 */
public class Jogador {

    private String nome;
    private int numCamisola;
    private String clube;


    public Jogador() {
        this.nome = "";
        this.numCamisola = 0;
        this.clube = "";
    }

    public Jogador(String nome, int numCamisola) {
        this.nome = nome;
        this.numCamisola = numCamisola;
    }

    public String getNome() {
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
