/**
 * Teste da criação e cálculo de declive e comprimento de reta.
 *
 * @sid 2012
 * @aid  8.3
 */
public class Principal {

    public static void main(String[] args) {
        SegmentoReta reta = new SegmentoReta(1, 1, 1, 30);
        boolean primeiro = true;
        boolean segundo = false;
        
        System.out.println("Primeiro " + reta.getPonto(primeiro));

        reta.setPonto(primeiro, 0, 0);
        
        System.out.println("Primeiro " + reta.getPonto(primeiro));
        System.out.println("Segundo " + reta.getPonto(segundo));
        
        System.out.println("Declive " + reta.calculaDeclive());
        
        System.out.println("Comprimento " + reta.comprimento());
    }

}
