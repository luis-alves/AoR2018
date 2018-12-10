/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 8.13
 */
public class Turma {
    private String nome;
    private int horaInicio;
    private int duracao;
    private int limiteSala;
    private Aluno[] alunos;
    private int numAlunos;

    public Turma(String nome, int horaInicio, int duracao, int limiteSala) {
        super();
        this.nome = nome;
        this.horaInicio = horaInicio;
        this.limiteSala = limiteSala;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getLimiteSala() {
        return limiteSala;
    }

    public int getDuracao() {
        return duracao;
    }




}
