/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 8.12
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

    public Conta criarConta(Cliente cliente, double primeiroDeposito) {
        this.numCliente++;
        Conta contaCliente = new Conta(cliente, primeiroDeposito);

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
                                this.listaContas[i].getCliente().getNome(),
                                this.listaContas[i].getSaldo()
                                );
            }
        }
        System.out.format("+-----------------+-----------------+--------------+%n");
    }
    
    public Cliente[] getSaldoCliente() {
        Cliente[] listaClientes = new Cliente[this.listaContas.length];
        int index = 0;
        for (int i = 0; i < this.listaContas.length; i++) {
            if (this.listaContas[i] != null && this.listaContas[i].getSaldo() == 0) {
               listaClientes[index] = this.listaContas[i].getCliente(); 
               index++;
            }
        }
        Cliente[] listaClientesFinal = new Cliente[index];

        for (int i = 0; i < listaClientesFinal.length; i++) {
            listaClientesFinal[i] = listaClientes[i]; 
        }
        
        if (listaClientesFinal.length > 0) {
            if (listaClientesFinal.length == 1) {
                System.out.println("O cliente ");
                
            } else {
                System.out.println("Os clientes ");
            }
            for (Cliente cliente : listaClientesFinal) {
                System.out.println("- " + cliente.getNome());
            }
            System.out.println("Têm saldo zero.");
            System.out.println();
            
        }
        
        return listaClientesFinal;
    }

    public Cliente[] getSaldoCliente(double limiteInferior) {
        Cliente[] listaClientes = new Cliente[this.listaContas.length];
        int index = 0;
        for (int i = 0; i < this.listaContas.length; i++) {
            if (this.listaContas[i] != null && this.listaContas[i].getSaldo() > limiteInferior) {
               listaClientes[index] = this.listaContas[i].getCliente(); 
               index++;
            }
        }
        Cliente[] listaClientesFinal = new Cliente[index];

        for (int i = 0; i < listaClientesFinal.length; i++) {
            listaClientesFinal[i] = listaClientes[i]; 
        }
        
        if (listaClientesFinal.length > 0) {
            if (listaClientesFinal.length == 1) {
                System.out.println("O cliente ");
                
            } else {
                System.out.println("Os clientes ");
            }
            for (Cliente cliente : listaClientesFinal) {
                System.out.println("- " + cliente.getNome());
            }
            System.out.format("Têm saldo superior a %.2f", limiteInferior);
            System.out.println();
            
        }
        return listaClientesFinal;
        
        
    }
}
