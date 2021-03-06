import java.util.Arrays;

/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 8.7
 */
public class Turma {
    String nome;
    int quantidadeAlunosMax;
    Aluno[] alunos;
    
    public Turma(String nome, int numMaxAlunos) {
        this.nome = nome;
        this.quantidadeAlunosMax = numMaxAlunos;
        this.alunos = new Aluno[this.quantidadeAlunosMax];
    }
    
    public void adicionarAluno(Aluno a) {
        boolean existeAluno = jaExiteAluno(a);
        
        int index = -1;
        if (!existeAluno) {

            for (int j = 0; j < this.alunos.length; j++) {
                if (this.alunos[j] == null) {
                    index = j;
                }
            }
        } else {
            System.out.println("Ja existe o aluno na turma.");
        }
        
        if (index >= 0) {
            this.alunos[index] = a; 
        } else {
            System.out.println("A turma está cheia.");
        }
    }
    
    private boolean jaExiteAluno(Aluno a) {
        for (int i = 0; i < this.alunos.length; i++) {
            if (a.equals(this.alunos[i])) {
                return true;
            } 
        }
        return false;
        
    }
    
    public void qualAlunoMaisAlto(char sexo) {
        Aluno maisAltoAluno = new Aluno();
        maisAltoAluno.setAltura(0);
        for (Aluno aluno : this.alunos) {
            if (aluno != null) {
                if (aluno.getSexo() == sexo && aluno.getAltura() > maisAltoAluno.getAltura()) {
                    maisAltoAluno = aluno;
                } 
            }
        }
        System.out.println("O aluno mais alto do sexo " + sexo + " é " + 
                               maisAltoAluno.getPrimeiroNome() + " " +
                               maisAltoAluno.getSegundoNome());
    }

    
    public void removerAluno(Aluno a) {
        for (int i = 0; i < this.alunos.length; i++) {
            if (this.alunos[i] == a ) {
                this.alunos[i] = null; 
            }
        }
    }

    public void getAlunos() {
        System.out.print("Alunos:"); 
        for (int i = 0; i < this.alunos.length; i++) {
            if (this.alunos[i] != null) {
                System.out.print(" " + this.alunos[i].getPrimeiroNome());
            }
        }
        System.out.println();
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
    
    public boolean eAluno(Aluno aluno) {
        int contador = 0;
        for (Aluno aluno1 : alunos) {
            if (aluno.equals(aluno1)) {
                contador++;
            }
        }
        return contador == 1;
    }
    
    
}
