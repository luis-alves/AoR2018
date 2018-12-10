import java.util.Scanner;

/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 5.6
 */
public class Ex06 {

  public static void main(String[] args) {
    //begin_inputs
    Scanner sc = new Scanner(System.in);
    System.out.println("n = ");
    int n = sc.nextInt();
    sc.close();
    //end_inputs
    
    for (int i = 0; i < n; i++) {
      for (int j = n-i; j < n; j++) {
        System.out.print(" ");
      }
      System.out.print("W");
      for (int j = 0; j < eIntercalar(n-i); j++) {
        System.out.print(" ");
      }
      if (i > 0) {
        if (i != n-1) {
          System.out.print("W");
        }
        for (int j = 0; j < eIntercalar(i+1); j++) {
          System.out.print(" ");
        }
        System.out.print("W");
        
      } else {
        System.out.print("W");
      }
      for (int j = 0; j < eIntercalar(n-i); j++) {
        System.out.print(" ");
      }
      if (i != n-1) {
        System.out.print("W");
      }
      for (int j = n-i; j < n; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }

    
  }
  
  
  private static int eIntercalar(int n) {
    int valFInal = 1;
    if (n == 0 || n == 1) {
      return 0;
    } else if (n == 2) {
      return 1;
    } else {
      for (int i = 2; i < n; i++) {
        valFInal += 2;
      }
    }
    return valFInal;
  }
}
