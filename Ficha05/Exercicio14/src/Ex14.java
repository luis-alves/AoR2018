import java.util.Random;

/**
 * Programa que apresente no ecrã a sequência ascendente e descendente de gráficos 
 * correspondentes a todos os números possíveis entre 0 e um valor max (compreendido entre 
 * 1 e 9999, inclusive), escolhido aleatoriamente. Faça um tempo de espera de 50ms entre a 
 * apresentação de dois gráficos consecutivos.
 *
 * @sid 2012
 * @aid 5.14
 */
public class Ex14 {

  public static void main(String[] args) throws InterruptedException {
    //begin_inputs
    Random rd = new Random();
    int max = rd.nextInt(1) + 10000;
    //end_inputs
    
    for (int k = 1; k <= max; k++) {
      int reverseNum = reverseNumber(k);
      
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
      Thread.sleep(50);
    }
    
    for (int k = max; k >= 1; k--) {
      int reverseNum = reverseNumber(k);
      
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
      Thread.sleep(50);
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
