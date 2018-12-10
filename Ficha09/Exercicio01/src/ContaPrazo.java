import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @sid: 2012
 * @aid: 9.1
 */
class ContaPrazo extends Conta {

    private double juros;

    ContaPrazo(Cliente cliente, double primeiroDeposito, GregorianCalendar data,  double juros) {
        super(cliente, primeiroDeposito, data);
        this.juros = juros;
        this.tipoConta = "A Prazo";
        this.numConta = 0;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    void qtTempoVenceJuros() {
        Date finalTempo = new GregorianCalendar(2018,11,23).getTime();
        Date comeco = this.getData().getTime();

        long tempo = finalTempo.getTime() - comeco.getTime();

        long dias = tempo / (1000*60*60*24);
        System.out.println("Faltam " + dias + " dias, para o vencimento de juros.");
    }
}
