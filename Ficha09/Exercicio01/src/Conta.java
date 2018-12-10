import java.util.GregorianCalendar;

/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 9.1
 */
public class Conta {
    protected int numConta;
    protected Cliente cliente;
    protected double saldo;
    GregorianCalendar data;
    protected String tipoConta;

    protected Conta() {
        this.saldo = 0;
        // TODO Auto-generated constructor stub
    }

    Conta(Cliente cliente, double primeiroDeposito, GregorianCalendar data) {
        this.cliente = cliente;
        this.saldo = primeiroDeposito;
        this.data = data;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public GregorianCalendar getData() {
        return data;
    }

    public int getNumConta() {
        return numConta;
    }

    protected void setSaldo(double valor) {
        this.saldo+= valor;
    }


    protected void fazerDeposito(double valor) {
        this.saldo += valor;
        System.out.format("Fez um depósito no valor de %.2f.", valor);
        System.out.println();
    }
    
    protected void fazerLevantamento(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("O valor do saldo da sua conta é insuficiente.");
        }
    }

    double getSaldo() {
        return this.saldo;
    }

    protected Cliente getCliente() {
        return this.cliente;
    }

}
