import java.util.Scanner;

/**
 * Programa que dado um número (num), introduzido pelo utilizador, verifica 
 * se os seus algarismos estão ordenados de forma crescente, decrescente 
 * ou se não estão ordenados.
 *
 * @sid 2012
 * @aid 3.14
 */
public class Ex14 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("num = ");
		int num = scanner.nextInt();
		
		scanner.close();

		//end_inputs
		
		int anterior = num % 10;
		int atual = 0;
		int crescente = 0;
		int decrescente = 0;
		int contador = 0;

		while (num / 10 != 0) {
			num /= 10;
			atual = num % 10;
			if (num % 10 != 0) {
				if (atual > anterior) {
					crescente++;
				} else if (atual < anterior) {
					decrescente++;
				} 
			}

			anterior = num % 10;  
			contador++;
		}
		
		if (crescente == contador) {
			System.out.println("Os algarismos estão ordenados de forma decrescente");
		} else if (decrescente == contador) {
			System.out.println("Os algarismos estão ordenados de forma crescente");
		} else {
			System.out.println("Os algarismos não estão ordenados");
		}

	}

}
