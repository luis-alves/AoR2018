import java.util.Scanner;

/**
 * Programa que, para um número (num) dado pelo utilizador, calcula o que se 
 * obtém a partir dele por inversão dos seus dígitos.
 *
 * @sid 2012
 * @aid 3.15
 */
public class Ex15 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("num = ");
		int num = scanner.nextInt();
		
		scanner.close();
		
		//end_inputs
		
		while (num > 0) {
			System.out.print(num%10);
			num /= 10;
		}
		


	}

}
