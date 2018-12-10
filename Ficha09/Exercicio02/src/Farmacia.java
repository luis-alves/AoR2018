import java.util.ArrayList;

/**
 * @sid: 2012
 * @aid: 9.2
 */
class Farmacia {

    private String nome;
    private String morada;
    private final int nif;
    private ArrayList<Produto> produtos;

    Farmacia(String nome, String morada, int nif) {
        this.nome = nome;
        this.morada = morada;
        this.nif = nif;
        produtos = new ArrayList<Produto>();
    }

    void pesquisarProdutoPorNome(String nomePro) {
        System.out.println("Pesquisa de produto por nome:");
        System.out.format("+----------------+----------------+------------+----------------+%n");
        System.out.format("|  Produto       |  Tipo          |    Preço   |      Stock     |%n");
        System.out.format("+----------------+----------------+------------+----------------+%n");
        for (Produto produto:produtos) {
            if (produto.getNome() == nomePro) {
                System.out.format("| %-14s | %-14s | %10.2f | %14d |%n",
                            produto.getNome(),
                            produto.getTipoProduto(),
                            produto.getPrecoUnitario(),
                            produto.getStock());
                System.out.format("+----------------+----------------+------------+----------------+%n");
            }
        }
        System.out.println();
    }

    void pesquisarProdutoPorTipo(String tipo, String nomePro) {
        System.out.println("Pesquisa de produto por tipo e nome:");
        System.out.format("+----------------+----------------+------------+----------------+%n");
        System.out.format("|  Produto       |  Tipo          |    Preço   |      Stock     |%n");
        System.out.format("+----------------+----------------+------------+----------------+%n");
        for (Produto produto:produtos) {
            if (produto.getNome() == nomePro && produto.getTipoProduto() == tipo) {
                System.out.format("| %-14s | %-14s | %10.2f | %14d |%n",
                        produto.getNome(),
                        produto.getTipoProduto(),
                        produto.getPrecoUnitario(),
                        produto.getStock());
                System.out.format("+----------------+----------------+------------+----------------+%n");
            }
        }
        System.out.println();
    }

    Produto adicionarProduto(String codigo, String nome, int stock, double preco) {
        Produto produto = new Produto();
        if (codigo == "medicamento") {
            produto = new Medicamento(nome, stock, preco);
        } else if (codigo == "perfume") {
            produto = new Perfume(nome, stock, preco);
        } else if (codigo == "outro") {
            produto = new Outro(nome, stock, preco);
        } else {
            System.out.println("Gama de produtos não existente.");
        }

        produtos.add(produto);

        return produto;
    }

    void removerProduto(Produto p) {
        if (this.produtos.contains(p)) {
            this.produtos.remove(p);
        }
    }

    void alterarPreco(Produto produto, double valor) {
        if (this.produtos.contains(produto)) {
            produto.setPrecoUnitario(valor);
        }
    }

    void imprimirListaProdutos() {
        System.out.format("+----------------+----------------+------------+----------------+%n");
        System.out.format("|  Produto       |  Tipo          |    Preço   |      Stock     |%n");
        System.out.format("+----------------+----------------+------------+----------------+%n");
        for (Produto produto : this.produtos) {
            System.out.format("| %-14s | %-14s | %10.2f | %14d |%n",
                    produto.getNome(),
                    produto.getTipoProduto(),
                    produto.getPrecoUnitario(),
                    produto.getStock());
        }
        System.out.format("+----------------+----------------+------------+----------------+%n");
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }
}
