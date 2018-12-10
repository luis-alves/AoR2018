import java.util.Scanner;

/**
 * Programa que dado um número "num" calcula o seu fatorial.
 *
 * @sid 2012
 * @aid 3.26
 */
public class Ex26 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.print("num (inteiro positivo) = ");
			num = scanner.nextInt();

		} while (num <= 0);
		
		scanner.close();
		
		//end_inputs
		
		int numTotal = num;			// Deveria ser double mas o teste exige int!

		for (int i = num-1; i > 0; i--) {
			numTotal *= i;
		}
		
		System.out.println("Fatorial de " + num + ": " + numTotal);

	}

}
