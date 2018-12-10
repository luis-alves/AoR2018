
/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 8.8
 */
public class Flor {
    private String nome;
    private double preco;
    private double qtRecebida;
    private double qtVendida;
    
    public Flor() {
        // TODO Auto-generated constructor stub
    }
    
    public Flor(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.qtRecebida = 0;
        this.qtVendida = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQtRecebida() {
        return qtRecebida;
    }

    public void setQtRecebida(double qtRecebida) {
        this.qtRecebida = qtRecebida;
    }

    public double getQtVendida() {
        return qtVendida;
    }

    public void setQtVendida(double qtVendida) {
        this.qtVendida = qtVendida;
    }
    
    

}
