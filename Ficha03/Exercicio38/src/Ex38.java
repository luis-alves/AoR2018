import java.util.Scanner;

/**
 * Programa que verifica se um número inteiro dado (numero) é uma capicua, 
 * ou seja, se se lê da mesma forma do princípio para o fim e do fim para o 
 * princípio. 
 *
 * @sid 2012
 * @aid 3.38
 */
public class Ex38 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		
		do {
			System.out.println("n (>0) = ");
			numero = scanner.nextInt();
		} while (numero < 0);
		
		scanner.close();
		
		//end_inputs
		
		int copiaNumero = numero;
		int algarismo = 0;

		while (numero > 0) {
			algarismo = algarismo * 10 + numero % 10;
			numero /= 10;
		}

		int copiaAlgarismo = algarismo;
		int duplaCopianumero = copiaNumero;
		int diferencas = 0;

		for (int i = 0; i < copiaAlgarismo/2; i++) {
			int num1 = algarismo % 10;
			int num2 = copiaNumero % 10;
			
			if (num1 != num2) {
				diferencas++;
			}
			
			algarismo /= 10;
			copiaNumero /= 10;
		}
		
		if (diferencas > 0) {
			System.out.print(duplaCopianumero + " não é capicua");
		} else {
			System.out.print(duplaCopianumero + " é capicua");
		}

	}

}
