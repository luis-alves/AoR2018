/**
 * @sid: 2012
 * @aid: 9.2
 */
class Medicamento extends Produto {

     Medicamento(String nome, int stock, double precoUnitario) {
         super(nome, stock, precoUnitario);
         this.setIva(0.05);
         this.setTipoProduto("Medicamento");
    }

}
