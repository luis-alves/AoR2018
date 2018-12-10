/**
 * @sid 2012
 * @aid 9.7
 */
class AlunoDoutoramento extends Aluno {
    private String temaTese;

    public AlunoDoutoramento(String nome, int numAcompanhantes, int anoEntrada, String temaTese) {
        super(nome, numAcompanhantes, anoEntrada);
        this.temaTese = temaTese;
    }
}
