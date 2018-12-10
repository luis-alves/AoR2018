import java.util.Scanner;

/**
 * Programa que determina, para um conjunto de números inteiros positivos, 
 * entre num1 e num2, quais deles são números primos.
 *
 * @sid 2012
 * @aid 3.23
 */
public class Ex23 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		int num1;
		int num2;
		
		do {
			System.out.print("num1 (inteiro positivo) = ");
			num1 = scanner.nextInt();
		} while (num1 <= 0);
		
		do {
			System.out.print("num2 (superior a num1) = ");
			num2 = scanner.nextInt();
		} while (num1 > num2 || num2 <= 0);
		
		scanner.close();
		
		//end_inputs
		
		System.out.println("Números primos entre " + num1 + " e " + 
				num2 + " =");
		
		int contador = 0;
		
		for (int i = num1+1; i < num2; i++) {
			contador = 0;
			if (i == 2) {
				contador = 0;
			} else if (i % 2 == 0){
				contador++;
			} else {
				for (int k = 3; k < i; k+=2) {
					if (i%k == 0) {
						contador++;
					}
				}
			}
			if (contador == 0) {
				System.out.print(" " + i);
			}
		}
	}

}
