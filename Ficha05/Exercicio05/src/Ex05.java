import java.util.Scanner;

/**
 * Programa que executa a soma de duas frações e devolve o resultado também como fração. 
 * O programa deve pedir ao utilizador o numerador e denominador de cada fração que deverão
 * ser sempre inteiros (numerador1, denominador1, numerador2, denominador2). Depois de obtido 
 * o resultado, este deverá ser também simplificado. 
 *
 * @sid 2012
 * @aid 5.5
 */
public class Ex05 {

  public static void main(String[] args) {
    //begin_inputs
    Scanner sc = new Scanner(System.in);
    
    System.out.println("numerador1 =");
    int numerador1 = sc.nextInt();
    
    int denominador1 = 0;
    do {
      System.out.println("denominador1 =");
      denominador1 = sc.nextInt();
    } while (denominador1 == 0);
    
    System.out.println("numerador2 =");
    int numerador2 = sc.nextInt();
    
    int denominador2 = 0;
    do {
      System.out.println("denominador2 =");
      denominador2 = sc.nextInt();
    } while (denominador2 == 0);
    
    sc.close();
    //end_inputs
    
    int multiplicadorDeNum1 = mmc(denominador1, denominador2);
    int multiplicadorDeNum2 = mmc(denominador2, denominador1);
    
    if (multiplicadorDeNum1 == multiplicadorDeNum2) {
      if (denominador1 < denominador2) {
        numerador1 *= multiplicadorDeNum1;
        denominador1 *= multiplicadorDeNum1;
      } else {
        numerador2 *= multiplicadorDeNum2;
        denominador1 *= multiplicadorDeNum1;
      } 
    } else {
      numerador1 *= multiplicadorDeNum1;
      denominador1 *= multiplicadorDeNum1;
      numerador2 *= multiplicadorDeNum2;
    }
    System.out.print("R = " + (numerador1+numerador2) + " / " + (denominador1));
  }
  
  public static int mmc(int a, int b) {
    if (a%b == 0 || b%a == 0) {
      if (a > b) {
        return a/b;
      } else {
        return b/a;
      }
    }
    return b;
  }

}
