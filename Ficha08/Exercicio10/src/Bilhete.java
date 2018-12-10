/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 8.10
 */
public class Bilhete {

    protected int numero;
    public static final double preco = 1.4;
    
    public Bilhete(int id) {
        this.numero = id; 
    }

    public int getNumero() {
        return numero;
    }
    
}
