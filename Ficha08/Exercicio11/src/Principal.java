/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 8.11
 */
public class Principal {

    public static void main(String[] args) {
        
        Banco santander = new Banco("Santander", "Rua do meio, 22, Coimbra");
        Conta luisAlves = santander.criarConta("Luís Alves", 2000);
        Conta saraSampaio = santander.criarConta("Sara Sampaio", 1000);
        Conta josemaria = santander.criarConta("José Maria", 200);
        Conta joseAntonio = santander.criarConta("José António", 100);

        
        luisAlves.getSaldo();
        luisAlves.fazerDeposito(1000);
        saraSampaio.fazerDeposito(100);
        luisAlves.getSaldo();
        luisAlves.fazerLevantamento(3000);
        saraSampaio.fazerLevantamento(30);
        luisAlves.getSaldo();
        josemaria.fazerLevantamento(20);
        joseAntonio.fazerDeposito(10000);
        
        santander.imprimirListaContas();
        

    }

}
