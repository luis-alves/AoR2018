
/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 8.13
 */
public class Principal {

    public static void main(String[] args) {
        Informatica depEngInformatica = new Informatica("Departamento Engenharia Informática",
                        " Rua não sei qual, Coimbra");

        Disciplina matematica = new Disciplina("Matemática","José António", 2018);
        Disciplina intelArteficial = new Disciplina("Inteligência Artifical", "Luís Alves", 2018);
        Disciplina algoritmos = new Disciplina("Algoritmos","Luís Alves",2018);
        Disciplina fisica = new Disciplina("Fisíca", "Artur Ferreira", 2018);
        Disciplina baseDados = new Disciplina("Base de Dados", "Ricardo Gonçalves",  2018);
        Disciplina java = new Disciplina("Introd. Java", "Maria Lurdes", 2018);

        
        Aluno jorgeLuis = new Aluno();
        jorgeLuis.setNome("Jorge Luís");
        jorgeLuis.setNumId(1234);

        Aluno luisAntonio = new Aluno();
        jorgeLuis.setNome("Luís António");
        jorgeLuis.setNumId(1235);
        
        Aluno joseRato = new Aluno();
        jorgeLuis.setNome("José Rato");
        jorgeLuis.setNumId(1236);

        Aluno miguelAlves = new Aluno();
        jorgeLuis.setNome("Miguel Alves");
        jorgeLuis.setNumId(1237);

        Aluno manuelFrancisco = new Aluno();
        jorgeLuis.setNome("Manuel Francisco");
        jorgeLuis.setNumId(1238);


    }

}
