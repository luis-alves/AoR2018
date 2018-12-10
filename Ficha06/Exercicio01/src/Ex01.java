import java.util.Scanner;

/**
 * Programa que calcula a média dos elementos de um vetor (numeros) de 
 * n elementos, assim como o menor e o maior elemento do vetor.
 *
 * @sid 2012
 * @aid 6.1
 */
public class Ex01 {

  public static void main(String[] args) {
    //begin_inputs
    Scanner sc = new Scanner(System.in);
    int n = 0;
    do {
      System.out.println("n = ");
      n = sc.nextInt();
    } while (n <= 0);
    
    int[] numeros = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.println("numero = ");
      numeros[i] = sc.nextInt(); 
    }
    sc.close();
    //end_inputs
    
    double media = calcMedia(numeros, n);
    int maximo = calcMaximo(numeros, n);
    int minimo = calcMinimo(numeros, n);
    
    System.out.print("Max (" + maximo + ") " + "Min (" + minimo + ") " + 
            "Média (" + media + ")");
  }

  private static int calcMinimo(int[] numeros, int n) {
    int min = numeros[0];
    for (int i = 1; i < n; i++) {
      if (min > numeros[i]) {
        min = numeros[i];
      }
    }
    return min;
  }

  private static int calcMaximo(int[] numeros, int n) {
    int max = 0;
    for (int i = 0; i < n; i++) {
      if (max < numeros[i]) {
        max = numeros[i];
      }
    }
    return max;
  }

  private static double calcMedia(int[] numeros, int n) {
    int soma = 0;
    for (int i = 0; i < n; i++) {
      soma += numeros[i];
    }
    return soma / n;
  }

}
