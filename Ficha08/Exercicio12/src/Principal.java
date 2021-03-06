/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 8.12
 */
public class Principal {

    public static void main(String[] args) {
        
        Cliente luisAlvesCliente = new Cliente("luís Alves", "Rua dali", 1234938);
        Cliente saraSampaioCliente = new Cliente("Sara Sampaio", "Rua daqui", 134253);
        Cliente joseMariaCliente = new Cliente("José Maria", "Rua dali", 1342532);
        Cliente joseAntonioCliente = new Cliente("José António", "Rua dali", 1654322);
        
        Banco santander = new Banco("Santander", "Rua do meio, 22, Coimbra");
        Conta luisAlves = santander.criarConta(luisAlvesCliente, 2000);
        Conta saraSampaio = santander.criarConta(saraSampaioCliente, 1000);
        Conta josemaria = santander.criarConta(joseMariaCliente, 200);
        Conta joseAntonio = santander.criarConta(joseAntonioCliente, 100);

        
        luisAlves.getSaldo();
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

    }

}
