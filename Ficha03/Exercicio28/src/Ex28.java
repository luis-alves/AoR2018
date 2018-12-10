import java.util.Scanner;

/**
 * Programa que pede ao utilizador dois valores inteiros (num1 e num2) 
 * e calcula a soma de todos os números ímpares entre eles, incluindo 
 * os próprios números.
 *
 * @sid 2012
 * @aid 3.28
 */
public class Ex28 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		int num1;
		int num2;
		
		do {
			System.out.print("num1 (Inteiro positivo) = ");
			num1 = scanner.nextInt();
		} while (num1 < 0);
		
		do {
			System.out.print("num2 (Inteiro positivo maior que num1) = ");
			num2 = scanner.nextInt();
		} while (num2 < 0 || num2 < num1);

		scanner.close();
		
		//end_inputs
		
		int somatorio = 0;
		
		for (int i = num1; i <= num2; i++) {
			if (i % 2 != 0) {
				if (i+1 == num2) {
					System.out.print(i + " ");
				} else {
					System.out.print(i + " + ");
				}
				somatorio += i;
			}
		}
		System.out.print("= " + somatorio);

	}

}
