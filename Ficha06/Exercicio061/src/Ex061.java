import java.util.Scanner;

/**
 * Método que implementa a Peneira de Eratosthenes. Este método deve ter 
 * como parâmetro de entrada um número inteiro correspondente ao 
 * limite máximo (limiteMaximo) e deve devolver uma tabela contendo todos 
 * os números primos encontrados. 
 *
 * @sid 2012
 * @aid 6.6.1
 */
public class Ex061 {

    public static void main(String[] args) {
        //begin_inputs
        Scanner sc = new Scanner(System.in);
        int limiteMaximo = 0;
        do {
            System.out.println("limiteMaximo = "); 
            limiteMaximo = sc.nextInt();
        } while (limiteMaximo <= 2);
        sc.close();
        //end_inputs

        int[] primos = new int[limiteMaximo-1]; 
        int[] primos2 = new int[limiteMaximo-1]; 
        int[] serieNumerica = new int[limiteMaximo-1]; 
        for (int i = 2, j = 0; i < primos.length+2; i++, j++) {
            primos[j] = i; 
            primos2[j] = 0; 
            serieNumerica[j] = i;
        }
        int primo = 2;
        int indice = 0;
        for (int i = 0; i < serieNumerica.length; i++) {
            if (serieNumerica[i] > 0 ) {
               primo = serieNumerica[i]; 
               primos2[indice]= primo; 
               indice++;
            }
            for (int j = 0; j < serieNumerica.length; j++) {
                if (serieNumerica[j] % primo == 0 ) {
                    serieNumerica[j] = 0; 
                }
            }
        }
        
        System.out.print("Números primos:");
        for (int i = 0; i < primos2.length; i++) {
           if (primos2[i] > 0) {
               System.out.print(" " + primos2[i]);
        } 
        }
    }

}
