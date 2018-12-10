import java.util.Scanner;

/**
 * Calcula o logaritmo binário de um número n.
 *
 * @sid 2012
 * @aid 3.39
 */
public class Ex39 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		double n;
		
		do {
			System.out.println("n (>0) = ");
			n = scanner.nextDouble();
		} while (n < 0);
		
		scanner.close();
		
		//end_inputs
		
		int numDivisoes = 0;
		double copiaN = n;
		
		while (n >= 2) {
			n /= 2;
			numDivisoes++;
		}
		
		System.out.print("lg(" + copiaN + ") = " + numDivisoes);
		
		

	}

}
