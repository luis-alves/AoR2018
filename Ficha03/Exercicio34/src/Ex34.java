import java.util.Scanner;

/**
 * Programa imprime todos os números perfeitos até um dado limite (limite).
 *
 * @sid 2012
 * @aid 3.34
 */
public class Ex34 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		int limite = 0;

		do {
			System.out.print("limite (inteiro > 3) = ");
			limite = scanner.nextInt();
		} while (limite <= 3);
		
		scanner.close();
		
		//end_inputs
		
		int soma = 0;

		for (int j = 4; j < limite; j++) {
			soma = 0;
			for (int i = 1; i < j; i++) {
				if (j % i == 0) {
					soma += i;
				}
			}
			
			if (soma == j) {
				System.out.println("Número Perfeito: " + j);
				System.out.print("Fatores:");
				for (int i = 1; i < j; i++) {
					if (j % i == 0) {
						System.out.print(" " + i);
					}
				}
				System.out.println();
				System.out.println();
			}
		}

	}

}
