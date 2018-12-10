import java.util.Scanner;

/**
 * Programa que lê um número (num) maior do que 3 e determine se é perfeito. 
 *
 * @sid 2012
 * @aid 3.33
 */
public class Ex33 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;

		do {
			System.out.print("num (inteiro positivo > 3) = ");
			num = scanner.nextInt();
			
		} while (num <= 3);
		
		scanner.close();

		//end_inputs
		
		int soma = 0;
		
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				soma += i;
			}
		}
		
		if (soma == num) {
			System.out.println(num + " é um número perfeito");
			System.out.print("Fatores:");
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					System.out.print(" " + i);
				}
			}
			
		} else {
			System.out.print(num + " não é um número perfeito");
		}
		

	}

}
