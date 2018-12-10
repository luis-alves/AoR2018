/**
 * @sid: 2012
 * @aid: 9.2
 */
class Outro extends Produto {

    Outro(String nome, int stock, double precoUnitario) {
        super(nome, stock, precoUnitario);
        this.setIva(0.15);
        this.setTipoProduto("Outro");
    }

}
