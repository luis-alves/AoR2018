import java.util.Scanner;

/**
 * Reformula o exercicio 35 da ficha 3, agora com o uso de métodos. 
 *
 * @sid 2012
 * @aid 5.1
 */
public class Ex01 {

	/**
	 * Verifica se um número é amigo do outro.
	 * @param num1
	 * @param num2
	 * @return
	 */
	private static boolean eAmigo(int num1, int num2) {
		int soma = 0;
		boolean num1EAmigoNum2 = false;

		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0) {
				soma += i;
			}
			if (soma == num2) {
				num1EAmigoNum2 = true;
			}
		}

		return num1EAmigoNum2;
	}

	
	/**
	 * Cálcula os amigos de um número.
	 * @param num1
	 * @param num2
	 */
	private static void amigosNum1(int num1, int num2) {
		int soma = 0;
		
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
		
	}

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
		
		if (eAmigo(num1, num2) && eAmigo(num2,num1)) {
			System.out.println(num1 + " e " + num2 + " são números amigos");
			amigosNum1(num1, num2);
			amigosNum1(num2, num1);
		} else {
			System.out.println(num1 + " e " + num2 + " Não são amigos.");
		}
		
	}

}
