import java.util.Scanner;

/**
 * Programa que, dados x números inteiros inseridos pelo utilizador 
 * (numeros), identifique todos os números primos (o valor de x deve 
 * ser pedido ao utilizador).
 *
 * @sid 2012
 * @aid 6.6.2
 */
public class Ex062 {

    public static void main(String[] args) {
        //begin_inputs
        Scanner sc = new Scanner(System.in);
        int x = 0;
        do {
            System.out.println("x = "); 
            x = sc.nextInt();
        } while (x < 0);

        int[] numeros = new int[x];
        for (int i = 0; i < x; i++) {
            do {
                System.out.print("x" + i+1 + ": ");   
                numeros[i] = sc.nextInt(); 
            } while (numeros[i]<=2);
        }
        sc.close();
        //end_inputs
        
        int max = numeroMaximo(numeros);
        
        int[] numPrimos = procuraPrimos(numeros, max);
        
        System.out.print("Números primos:");
        for (int i = 0; i < numPrimos.length; i++) {
           if (numPrimos[i] > 0) {
               System.out.print(" " + numPrimos[i]);
            } 
        }
    }
    
    private static int numeroMaximo(int[] numeros) {
        int max = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        return max;
    }
    
    private static int[] procuraPrimos(int[] numeros, int max) {
        int[] primos = new int[max-1]; 
        int[] primos2 = new int[max-1]; 
        int[] serieNumerica = new int[max-1]; 
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
        
        int[] numerosPrimos = new int[numeros.length];
        int index = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < primos2.length; j++) {
                if (numeros[i] == primos2[j]) {
                    numerosPrimos[index] = numeros[i];
                    index++;
                }
            }
        }
        return numerosPrimos;
        
    }

}
