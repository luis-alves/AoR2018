/**
 * Programa que permite a partir da introdução das coordenadas dos 4 
 * vértices(x1,y1,x2,y2,x3,y3,x4,y4)de um conjunto de quadriláteros que se sabe serem convexos.
 *
 * @sid 2012
 * @aid 5.15
 */
public class Ex15 {

  public static void main(String[] args) {
    /**
     * Assumo que:
     * - o ponto 1 está localizado no canto inferior esquerdo e na coordenada (0,0),
     * - o ponto 2 no canto inferior direito,
     * - o ponto 3 no canto superior esquerdo,
     * - o ponto 4 no canto superior direito. 
     */

    //begin_inputs
    double x1 = 0;
    double y1 = 0;
    double x2 = 2;
    double y2 = 0;
    double x3 = 1;
    double y3 = 2;
    double x4 = 3;
    double y4 = 2;
    //end_inputs

    // Distancias entre pontos adjacentes
    double dist12 = Math.sqrt(Math.pow(Math.abs(x2-x1), 2) + Math.pow(Math.abs(y2-y1), 2));
    double dist13 = Math.sqrt(Math.pow(Math.abs(x1-x3), 2) + Math.pow(Math.abs(y1-y3), 2));
    double dist34 = Math.sqrt(Math.pow(Math.abs(x3-x4), 2) + Math.pow(Math.abs(y3-y4), 2));
    double dist24 = Math.sqrt(Math.pow(Math.abs(x4-x2), 2) + Math.pow(Math.abs(y4-y2), 2));

    // Dot products de todos os vértices
    double dot1 = x3 * x2 + y3 * y2;

    // Ângulos entre duas arestas adjacentes
    double anguloVert1 = Math.toDegrees(Math.acos(dot1 / (dist12 * dist13)));

    int quadrado = 0;
    int retangulo = 0;
    int losango = 0;
    int paralelogramo = 0;
    int papagaio = 0;
    int outro = 0;

    if (eQuadrado(dist12, dist13, dist34, dist24, anguloVert1)) {
      quadrado++;
    } else if (eRetangulo(dist12, dist13, dist34, dist24, anguloVert1)) {
      retangulo++;
    } else if (eLosango(dist12, dist13, dist34, dist24, anguloVert1)) {
      losango++;
    } else if (eParalelogramo(dist12, dist13, dist34, dist24, anguloVert1)) {
      paralelogramo++;
    } else if (ePapagaio(dist12, dist13, dist34, dist24, anguloVert1)) {
      papagaio++;
    } else {
      outro++;
    }
    
    System.out.println("As qt. de tipos de quadriláteros são os seguintes:");
    System.out.println("Quadrado: " + quadrado);
    System.out.println("Retangulo: " + retangulo);
    System.out.println("Losango: " + losango);
    System.out.println("Paralelogramo: " + paralelogramo);
    System.out.println("Papagaio: " + papagaio);
    System.out.println("Outro: " + outro);
  }

  private static boolean eQuadrado(double d12, double d13, double d34, double d24, double angulo) {
    // Verificar se todos os lados são iguais
    if (d12 == d13 && d12 == d34 && d12 == d24) {
      // verificar se pelo menos um dos ângulos é de 90, logo um quadrado, senão losango.
      return (angulo == 90.0); 
    }
    return false;
  }
  
  private static boolean eRetangulo(double d12, double d13, double d34, double d24, double angulo) {
    if (d12 == d34) {
      return (angulo == 90.0 && d13 == d24);
    }
    return false;
  }
  
  
  private static boolean eLosango(double d12, double d13, double d34, double d24, double angulo) {
    // Verificar se todos os lados são iguais
    if (d12 == d13 && d12 == d34 && d12 == d24) {
      // verificar se pelo menos um dos ângulos é de 90, logo um quadrado, senão losango.
      return (angulo != 90.0); 
    }
    return false;
  }
  
  private static boolean eParalelogramo(
          double d12, double d13, double d34, double d24, double angulo) {
    if (d12 == d34 && d12 != d13) {
      return (angulo != 90.0 && d13 == d24);
    }
    return false;
  }
  
  private static boolean ePapagaio(
          double d12, double d13, double d34, double d24, double angulo) {
    if (d12 == d13) {
      return (angulo != 90.0 && d24 == d34);
    }
    return false;
  }
  
}