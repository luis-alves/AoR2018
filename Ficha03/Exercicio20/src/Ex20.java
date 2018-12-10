import java.util.Scanner;

/**
 * Programa que lê um conjunto de caracteres introduzidos pelo utilizador 
 * (input) e os converta no valor numérico correspondente. Admita que 
 * podem ser introduzidos espaços excedentários e outros caracteres não 
 * válidos que o seu programa deve ignorar. 
 *
 * @sid 2012
 * @aid 3.20
 */ 
public class Ex20 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("nume ");
		String input = scanner.nextLine();
		
		scanner.close();
		
		//end_inputs

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) > 47 && input.charAt(i)< 58 || 
				input.charAt(i) == 45 || input.charAt(i) == 46) {
				System.out.print(input.charAt(i));
			}
		}
	}

}
