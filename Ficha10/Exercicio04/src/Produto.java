import java.time.LocalDate;

public abstract class Produto {

    private final String nome;
    private final String fabricante;
    private final LocalDate dataValidade;
    private final double precoSemIva;

    public Produto(String nome, String fabricante, LocalDate dataValidade, double precoSemIva) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.dataValidade = dataValidade;
        this.precoSemIva = precoSemIva;
    }

    public double getPrecoSemIva() {
        return precoSemIva;
    }

    abstract double getIva();

    public String getNome() {
        return nome;
    }
}

