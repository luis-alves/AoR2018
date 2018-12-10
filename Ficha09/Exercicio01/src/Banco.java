import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 9.1
 */
public class Banco {

    private Conta[] listaContas;
    private String nome;
    private String morada;
    private int numCliente = 0;

    Banco(String nome, String morada) {
        this.nome = nome;
        this.morada = morada;
        this.listaContas = null;
        this.listaContas = new Conta[3];
    }

    ContaOrdem criarContaOrdem(Cliente cliente, double primeiroDeposito, GregorianCalendar data) {
        this.numCliente++;
        ContaOrdem contaCliente = new ContaOrdem(cliente, primeiroDeposito, data);

        contaCliente.setNumConta(this.numCliente);

        adicionarContaABaseDados(contaCliente);

        return contaCliente;
    }

    ContaPrazo criarContaPrazo(Cliente cliente, double primeiroDeposito, GregorianCalendar data, double juros) {
        this.numCliente++;
        ContaPrazo contaCliente = new ContaPrazo(cliente, primeiroDeposito, data, juros);

        contaCliente.setNumConta(this.numCliente);

        adicionarContaABaseDados(contaCliente);

        return contaCliente;
    }

    private void adicionarContaABaseDados(Conta conta) {
        int index = procurarLocalArmazem();
        this.listaContas[index] = conta;
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
    
    void imprimirListaContas() {
        System.out.println("A lista de cliente e suas posições é a seguinte:");
        System.out.format("+-----------------+-----------------+--------------+---------------+-----------------+%n");
        System.out.format("| Num conta       | Cliente         |  Saldo       |  Tipo Conta   | Dias até venci. |%n");
        System.out.format("+-----------------+-----------------+--------------+---------------+-----------------+%n");
        for (int i = 0; i < this.listaContas.length; i++) {
            if (this.listaContas[i] != null) {
                System.out.format("| %-15s | %-15s | %-12.2f | %-13s | %d / %d / %d  |%n",
                                this.listaContas[i].getNumConta(),
                                this.listaContas[i].getCliente().getNome(),
                                this.listaContas[i].getSaldo(),
                                this.listaContas[i].getTipoConta(),
                                this.listaContas[i].getData().get(Calendar.YEAR),
                                this.listaContas[i].getData().get(Calendar.MONTH),
                                this.listaContas[i].getData().get(Calendar.DAY_OF_MONTH)

                                );
            }
        }
        System.out.format("+-----------------+-----------------+--------------+---------------+-----------------+%n");
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
