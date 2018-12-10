/**
 * @sid 2012
 * @aid 9.7
 */
public class Funcionario extends Pessoa {
    private String categoria;

    public Funcionario(String nome, int numAcompanhantes, String categoria) {
        super(nome, numAcompanhantes);
        this.categoria = categoria;
    }
}
