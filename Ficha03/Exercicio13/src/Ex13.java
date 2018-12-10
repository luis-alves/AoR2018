import java.util.Scanner;

/**
 * Dado um conjunto de número, determina em quantos aparece pelo menos uma vez 
 * o algrarismo n, também fornecido.
 *
 * @sid 2012
 * @aid 3.13
 */
public class Ex13 {

	public static void main(String[] args) {
		
		boolean parar = false;
		int contador = 0;
		char querParar;

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = scanner.nextInt();
		int numero;
		
		do {
			
			do {
				System.out.println("Diga um número: ");
				numero = scanner.nextInt();
			} while (numero >= 0 && numero < 10);
			
			while (numero > 0) {
				if (n == numero % 10) {
					contador++;
				}
				numero /= 10;
			}
			
			do {
				System.out.println("Quer parar? (s/n)");
				querParar = scanner.next().charAt(0);
			} while (querParar != 's' && querParar != 'n');
			
			if (querParar == 's') {
				parar = true;
			}
		} while (parar == false);
		
		scanner.close();
		
		//end_inputs
		
		System.out.println("O algarismo " + n + " surge " + contador + " vezes");

	}

}
