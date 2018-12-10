import java.util.Scanner;

/**
 * A partir de um número tamanho que é fornecido pelo utilizador, 
 * o programa desenha um losango de ‘*’ oco.
 *
 * @sid 2012
 * @aid 3.19
 */
public class Ex19 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		int tamanho;
		
		do {
			System.out.print("tamanho (valor impar) = ");
			tamanho = scanner.nextInt();
		} while (tamanho <= 0 || tamanho % 2 == 0);

		scanner.close();
		
		//end_inputs
		
		for (int i = 1; i <= tamanho; i++) {
			if (i%2 != 0) {
				for (int j = i; j <= (tamanho-1); j+=2) {
					System.out.print(" ");
				}
				for (int j = tamanho-i; j < tamanho; j++) {
					if (j == tamanho-i || j == tamanho - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}

		for (int i = 1; i < tamanho; i++) {
			if (i%2 == 0) {
				for (int j = tamanho-i; j < tamanho; j+=2) {
					System.out.print(" ");
				}
				for (int k = tamanho - i; k > 0; k--) {
					if (k == tamanho-i || k == 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}

	}

}
