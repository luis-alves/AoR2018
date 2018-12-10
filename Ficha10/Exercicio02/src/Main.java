/**
 * @sid 2012
 * @aid 10.2
 */
public class Main {

    public static void main(String[] args) {

        Biblioteca deiBiblio = new Biblioteca("Biblioteca do DEI", "Rua daolsj dsa");

        Livro algoritmos = deiBiblio.adiquirirLivro("Introdução a algoritmos",
                                                          new String[]{"Ricardo", "jsk"},
                                                    "Algo" );

        Livro python = deiBiblio.adiquirirLivro("Introdução a python",
                new String[]{"Ricardo João", "João António"},
                "Python" );

        Livro java = deiBiblio.adiquirirLivro("Introdução a java",
                new String[]{"Artur José", "Luís Alves"},
                "Java" );

        Leitor luis = deiBiblio.criarFichaLeitor("Luis", "Av.São Paulo",
                "luis@jdfkjd.com", 12, 98283838,
                'E');

        Leitor andre = deiBiblio.criarFichaLeitor("André", "Rua do lado",
                "andreww@jdfkjd.com", 32, 83838383,
                'P');

        System.out.println((deiBiblio.pesquisarLivro("Ricardo", "Algo").get(0).getTitulo()));

        Registo livroLuis = deiBiblio.requisitarLivroCota("RIC1", luis);

        System.out.println(livroLuis.getLeitor().getNome());

        deiBiblio.livrosForaPrazoEntrega().stream().forEach(registo -> System.out.println("Fora do prazo " + registo.getLeitor().getNome()));

    }
}
