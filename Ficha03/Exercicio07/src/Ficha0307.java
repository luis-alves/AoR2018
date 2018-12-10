import java.util.Scanner;

/**
 * Programa que determina a percentagem de números pares de um conjunto de n 
 * números inteiros introduzidos pelo utilizador.
 *
 * @sid 2012
 * @aid 3.7
 */
public class Ficha0307 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos números inteiros?");
		int n = scanner.nextInt();
		
		int i = 0;
		int numero = 0;
		int par = 0;
		double percentagem;
		
		while (i < n) {
			System.out.println("Diz um número?");
			numero = scanner.nextInt();
			if (numero % 2 == 0) {
				par++;
			}
			i++;
		}
		
		percentagem = (double) par/n * 100.0;
		
		System.out.println("Percentagem de números pares: " + percentagem + " %");

		scanner.close();
		
		//end_inputs
		

	}

}
