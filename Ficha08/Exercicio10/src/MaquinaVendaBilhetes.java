/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 8.10
 */
public class MaquinaVendaBilhetes {
    
    final protected int ID;
    protected int numeroBilhetes;
    protected int numeroTitulos;
    protected double valorEmCaixa;
    protected int iDBilhetes;
    
    public void getValorEmCaixa() {
        System.out.format("O valor atual na máquina é de: %.2f", this.valorEmCaixa);
    }

    public MaquinaVendaBilhetes(int idMaquina) {
        this.ID = idMaquina;
        this.valorEmCaixa = 0;
        this.numeroBilhetes = 0;
        this.numeroTitulos = 0;
        this.iDBilhetes = 0;
    }
    
    public void abastecerMaquinaBilhetes(int qt) {
        this.numeroBilhetes = qt;
        // TODO Perguntar a professora se isto é correto:
    }

    public void abastecerMaquinaTitulos(int qt) {
        this.numeroTitulos = qt;
    }
    
    public Bilhete vendaBilhete(int qt, double valorEntregue) {
        this.iDBilhetes++;
        Bilhete bilheteUnico = new Bilhete(this.iDBilhetes);
        if (this.numeroBilhetes >= qt && valorEntregue >= qt*Bilhete.preco) {
            this.numeroBilhetes -= qt;
            this.valorEmCaixa += qt * Bilhete.preco;
            double troco = valorEntregue - qt * Bilhete.preco;
            if (troco > 0) {
                System.out.format("Obrigado pela compra, aqui está o seu troco "
                                + "de "
                                + "%.2f. Boa viagem", troco);
                System.out.println();
            } else {
                System.out.println("Obrigado pela compra, tenha uma boa viagem");
            }
            return bilheteUnico;
        } else if (this.numeroBilhetes < qt){
            System.out.println("Desculpe mas não temos bilhetes suficientes, "
                            + "por favor dirija-se à próxima máquina. "
                            + "Obrigado");
        }  else if (valorEntregue < qt * Bilhete.preco) {
            System.out.println("Desculpe, mas o valor introduzido é "
                            + "insuficiente");
        }
        return null;
    }
    
    public Bilhete[] vendaTitulo(int qt, double valorEntregue) {
        this.iDBilhetes++;
        if (this.numeroBilhetes >= qt && valorEntregue >= qt*Bilhete.preco) {
            this.numeroBilhetes -= qt;
            this.valorEmCaixa += qt * Bilhete.preco * 11;
            double troco = valorEntregue - qt * Bilhete.preco * 11;
            if (troco > 0) {
                System.out.format("Obrigado pela compra, aqui está o seu troco "
                                + "de "
                                + "%.2f. Boa viagem\n", troco);
            } else {
                System.out.println("Obrigado pela compra, tenha uma boa viagem\n");
            }
            return produzirTitulo();
        } else if (this.numeroBilhetes < qt){
            System.out.println("Desculpe mas não temos bilhetes suficientes, "
                            + "por favor dirija-se à próxima máquina. "
                            + "Obrigado");
        }  else if (valorEntregue < qt * Bilhete.preco * 11) {
            System.out.println("Desculpe, mas o valor introduzido é "
                            + "insuficiente");
        }
        return null;
    }
    
    protected Bilhete[] produzirTitulo() {
        Bilhete[] titulo = new Bilhete[11];
        
        for (int i = 0; i < 11; i++) {
            this.iDBilhetes++;
            titulo[i] = new Bilhete(this.iDBilhetes); 
        }
        return titulo;
    }

    public int getNumeroBilhetes() {
        return numeroBilhetes;
    }

    public int getNumeroTitulos() {
        return numeroTitulos;
    }

    public int getID() {
        return ID;
    }
    


    
}
