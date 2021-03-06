
/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 8.8
 */
public class Loja {
    private String nomeLoja;
    private String nomeDono;
    private Flor[] transacoes;

    public Loja(String nomeLoja, String nomeDono) {
        this.nomeDono = nomeDono;
        this.nomeLoja = nomeLoja;
        this.transacoes = new Flor[3];
    }
    
    public void vendaFlor(Flor a, double qt) {
        int i = procurarLocalArmazem();
        a.setQtVendida(qt);
        a.setQtRecebida(0);
        this.transacoes[i] = a;  
    }

    public void compraFlor(Flor a, double qt) {
        int i = procurarLocalArmazem();
        a.setQtVendida(0);
        a.setQtRecebida(qt);
        this.transacoes[i] = a;  
    }
    
    private int procurarLocalArmazem() {
        for (int i = 0; i < this.transacoes.length; i++) {
            if (this.transacoes[i] == null) {
                return i;
            }
        }
        int index = this.transacoes.length;
        // Não tem espaço, logo duplicar espaço
        Flor[] temp = new Flor[this.transacoes.length*2];
        for (int i = 0; i < this.transacoes.length; i++) {
            temp[i] = this.transacoes[i]; 
        }
        this.transacoes = temp;
        return index;
       
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void getTransacoes() {
        System.out.println("As transacções deste mês foram as seguintes:");
        System.out.format("+-----------------+-------+--------------+--------------+%n");
        System.out.format("| Produto         | Preço |  qt recebida |  qt vendida  |%n");
        System.out.format("+-----------------+-------+--------------+--------------+%n");
        for (int i = 0; i < this.transacoes.length; i++) {
            if (this.transacoes[i] != null) {
                System.out.format("| %-15s | %-5.2f | %-12.2f | %-12.2f |%n",
                                this.transacoes[i].getNome(),
                                this.transacoes[i].getPreco(),
                                this.transacoes[i].getQtRecebida(),
                                this.transacoes[i].getQtVendida());
            }
        }
        System.out.format("+-----------------+-------+--------------+--------------+%n");
    }
    
    
}
