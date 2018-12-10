/**
 * Programa que lê os valores das temperaturas mínimas e máximas 
 * de uma cidade relativas a um mês para uma variável chamada temperaturas 
 * e determina qual foi a maior amplitude térmica verificada nesse mês.
 *
 * @sid 2012
 * @aid 6.4
 */
public class Ex04 {

  public static void main(String[] args) {
    //begin_inputs
    int[][] temperaturas = {{10,43}, {13,30}, {5,30}};
    //end_inputs
    int gradiente = 0;
    int dia = 0;
    
    for (int i = 0; i < temperaturas.length; i++) {
      for (int j = 0; j < temperaturas[i].length-1; j++) {
        int gradienteDia = temperaturas[i][j+1] - temperaturas[i][j];
        if (gradienteDia > gradiente) {
          dia = i+1;
          gradiente = gradienteDia;
       }
      }
    }
    
    System.out.println("A maior amplitude térmica ocorreu no dia " + dia + 
            " (" + gradiente + "º C)");

  }

}
