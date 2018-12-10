import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class FaturaTest {

    Farmacia farmacia;
    Cliente luis;
    Produto paracetamol;
    Produto anadol;

    @Before
    public void setUp() throws Exception {
        farmacia = new Farmacia("Lelo");
        luis = farmacia.criarFichaCliente("Luis", 123, 233, "kjlfad");
        paracetamol = farmacia.criarMedicamento6Porcento("Paracetamol", "Bayer", LocalDate.of(2018, 1, 1), 2.3);
        anadol = farmacia.criarMedicamento6Porcento("anadol", "Bayer", LocalDate.of(2018, 1, 1), 2.3);
    }

    @Test
    public void testEmitirFatura() {
        farmacia.emitirFatura(luis, paracetamol, 2);
        assertEquals(farmacia.quantFaturas(), 1);
    }

    @Test
    public void testPodeTerVariosProdutos() {
        Fatura fatura = farmacia.emitirFatura(luis, paracetamol, 2);
        assertEquals(farmacia.quantosTiposProdutosPorFatura(fatura), 1);
        farmacia.adicionarMedicamento(fatura, anadol, 3);
        assertEquals(farmacia.quantosTiposProdutosPorFatura(fatura), 2);
        assertEquals(farmacia.quantFaturas(), 1);

        Fatura fatura1 = farmacia.emitirFatura(luis, paracetamol, 4);
        assertEquals(farmacia.quantFaturas(), 2);
    }

    @Test
    public void testEmiteValorTotal() {
        Fatura fatura = farmacia.emitirFatura(luis, paracetamol, 2);
        farmacia.adicionarMedicamento(fatura, anadol, 3);
        assertEquals(farmacia.entregarFatura(fatura), 12.19, 000.1);
    }
}