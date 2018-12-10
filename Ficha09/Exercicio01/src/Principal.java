import java.util.GregorianCalendar;

/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 9.1
 */
public class Principal {

    public static void main(String[] args) {
        
        Cliente luisAlvesCliente = new Cliente("luís Alves", "Rua dali", 1234938);
        Cliente saraSampaioCliente = new Cliente("Sara Sampaio", "Rua daqui", 134253);
        Cliente joseMariaCliente = new Cliente("José Maria", "Rua dali", 1342532);
        Cliente joseAntonioCliente = new Cliente("José António", "Rua dali", 1654322);
        Cliente andreSilva = new Cliente("André Silva", "Rua daflsfk", 1654322);

        Banco santander = new Banco("Santander", "Rua do meio, 22, Coimbra");
        ContaOrdem luisAlves = santander.criarContaOrdem(luisAlvesCliente, 2000, new GregorianCalendar(2018, 10, 20));
        Conta saraSampaio = santander.criarContaOrdem(saraSampaioCliente, 1000, new GregorianCalendar(2018, 10, 20));
        Conta josemaria = santander.criarContaOrdem(joseMariaCliente, 200, new GregorianCalendar(2018, 10, 20));
        ContaPrazo joseAntonio = santander.criarContaPrazo(joseAntonioCliente, 100, new GregorianCalendar(2018, 10, 20), 0.34);

        santander.imprimirListaContas();

        luisAlves.fazerDeposito(1000);
        saraSampaio.fazerDeposito(100);
        luisAlves.getSaldo();
        luisAlves.fazerLevantamento(3000);
        saraSampaio.fazerLevantamento(30);
        luisAlves.getSaldo();
        josemaria.fazerLevantamento(20);
        joseAntonio.fazerDeposito(10000);
        
        
        santander.getSaldoCliente();

        
        josemaria.fazerLevantamento(180);
        santander.imprimirListaContas();
          
        santander.getSaldoCliente();
        
        santander.getSaldoCliente(1000);

        joseAntonio.qtTempoVenceJuros();

    }

}
