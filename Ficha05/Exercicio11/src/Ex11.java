import java.util.Scanner;

/**
 * Algoritmo que “desenhe" um calendário para um determinado mês.
 *
 * @sid 2012
 * @aid 5.11
 */
public class Ex11 {

  public static void main(String[] args) {
    //begin_inputs
    Scanner sc = new Scanner(System.in);
    System.out.println("numDias = ");
    int numDias = sc.nextInt();
    System.out.println("primeiroDiaSemana = ");
    String primeiroDiaSemana = sc.next();
    sc.close();
    //end_inputs
    
    System.out.println("D    S    T    Q    Q    S    S");
    int diaSem = diaSemana(primeiroDiaSemana);

    int i = 0;
    while (i < diaSem) {
      System.out.print("     ");
      i++;
    }

    int dia = 1;
    while (diaSem < 7) {
      System.out.print(dia + "    ");
      dia++;
      diaSem++;
    }
    System.out.println();

    while (dia <= numDias) {
      for (int j = dia; j < dia+7 && j <= numDias; j++) {
        if (j >= 10) {
          System.out.print(j + "   ");
        } else {
          System.out.print(j + "    ");
        }
      }
      dia += 7;
      System.out.println();
    }
  }
    
  
  private static int diaSemana(String dia) {
    int result = 0;
    switch (dia) {
      case "Domingo":
        result = 0;
        break;
      case "Segunda-feira":
        result = 1;
        break;
      case "Terça-feira":
        result = 2;
        break;
      case "Quarta-feira":
        result = 3;
        break;
      case "Quinta-feira":
        result = 4;
        break;
      case "Sexta-feira":
        result = 5;
        break;
      case "Sábado":
        result = 6;
        break;
      default:
        break;
    }
    
    return result;
  }

}
