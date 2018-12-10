import java.util.Scanner;

/**
 * Programa que, para um número num obtido aleatoriamente, mostre esse número bem como 
 * um novo número salto que corresponde à sequência de diferenças entre algarismos consecutivos 
 * presentes em num. Use os métodos que considerar necessários.
 *
 * @sid 2012
 * @aid 5.9
 */
public class Ex09 {

  public static void main(String[] args) {
    //begin_inputs
    Scanner sc = new Scanner(System.in);
    System.out.println("num = ");
    int num = sc.nextInt();
    sc.close();
    //end_inputs

    int inversoNum = reverseNum(num);

    System.out.print("Salto (" + num + ") = ");

    int num1;
    int num2;
    while (inversoNum > 0) {
      num1 = inversoNum % 10;
      if (inversoNum / 10 != 0) {
        num2 = (inversoNum / 10) % 10;
        System.out.print(Math.abs(num2-num1));
      }
      inversoNum /= 10;
    }
  }
  
  private static int reverseNum(int num) {
    int resultado = 0;
    while (num > 0) {
      resultado = resultado * 10 + num%10;
      num /= 10;
    }
    return resultado;
  }

}
