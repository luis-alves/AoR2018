/**
 * Programa que lê o número de pontos a sortear e que calcule um valor aproximado para o 
 * valor de π.
 *
 * @sid 2012
 * @aid 5.12
 */
public class Ex12 {

  public static void main(String[] args) {
    //begin_inputs
    //end_inputs

    int raio = 1;
    int foraCirculo = 0;
    int dentroCirculo = 0;
    int totalTentativas = 0;

    for (int i = 0; i < 100000; i++) {
      double pontoX = Math.random();
      double pontoY = Math.random();
      
      if (distanciaPonto(pontoX, pontoY) > raio) {
        foraCirculo++;
      } else {
        dentroCirculo++;
      }
      totalTentativas++;
    }
    System.out.println("Valor de Pi aproximado: " + (double) dentroCirculo / totalTentativas);
  }
  
  private static double distanciaPonto(double x, double y) {
    return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
  }

}
