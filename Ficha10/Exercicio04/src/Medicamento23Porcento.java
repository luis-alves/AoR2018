import java.time.LocalDate;

public class Medicamento23Porcento extends Produto {

    private double iva;

    public Medicamento23Porcento(String nome, String fabricante, LocalDate data, double precoSemIva) {
        super(nome, fabricante, data, precoSemIva);
        this.iva = 0.23;
    }

    public double getIva() {
        return iva;
    }
}
