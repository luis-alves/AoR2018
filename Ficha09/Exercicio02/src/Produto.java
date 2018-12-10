/**
 * @sid: 2012
 * @aid: 9.2
 */
class Produto {

    private String nome;
    private String descricao;
    private int stock;
    private String tipoProduto;
    private double iva;
    private double precoUnitario;

    Produto() {
    }

    Produto(String nome, int stock, double precoUnitario) {
        this.nome = nome;
        this.stock = stock;
        this.precoUnitario = precoUnitario;
    }

    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    String getDescricao() {
        return descricao;
    }

    void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    int getStock() {
        return stock;
    }

    void setStock(int stock) {
        this.stock = stock;
    }

    double getPrecoUnitario() {
        return precoUnitario;
    }

    void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    void setIva(double iva) {
        this.iva = iva;
    }

    double getIva() {
        return this.iva;
    }

    String getTipoProduto() {
        return tipoProduto;
    }

    void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
}
