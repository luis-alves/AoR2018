import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;

import static org.junit.Assert.*;

public class FarmaciaTest {

    Farmacia farmacia;
    Cliente cliente;
    Cliente luis;
    Produto anadol;
    Produto paracetamol;
    Fatura fatura;
    Fatura faturaA;

    @Before
    public void setUp() throws Exception {
        farmacia = new Farmacia("Lelo");
        cliente = farmacia.criarFichaCliente("Luis Alves", 12343422, 23242133, "Rua direita");
        paracetamol = farmacia.criarMedicamento6Porcento("Paracetamol", "Bial S.A.", LocalDate.of(2020, 10, 10), 2.50);
        luis = farmacia.criarFichaCliente("Luis", 123, 233, "kjlfad");
        anadol = farmacia.criarMedicamento23Porcento("anadol", "Bayer", LocalDate.of(2018, 1, 1), 2.5);
        fatura = farmacia.emitirFatura(luis, paracetamol, 1);
        faturaA = farmacia.emitirFatura(luis, anadol, 2);
    }

    @Test
    public void testFarmacia() {
        assertEquals(farmacia.toString(), "Lelo");
    }

    @Test
    public void testCriarCliente() {
        farmacia.criarFichaCliente("Luis Alves", 12343422, 23242133, "Rua direita");
    }

    @Test
    public void testAdicionarClienteAArray() {
        farmacia.adicionarClienteAArray(cliente);
        assertEquals(farmacia.obterNumeroClientes(), 1);
    }

    @Test
    public void testCriarMedicamento23Porcento() {
        assertNotNull(anadol);
        assertEquals(0.23, anadol.getIva(), 0.01);
    }

    @Test
    public void testCriarMedicamento6Porcento() {
        assertNotNull(paracetamol);
        assertEquals(0.06, paracetamol.getIva(), 0.01);
    }

    @Test
    public void testGuardaMedicamento() {
        farmacia.adicionarMedicamentoArray(paracetamol);
        assertEquals(farmacia.contarQtProdutos(), 1);
    }

    @Test
    public void testSeImprimeValorVendasPorDia() {
        assertNotNull(fatura);
        assertNotNull(faturaA);

        farmacia.adicionarMedicamento(fatura, anadol, 3);
        assertEquals(18.03, farmacia.volumeVendasDia(LocalDate.now()), 0.01);

        farmacia.adicionarMedicamento(faturaA, anadol, 3);
        assertEquals(farmacia.imprimeVolumeVendasDia(LocalDate.now()), "O valor faturado no dia " + LocalDate.now() + ", foi de 27,25");
    }

    @Test
    public void testImprimeListaVendas() {
        farmacia.adicionarMedicamento(fatura, anadol, 3);
        assertEquals("Fatura n.º: 1 Data: 2018-12-07 Cliente: Luis\nProduto: Paracetamol Quantidade: 1\nProduto: anadol Quantidade: 3", farmacia.imprimeRelatorioDiario());
    }
}