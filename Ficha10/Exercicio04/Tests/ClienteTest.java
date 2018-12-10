import org.junit.Test;

import static org.junit.Assert.*;

public class ClienteTest {

    @Test
    public void criarCliente() {
        Cliente cliente = new Cliente("Luis", 23232, 32234, "rua direus");
    }
}