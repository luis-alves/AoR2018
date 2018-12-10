/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 8.12
 */
public class Conta {
    
    protected int numConta;
    protected Cliente cliente;
    protected double saldo;
    
    public Conta() {
        this.saldo = 0;
        // TODO Auto-generated constructor stub
    }

    public Conta(Cliente cliente, double primeiroDeposito) {
        this.cliente = cliente;
        this.saldo = primeiroDeposito;
    }
    
    public void setSaldo(double valor) {
        this.saldo+= valor;
    }
    
    public void setNumConta(int num) {
        this.numConta = num;
    }
    
    public void fazerDeposito(double valor) {
        this.saldo += valor;
        System.out.format("Fez um depósito no valor de %.2f.", valor);
        System.out.println();
    }
    
    public void fazerLevantamento(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("O valor do saldo da sua conta é insuficiente.");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public Cliente getCliente() {
        return this.cliente;
    }
    
    

}
