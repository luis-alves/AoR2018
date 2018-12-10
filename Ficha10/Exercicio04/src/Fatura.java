import java.time.LocalDate;
import java.util.HashMap;

public class Fatura {

    private int num;
    private final Cliente cliente;
    private LocalDate data;
    private HashMap<Produto, Integer> produtos;

    public Fatura(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        this.produtos = new HashMap<>();
        this.produtos.put(produto, quantidade);
        this.data = LocalDate.now();
    }

    public Fatura adicionarMedicamento(Produto produto, int quantidade) {
        if (this.produtos.containsKey(produto)) {
            int valor = this.produtos.get(produto);
            this.produtos.put(produto, valor + quantidade);
            return this;
        } else {
            this.produtos.put(produto, quantidade);
            return this;
        }
    }

    public HashMap<Produto, Integer> getProdutos() {
        return produtos;
    }

    public LocalDate getData() {
        return data;
    }

    void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
