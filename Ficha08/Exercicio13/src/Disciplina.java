/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 8.13
 */
public class Disciplina {
    private String nome;
    private String professor;
    private int anoRealizacao;
    private Turma[] turmas;

    public Disciplina(String nome, String professor, int ano) {
        super();
        this.nome = nome;
        this.professor = professor;
        this.anoRealizacao = ano;
    }

    public String getNome() {
        return nome;
    }

    public String getProfessor() {
        return professor;
    }

    public int getAnoRealizacao() {
        return anoRealizacao;
    }




}
