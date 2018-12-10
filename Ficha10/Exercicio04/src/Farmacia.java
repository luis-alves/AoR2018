import javax.xml.crypto.Data;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Farmacia {

    private final String nome;
    private ArrayList<Cliente> clientes;
    private ArrayList<Produto> produtos;
    private ArrayList<Fatura> faturas;
    private int num;

    public Farmacia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
        this.produtos = new ArrayList<>();
        this.faturas = new ArrayList<>();
    }

    public Cliente criarFichaCliente(String nome, int nif, int nu, String morada) {
        Cliente cliente = new Cliente(nome, nif, nu, morada);
        return cliente;
    }

    public Produto criarMedicamento6Porcento(String nome, String fabricante, LocalDate dataValidade, double precoSemIva) {
        Produto produto = new Medicamento6Porcento(nome, fabricante, dataValidade, precoSemIva);
        return produto;
    }

    public Produto criarMedicamento23Porcento(String nome, String fabricante, LocalDate dataValidade, double precoSemIva) {
        Produto produto = new Medicamento23Porcento(nome, fabricante, dataValidade, precoSemIva);
        return produto;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return this.getNome();
    }

    public void adicionarClienteAArray(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public int obterNumeroClientes() {
        return this.clientes.size();
    }

    public void adicionarMedicamentoArray(Produto produto) {
        this.produtos.add(produto);
    }

    public int contarQtProdutos() {
        return this.produtos.size();
    }

    public Fatura emitirFatura(Cliente cliente, Produto produto, int quantidade) {
        Fatura fatura = new Fatura(cliente, produto, quantidade);
        this.num++;
        fatura.setNum(this.num);
        this.faturas.add(fatura);
        return fatura;
    }

    public int quantFaturas() {
        return this.faturas.size();
    }

    public int quantosTiposProdutosPorFatura(Fatura fatura) {
        if (this.faturas.contains(fatura)) {
            return this.faturas.get(this.faturas.indexOf(fatura)).getProdutos().size();
        }
        return -1;
    }

    public void adicionarMedicamento(Fatura fatura, Produto produto, int quantidade) {
        if (this.faturas.contains(fatura)) {
            Fatura fatura1 = fatura.adicionarMedicamento(produto, quantidade);
            this.faturas.remove(fatura);
            this.faturas.add(fatura1);
        }
    }

    public double entregarFatura(Fatura fatura) {
        double totalComIva = 0;

        for (Fatura fat: this.faturas) {
            for (Map.Entry<Produto, Integer> f : fat.getProdutos().entrySet()) {
                double preco = f.getKey().getPrecoSemIva();
                totalComIva += preco * f.getValue() * (1+f.getKey().getIva());
            }
        }

        return totalComIva;
    }

    public double volumeVendasDia(LocalDate data) {
        double totalComIva = 0;

        for (Fatura fat: this.faturas) {
            if (fat.getData().equals(data)) {
                for (Map.Entry<Produto, Integer> f : fat.getProdutos().entrySet()) {
                    double t = f.getKey().getIva();
                    double x = f.getValue();
                    double preco = f.getKey().getPrecoSemIva();
                    totalComIva += preco * f.getValue() * (1+f.getKey().getIva());
                }
            }
        }
        return totalComIva;
    }

    public String imprimeVolumeVendasDia(LocalDate data) {
        DecimalFormat value = new DecimalFormat("#.##");
        return "O valor faturado no dia " + data.toString() + ", foi de " + value.format(this.volumeVendasDia(data));
    }

    public String imprimeRelatorioDiario() {
        String result = "";
        for (Fatura f: this.faturas) {
           result = "Fatura n.º: " + f.getNum() + " Data: " + f.getData() + " Cliente: " + f.getCliente().getNome();
            for (HashMap.Entry<Produto, Integer> hm : f.getProdutos().entrySet()) {
                result += "\nProduto: " + hm.getKey().getNome() + " Quantidade: " + hm.getValue();
            }

        }
        return result;
    }
}
