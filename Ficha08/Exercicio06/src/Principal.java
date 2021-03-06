import java.awt.Point;
import java.awt.geom.Point2D;

/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 8.6
 */
public class Principal {

    public static void main(String[] args) {
        
        // Teste com triângulo equilátero
        Point2D a = new Point.Double(5, Math.sqrt(27));
        Point2D b = new Point.Double(8, 0);
        Point2D c = new Point.Double(2,0);
        
        Point2D[] pontosA = new Point2D[3];
        
        pontosA[0] = a;
        pontosA[1] = b;
        pontosA[2] = c;

        Poligono triangulo = new Poligono(pontosA);
        
        if (triangulo.temTodosAngulosIguais() && triangulo.temTodosLadosIguais()) {
            System.out.println("O poligono triângulo é regular");
        } else {
            System.out.println("O poligono triângulo não é regular");
        }

        // Teste com quadrado
        Point2D topoEsquerdoPoint = new Point.Double(0, 1);
        Point2D topoDireitoPoint = new Point.Double(1, 1);
        Point2D baseDireitaPoint = new Point.Double(1, 0);
        Point2D baseEsquerdaPoint = new Point.Double(0, 0);
        
        Point2D[] pontos = new Point2D[4];

        pontos[0] = topoEsquerdoPoint;
        pontos[1] = topoDireitoPoint;
        pontos[2] = baseDireitaPoint;
        pontos[3] = baseEsquerdaPoint;

        Poligono quadrado = new Poligono(pontos);

        if (quadrado.temTodosAngulosIguais() && quadrado.temTodosLadosIguais()) {
            System.out.println("O poligono quadrado é regular");
        } else {
            System.out.println("O poligono quadrado não é regular");
        }
    }

}
