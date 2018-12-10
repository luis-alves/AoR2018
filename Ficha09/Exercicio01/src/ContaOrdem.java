import java.util.GregorianCalendar;

/**
 * @sid: 2012
 * @aid: 9.1
 */
class ContaOrdem extends Conta {

    ContaOrdem(Cliente cliente, double primeiroDeposito, GregorianCalendar data) {
        super(cliente, primeiroDeposito, data);
        this.tipoConta = "À Ordem";
        this.numConta = 0;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }



}
