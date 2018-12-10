import java.util.Scanner;

/**
 * Programa para determinar a soma de n termos da progressa?o 
 * geome?trica Ui = ari.
 *
 * @sid 2012
 * @aid 3.6
 */
public class Ficha0306 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual é o valor de r?");
		int r = scanner.nextInt();
		
		System.out.println("Qual é o valor de a?");
		int a = scanner.nextInt();
		
		System.out.println("Qual é o valor de n?");
		int n = scanner.nextInt();
		
		scanner.close();

		//end_inputs
		
		int i = 0;
		int produto = 0;
		
		while (i < n) {
			produto += a * Math.pow(r, i);
			i++;
		}
		
		System.out.print("U = " + produto);

	}
	
}