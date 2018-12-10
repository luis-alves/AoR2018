/**
 * @sid 2012
 * @aid 9.7
 */
public class Main {

    public static void main(String[] args) {
        Aluno luis = new AlunoBSc("Luis", 2, 1993, 12);
        Aluno jose = new AlunoDoutoramento("José", 3, 1993, "Astronomia");
        Aluno maria = new AlunoDoutoramento("Maria", 1, 1993, "Programação");
        Aluno andre = new AlunoMestrado("André", 3, 1993, 12);
        Departamento dei = new Departamento("DEI", "Rua a li");

        dei.convida(luis);
        dei.convida(jose);
        dei.convida(maria);
        dei.convida(andre);
        dei.imprimirListaPessoasInscritas();
        luis.toString(luis.getValorAPagar());
        dei.imprimirPorCategorias();

    }
}
