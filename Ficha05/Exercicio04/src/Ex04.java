import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *  Programa que lerá um conjunto de números, até que seja introduzido o valor 999, 
 *  e determinará as suas médias harmónica e aritmética.
 *
 * @sid 2012
 * @aid 5.4
 */
public class Ex04 {

  public static void main(String[] args) {
    //begin_inputs
    Scanner sc = new Scanner(System.in);

    int n = 0;
    int num = 0;
    int somaAritmetica = 0;
    double somaHarmonica = 0;

    do {
      System.out.println("Escreva um número: ");
      num = sc.nextInt();
      n++;
      somaAritmetica += num;
      somaHarmonica += 1 / (double) num;
      
    } while (num != 999); 
    
    sc.close();
    //end_inputs
    
    double mediaArit = aritmetica(somaAritmetica, n);
    double mediaHar = harmonica(somaHarmonica, n);
    
    DecimalFormat valor = new DecimalFormat("#.##");
    System.out.println("Aritmética: " + valor.format(mediaArit) +" Harmónica: " + 
            valor.format(mediaHar));
  }
  
  public static double aritmetica(double soma, int n) {
    return soma / n;
  }
  
  public static double harmonica(double soma, int n) {
    return n / soma;
  }

}
