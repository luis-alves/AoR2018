/**
 * Definição de uma class de empréstimo bancário.
 *
 * @sid 2012
 * @aid 
 */
public class Emprestimo {
    private double prestacao;
    private int numMeses;
    private double TAXA = 0.01; // 1% taxa de juros
    private double divida;
    private double totalJuros;
    private int NUMERO_MAX_MESES = 4 *12;
    private int LIMITE_PRESTACAO = 50;
    
    public Emprestimo() {
        this.divida = 700;
    }
    
    public int getLimiteMeses() {
        return NUMERO_MAX_MESES;
    }

    public int getLimitePrestacao() {
        return LIMITE_PRESTACAO;
    }

    public void pagamento(double prestacao) {
        if (prestacao > 50) {
            System.out.println("Erro! Colocou uma prestação superior ao "
                            + "permitido, pelos nossos serviços");
            System.out.println();
        } 
        if ( prestacao <= LIMITE_PRESTACAO) {
            this.prestacao = prestacao; 
        }
    }
    
    public void obterRelatorio() {
        double prestacoes = this.divida+this.divida*(1+this.TAXA)/this.prestacao;
        for (int i = 0; i < prestacoes; i++) {
            double vJuro = calcJuro();
            double vEmp = calcDivida();
            this.numMeses++;
            System.out.printf("N.º Mês: %d, Capital: %.2f, Valor de Juro: %.2f, "
                            + "Valor em divida: %.2f"
                            , i+1, this.prestacao, vJuro, vEmp);
            System.out.println();
            if (this.divida < this.prestacao) {
                break;
            }
            
        }
        System.out.println();
        System.out.printf("No total levará %d a pagar o "
                        + "empréstimo. Terá um custo total de: %.2f", this.numMeses, this.totalJuros);
    }
    
    private double calcJuro() {
        this.totalJuros += this.divida * this.TAXA;
        return this.divida * this.TAXA;
    }
    
    private double calcDivida() {
        this.divida = (this.divida - this.prestacao) + this.divida * this.TAXA; 
        return this.divida;
    }
    

}
