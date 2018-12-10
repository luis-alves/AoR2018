import java.util.Scanner;

/**
 * Programa capaz de calcular e imprimir todos os pares de números inteiros 
 * positivos num1 e num2 (com num1 < num2 < 1000), tais que a expressão 
 * seguinte resulte num número inteiro.
 *
 * @sid 2012
 * @aid 3.24
 */
public class Ex24 {

	public static void main(String[] args) {

		//begin_inputs

		Scanner scanner = new Scanner(System.in);
		
		int num1;
		int num2;
		
		do {
			System.out.print("num1 (inteiro positivo) = ");
			num1 = scanner.nextInt();
		} while (num1 <= 0 || num1 >= 1000);
		
		do {
			System.out.print("num2 (superior a num1 e menor de 1000) = ");
			num2 = scanner.nextInt();
		} while (num1 > num2 || num2 <= 0 || num2 > 1000);
		
		scanner.close();

		//end_inputs
		
		double inteiroOuNao;
		
		for (int i = num1; i <= num2; i++) {
			for (int j = num2; j >= num1; j--) {
				inteiroOuNao = (Math.pow(i, 2) + Math.pow(j, 2) + 1) / (1.0 * (i * j));
				if (inteiroOuNao%1 == 0) {
					System.out.println("(" + i + ", " + j + 
							") com produto de " + (int) inteiroOuNao);
				}
			}
		}
	}
}
