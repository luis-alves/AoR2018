/**
 * @sid 2012
 * @aid 9.7
 */
public class AlunoMestrado extends Aluno {
    private double mediaEntrada;

    public AlunoMestrado(String nome, int numAcompanhantes, int anoEntrada, double mediaEntrada) {
        super(nome, numAcompanhantes, anoEntrada);
        this.mediaEntrada = mediaEntrada;
    }
}
