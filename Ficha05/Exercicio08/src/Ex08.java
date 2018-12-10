import java.util.Scanner;

/**
 * Algoritmo que, dado um número introduzido pelo utilizador (num), determina qual o 
 * tamanho da máxima sequência crescente de dígitos.
 *
 * @sid 2012
 * @aid 5.8
 */
public class Ex08 {

  public static void main(String[] args) {
    //begin_inputs
    Scanner sc = new Scanner(System.in);
    System.out.println("n = ");
    int num = sc.nextInt();
    sc.close();
    //end_inputs
    
    long reversoN = reverso(num);
    
    int resultado = maiorSeq(reversoN);
    
    System.out.print("Tamanho = " + resultado);

  }
  
  private static long reverso(int n) {
    long resultado = 0;
    while (n > 0) {
      int alg = n % 10;
      resultado = resultado * 10 + alg;
      n /= 10;
    }
    return resultado;
  }
  
  private static int maiorSeq(long num) {
    long ini = num % 10;
    int contador = 0;
    int maior = 0;

    while (num > 0) {
      if (num % 10 > ini) {
        ini = num % 10;
        contador++;
      } else {
        ini = num % 10;
        contador = 0;
      }
      num /= 10;
      if (contador > maior) {
        maior = contador;
      }
    }
    
    if ( maior == 0) {
      return maior;
    }
    return maior+1;
  }
}
