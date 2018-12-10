/**
 * @sid 2012
 * @aid 9.7
 */
public class Docente extends Pessoa {
    private String grau;

    public Docente(String nome, int numAcompanhantes, String grau) {
        super(nome, numAcompanhantes);
        this.grau = grau;
    }
}
