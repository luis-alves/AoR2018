import java.util.Scanner;

/**
 * Determina todos os números com n algarismos que possuem a característica 
 * de se replicar nos algarismos menos significativos, quando elevados ao 
 * quadrado. 
 *
 * @sid 2012
 * @aid 3.37
 */
public class Ex37 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.println("n (> 0) = ");
			n = scanner.nextInt();
		} while (n < 0);
		
		scanner.close();
		//end_inputs
		
		int quadrado;
		
		for (int i = (int) Math.pow(10, n) / 10; i < Math.pow(10, n); i++) {
			quadrado = i * i;
			int copiaQuadrado = quadrado;

			int iter = i;
			int num1 = 0;
			int num2 = 0;
			int soma = 0;

			for (int j = 0; j < n; j++) {
				num1 = iter % 10;
				num2 = quadrado % 10;
				if (num1 == num2) {
					soma++;
				}
				iter /= 10;
				quadrado /= 10;
			}
			if (soma == n) {
				System.out.print(i + " (" + i + "*" + i + "=" + copiaQuadrado +
						")");
				System.out.println();
			}
		}

	}

}
