import java.util.Random;
import java.util.Scanner;

/**
 * Programa que implementa um jogo do tipo tiro ao alvo.
 *
 * @sid 2012
 * @aid 5.10
 */
public class Ex10 {

  public static void main(String[] args) {
    //begin_inputs

    int v0 = 10;
    
    Random random = new Random();
    int dist = random.nextInt(10) + 11;

    Scanner sc = new Scanner(System.in);
    
    double d;
    int h = 20;
    double g = 9.8;
    double NMT = 0.4;
    int contador = 0;
    
    do {
      contador ++; 
      System.out.println("alpha = ");
      double alpha = sc.nextDouble();
      
      double v0x = velocidadeX(v0, alpha);
      double v0y = velocidadeY(v0, alpha);
      
      double a = v0x / g;
      double b = v0y;
      double r = Math.pow(b, 2);
      double c = Math.sqrt(r + 2 * g * h); 

      d = a * (b + c);
      
      if (Math.abs(d-dist) > NMT) {
        if ((double) dist - NMT > d ) {
          System.out.println("Há tentativa nº " + contador + ". A bola ficou " + 
                  Math.abs(dist-d) + " aquém do alvo.");
        } else if ((double) dist - NMT < d){
          System.out.println("Há tentativa nº " + contador + ". A bola ficou " + 
                  Math.abs(dist-d) + " além do alvo." );
        }
      }
    } while (Math.abs((double) dist - d) > NMT && contador < 10);

    sc.close();
    //end_inputs
    
    if (contador == 10 ) {
      System.out.println("O canhão não atingiu o alvo.");
    } else {
      System.out.println("O canhão atingiu o barco há tentativa n.º " + contador 
              +".");
    }
  }
  
  private static double velocidadeX(int vel, double a) {
    return vel * Math.cos(Math.toRadians(a));
  }

  private static double velocidadeY(int vel, double a) {
    return vel * Math.sin(Math.toRadians(a));
  }

}
