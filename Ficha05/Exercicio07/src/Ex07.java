import java.util.Scanner;

/**
 * Programa que pede ao utilizador um valor inteiro n e devolve a soma ou fatorial de seus numeros
 * inferiores.
 *
 * @sid 2012
 * @aid 5.7
 */
public class Ex07 {

  public static void main(String[] args) {
    //begin_inputs
    Scanner sc = new Scanner(System.in);
    System.out.println("n = ");
    int n = sc.nextInt();
    sc.close();
    //end_inputs
    
    System.out.print(n+"!" + " = ");
    if (n >= 20) {
      System.out.print(soma(n));
    } else if (n >= 10 && n < 20) {
      System.out.print(fatorialUnico(n));
    } else {
      System.out.print(fatorialMultiplo(n));
    }
  }
  
  private static int soma(int n) {
    int soma = 0;
    for (int i = 0; i < n; i++) {
      soma += 1;
    }
    return soma;
  }
  
  private static long fatorialUnico(int n) {
    long soma = 1;
    for (int i = 1; i <= n; i++) {
      soma *= i;
    }
    return soma;
  }
  
  private static long fatorialMultiplo(int n) {
    long soma = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        soma *= j;
      }
    }
    return soma;
  }

}
