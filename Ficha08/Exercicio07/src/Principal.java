/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 8.7
 */
public class Principal {

    public static void main(String[] args) {
        Aluno luisAlves = new Aluno("Luís", "Alves", 43);
        Aluno artur = new Aluno("Artur", "Oliveira", 43);
        Aluno maria = new Aluno("Maria", "Conceição", 43);
        Aluno marta = new Aluno("Marta", "Sousa", 43);
        
        Turma matematica = new Turma("Matemática", 10);
        matematica.adicionarAluno(luisAlves);
        luisAlves.setAltura(175);
        luisAlves.setSexo('M');
        artur.setAltura(156);
        artur.setSexo('M');
        maria.setAltura(167);
        maria.setSexo('F');
        marta.setAltura(189);
        marta.setSexo('F');
        matematica.adicionarAluno(artur);
        matematica.adicionarAluno(maria);
        matematica.adicionarAluno(marta);
//        matematica.removerAluno(maria);
        matematica.getAlunos();
        matematica.qualAlunoMaisAlto('M');
        matematica.qualAlunoMaisAlto('F');
    }

}
