import java.util.Scanner;

/**
 * Programa capaz de escrever no ecrã uma pirâmide de números, sabendo-se 
 * que o seu número de linhas pode estar entre 1 e 9, e que este valor será 
 * fornecido pelo utilizador (numeroLinhas).
 *
 * @sid 2012
 * @aid 3.17
 */
public class Ex17 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		int numeroLinhas = 0;
		
		do {
			System.out.print("numeroLinhas = ");
			numeroLinhas = scanner.nextInt();
			
		} while (numeroLinhas < 1 || numeroLinhas > 9);
		
		scanner.close();
		
		//end_inputs
		
		for (int i = 1; i <= numeroLinhas; i++) {
			for (int k = numeroLinhas - i; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int l = i-1; l > 0; l--) {
				System.out.print(l);
			}
			for (int h = numeroLinhas - i; h > 0; h--) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
