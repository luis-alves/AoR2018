
/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 8.13
 */
public class Informatica {
    private String nome;
    private String morada;
    private Disciplina[] disciplinas;
    private Aluno[] alunos;
    
    public Informatica(String nome, String morada) {
        super();
        this.nome = nome;
        this.morada = morada;
        disciplinas = new Disciplina[4]; 
    }

    public String getNome() {
        return nome;
    }

    public String getMorada() {
        return morada;
    }

    public void getDisciplinas() {
        System.out.println("As disciplinas do Departamento são as de: ");
        for (int i = 0; i < disciplinas.length; i++) {
            System.out.println("- " + disciplinas[i]);
        }
    }

    public void adicionarDisciplina(Disciplina disciplina) {
       int index = procurarLocalArmazem();
       
       this.disciplinas[index] = disciplina; 
    }
    
    private int procurarLocalArmazem() {
        int index = this.disciplinas.length;
        for (int i = 0; i < this.disciplinas.length; i++) {
            if (disciplinas[i] == null) {
                return i;
            }
        }
        Disciplina[] temp = new Disciplina[disciplinas.length*2]; 
        for (int i = 0; i < this.disciplinas.length; i++) {
            temp[i] = disciplinas[i]; 
        }
        this.disciplinas = temp;
        return index;
    }

    public void inscreverAlunoCurso(Aluno aluno) {
        int index = procurarLocalArmazem();

        this.alunos[index] = aluno;
    }

    public void removerAlunoCurso(Aluno aluno) {
        for (int i = 0; i < this.alunos.length; i++) {
            if (alunos[i] == aluno) {
                alunos[i] = null;
            }
        }
    }
    
    
    
    
    
    
}
