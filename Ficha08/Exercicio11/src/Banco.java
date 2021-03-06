/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 8.11
 */
public class Banco {

    protected Conta[] listaContas;
    protected String nome;
    protected String morada;
    protected int numCliente = 0;

    public Banco(String nome, String morada) {
        this.nome = nome;
        this.morada = morada;
        this.listaContas = null;
        this.listaContas = new Conta[3];
    }

    public Conta criarConta(String nomeCliente, double primeiroDeposito) {
        this.numCliente++;
        Conta contaCliente = new Conta(nomeCliente, primeiroDeposito);

        contaCliente.setNumConta(this.numCliente);

        adicionarContaABaseDados(contaCliente);

        return contaCliente;
    }

    private void adicionarContaABaseDados(Conta cliente) {
        int index = procurarLocalArmazem();
        this.listaContas[index] = cliente; 
    }

    private int procurarLocalArmazem() {
        int index = this.listaContas.length;
        for (int i = 0; i < this.listaContas.length; i++) {
            if (listaContas[i] == null) {
                return i;
            }
        }
        Conta[] temp = new Conta[listaContas.length*3]; 
        for (int i = 0; i < this.listaContas.length; i++) {
            temp[i] = listaContas[i]; 
        }
        this.listaContas = temp;
        return index;
    }
    
    public void imprimirListaContas() { 
        System.out.println("A lista de cliente e suas posições é a seguinte:");
        System.out.format("+-----------------+-----------------+--------------+%n");
        System.out.format("| Num conta       | Cliente         |  Saldo       |%n");
        System.out.format("+-----------------+-----------------+--------------+%n");
        for (int i = 0; i < this.listaContas.length; i++) {
            if (this.listaContas[i] != null) {
                System.out.format("| %-15s | %-15s | %-12.2f |%n",
                                this.listaContas[i].getNumConta(),
                                this.listaContas[i].getNomeCliente(),
                                this.listaContas[i].getSaldo()
                                );
            }
        }
        System.out.format("+-----------------+-----------------+--------------+%n");
    }
}
