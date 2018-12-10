import java.util.Scanner;

/**
 * Programa que recebendo o valor do número inteiro de 4 dígitos (num), represente esse número 
 * na forma de um gráfico de quatro barras.
 *
 * @sid 2012
 * @aid 5.13
 */
public class Ex13 {

  public static void main(String[] args) {
    //begin_inputs
    Scanner sc = new Scanner(System.in);
    int num = 0;
    do {
      System.out.println("num = ");
      num = sc.nextInt();
    } while (num < 1000 || num > 9999);
    sc.close();
    //end_inputs
    
    int reverseNum = reverseNumber(num);
    
    for (int i = 9; i > 0; i--) {
      for (int j = 1; j <= 4; j++) {
        if (checkNum(reverseNum, i, j)) {
          reverseNum = alterarNum(reverseNum, j);
          if (reverseNum == 1) {
            System.out.print("**");
          } else {
            System.out.print("*");
          }
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
  
  private static int alterarNum(int num, int j) {
    int novoNum = 0;
    int i = 1;
    while (num > 0) {
      if (i == j) {
        novoNum = novoNum * 10 + num % 10 - 1;
    } else {
        novoNum = novoNum * 10 + num % 10;
    }
      num /= 10;
      i++; 
    }
    
    int valor = 0;
    while (novoNum > 0) {
      valor = valor * 10 + novoNum % 10;
      novoNum /= 10;
    }
    
    return valor;
  }
  
  private static int reverseNumber(int num) {
    int result = 0;
    while (num > 0) {
      result = result * 10 + num % 10;
      num /=10;
    }
    return result;
  }
  
  private static boolean checkNum(int num, int i, int j) {
    int index = 0;
    int valor = 0;
    while (index < j) {
      valor = num % 10;
      num /= 10;
      index++;
    }
    return (valor == i);
  }
}
