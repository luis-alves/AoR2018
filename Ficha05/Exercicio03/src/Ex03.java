import java.util.Scanner;

/**
 * Escreve os números Fibonacci é um número definido pelo utilizador
 *
 * @sid 2012
 * @aid 5.3
 */
public class Ex03 {

  public static void main(String[] args) {
    //begin_inputs
    Scanner sc = new Scanner(System.in);
    
    System.out.println("n =");
    int n = sc.nextInt();
    
    sc.close();
    //end_inputs
    
    System.out.print("0 1");

    int anterior1 = 0;
    int anterior2 = 1;
    int resultado = 0;

    for (int i = 1; i < n; i++) {
      resultado = fib(anterior2, anterior1);
      anterior1 = anterior2;
      anterior2 = resultado;
      System.out.print(" " + anterior2);
    }
  }
  
  public static int fib(int a, int b) {
    return a + b;
  }

}
