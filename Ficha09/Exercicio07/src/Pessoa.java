/**
 * @sid 2012
 * @aid 9.7
 */
public class Pessoa {
    private String nome;
    private int numAcompanhantes;
    private int valorAPagar;

    Pessoa(String nome, int numAcompanhantes) {
        this.nome = nome;
        this.numAcompanhantes = numAcompanhantes;
    }

    public void setValorAPagar(int valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

    public int getNumAcompanhantes() {
        return numAcompanhantes;
    }

    public String getNome() {
        return nome;
    }

    int getValorAPagar() {
        return valorAPagar;
    }

    void toString(int x) {
        System.out.println("" + x);
    }
}
