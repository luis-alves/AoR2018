import java.time.LocalDate;

public class Medicamento6Porcento extends Produto {

    private final double iva;

    public Medicamento6Porcento(String nome, String fabricante, LocalDate dataFabrico, double precoSemIva) {
        super(nome, fabricante, dataFabrico, precoSemIva);
        this.iva = 0.06;
    }

    public double getIva() {
        return iva;
    }
}
