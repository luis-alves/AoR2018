
/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 8.8
 */
public class Principal {

    public static void main(String[] args) {

        Flor rosa = new Flor("Rosa", 1.34);
        Flor malmequer = new Flor("Malmequer",2.34);
        Flor tulipa = new Flor("Tulipa", 12.3);
        Flor margarida = new Flor("Margarida", 2.2);
        
        Loja doCanto = new Loja("Loja do Canto", "Luís Tira Coisas");
        
        doCanto.vendaFlor(rosa, 12);
        doCanto.vendaFlor(malmequer, 39);
        doCanto.vendaFlor(rosa, 32);
        doCanto.vendaFlor(margarida, 14);
        doCanto.compraFlor(rosa, 34);
        doCanto.compraFlor(tulipa, 2);
        
        doCanto.getTransacoes();
    }

}
