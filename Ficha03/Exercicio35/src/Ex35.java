import java.util.Scanner;

/**
 * Algoritmo que permite verificar, dados dois números (num1) e (num2),
 * se a soma dos divisores de qualquer deles, incluindo a unidade e 
 * excluindo o próprio número, for igual ao outro número.
 *
 * @sid 2012
 * @aid 3.35
 */
public class Ex35 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		int num1;
		int num2;
		
		do {
			System.out.print("num1 (inteiro positivo) = ");
			num1 = scanner.nextInt();
		} while (num1 < 0);
		
		do {
			System.out.print("num2 (inteiro positivo > num1) = ");
			num2 = scanner.nextInt();
		} while (num1 < 0 || num2 < num1);

		scanner.close();
		
		//end_inputs

		int soma = 0;
		boolean num1EAmigoNum2 = false;
		boolean num2EAmigoNum1 = false;
		
		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0) {
				soma += i;
			}
			if (soma == num2) {
				num1EAmigoNum2 = true;
			}
		}

		soma = 0;
		
		for (int i = 1; i < num2; i++) {
			if (num2 % i == 0) {
				soma += i;
			}
			if (soma == num1) {
				num2EAmigoNum1 = true;
			}
		}
		
		if (num1EAmigoNum2 == true && num2EAmigoNum1 == true) {
			System.out.println(num1 + " e " + num2 + " são números amigos");
		}
		
		soma = 0;
		
		System.out.print("Divisores de " + num1 + ":");

		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0) {
				soma += i;
				if (soma <= num2) {
					if (i == 1) {
						System.out.print( " " + i);
					} else {
						System.out.print( ", " + i);
					}
				}
			}
		}
		System.out.println(" Soma: " + num2);
		
		
		soma = 0;
		
		System.out.print("Divisores de " + num2 + ":");

		for (int i = 1; i < num2; i++) {
			if (num2 % i == 0) {
				soma += i;
				if (soma <= num1) {
					if (i == 1) {
						System.out.print( " " + i);
					} else {
						System.out.print( ", " + i);
					}
				}
			}
		}
		System.out.println(" Soma: " + num1);
	}

}
