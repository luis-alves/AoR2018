/**
 * @sid: 2012
 * @aid 9.2
 */
public class Main {

    public static void main (String[] args) {

        Farmacia lelo = new Farmacia("Lelo, S.A.", "Rua dali", 12345687);
        Farmacia amilcar = new Farmacia("Amilcar, S.A.", "Rua dali", 12332838);

        Produto aspirina = lelo.adicionarProduto("medicamento", "Aspirina 100", 21, 30.93);
        Produto nurofen = lelo.adicionarProduto("medicamento","Nurofen 400", 234, 1.23);
        Produto golpon = lelo.adicionarProduto("medicamento","Golpon", 342, 2.76);

        Produto boss = lelo.adicionarProduto("perfume", "Hugo Boss", 23, 23.45);
        Produto klein = lelo.adicionarProduto("perfume", "calvin Klein", 12, 43.22);
        Produto golpon2 = lelo.adicionarProduto("perfume", "Golpon", 48,234.23);

        lelo.imprimirListaProdutos();

        // Testar alterar nome de medicamento:
        aspirina.setNome("Aspirina 100");
        nurofen.setPrecoUnitario(1.32);

        golpon.setDescricao("Produto para rejuvenescer os olhos!");
        System.out.println(golpon.getDescricao());

        lelo.imprimirListaProdutos();

        lelo.removerProduto(boss);
        lelo.alterarPreco(aspirina, 13.2);

        lelo.imprimirListaProdutos();

        lelo.pesquisarProdutoPorTipo("Medicamento", "Golpon");

        lelo.pesquisarProdutoPorNome("Golpon");


    }

}
