import java.util.Random;

/**
 * Programa que determina se um vetor de inteiros (numeros) está ou não 
 * ordenado. No primeiro caso deve indicar se o ordenamento está 
 * feito de forma crescente ou decrescente.
 *
 * @sid 2012
 * @aid 6.2
 */
public class Ex02 {

  public static void main(String[] args) {
    //begin_inputs
    Random rd = new Random();
    int qtNum = rd.nextInt(1) + 10;
    
    int[] numeros = new int[qtNum];
    for (int i = 0; i < qtNum; i++) {
      numeros[i] = rd.nextInt(1) + 101; 
    }
    //end_inputs

    System.out.println(qualAOrdem(numeros));
  }

  private static String qualAOrdem(int[] numeros) {
    int crescente = 0;
    int decrescente = 0;
    
    for (int i = 0; i < numeros.length - 1; i++) {
      if (numeros[i] < numeros[i+1]) {
        crescente++;
      } else if (numeros[i] > numeros[i+1]) {
        decrescente++;
      }
    }
    
    if (crescente == numeros.length - 1) {
      return "Os algarismos estão ordenados de forma crescente";
    } else if (decrescente == numeros.length - 1) {
      return "Os algarismos estão ordenados de forma crescente";
    } else {
      return "Os algarismos não estão ordenados";
    }
  }

}
