public class Principal {
    public static void main(String[] args) {
        Contato luis = new Contato("Luis", "Rua da li", "luis@dali,com", "1234");
        Contato ricardo = new Contato("Ricardo", "Rua da li", "ricardo@dali,com", "2339932");

        ListaDeContatos listaPessoal = new ListaDeContatos(3);

        listaPessoal.adicionarContato(luis);
        listaPessoal.adicionarContato(ricardo);

        listaPessoal.imprime();

        listaPessoal.remove(luis);

        listaPessoal.imprime();

    }
}
