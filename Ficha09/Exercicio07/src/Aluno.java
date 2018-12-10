/**
 * @sid 2012
 * @aid 9.7
 */
public class Aluno extends Pessoa {
    private int anoEntrada;

    public Aluno(String nome, int numAcompanhantes, int anoEntrada) {
        super(nome, numAcompanhantes);
        this.anoEntrada = anoEntrada;
    }
}
