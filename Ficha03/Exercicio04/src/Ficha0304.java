import java.util.Scanner;

/**
 * Programa que calcula todos os múltiplos, entre 0 e 100, de um número n 
 * qualquer desse intervalo
 *
 * @sid 2012
 * @aid 3.4
 */
public class Ficha0304 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Diz-me um número?");
		int n = scanner.nextInt();
		
		scanner.close();
		
		//end_inputs
		
		int i = 0;
		int multiplo = 0;
		
		System.out.print("Múltiplos de " + n + " entre 0 e 100: ");
		while (i < 100) {
			multiplo += n;
			if (multiplo < 100) {
				System.out.print(multiplo + " ");
			}
			i = multiplo;
		}

	}

}
