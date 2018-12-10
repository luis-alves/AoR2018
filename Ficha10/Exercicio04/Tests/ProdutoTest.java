import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class ProdutoTest {

    @Test
    public void testProduto() {
        Produto produto = new Medicamento23Porcento("Paracetamol", "Bial", LocalDate.of(2020,10,10), 2.56);
    }

    @Test
    public void testMedicamento6Porcento() {
        Produto produto = new Medicamento6Porcento("nome", "fabricante", LocalDate.of(2018, 10, 10), 3.00);
    }

    @Test
    public void testMedicamento23Porcento() {
        Produto produto = new Medicamento23Porcento("nome", "fabricante", LocalDate.of(2018, 10, 10), 4.00);
    }
}