import java.util.Scanner;

/**
 * Programa que permite verificar se um dado inteiro x, entre 1 e 99, está 
 * contido num número inteiro n, maior do que x. 
 *
 * @sid 2012
 * @aid 3.41
 */
public class Ex41 {

	public static void main(String[] args) {
		
		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		int x;
		int n;
		
		do {
			System.out.println("x (>=0) = ");
			x = scanner.nextInt();
		} while (x < 0 || x > 99);
		
		do {
			System.out.println("n (>=0 e >x) = ");
			n = scanner.nextInt();
		} while (n < 0);
		
		scanner.close();
		
		//end_inputs
		
		int contador;
		int indice = 0;
		int resposta = 0;
		int copiaX = x;

		while (x > 0) {
			int num1 = x % 10;
			int copiaN = n;
			contador = 0;
			x /= 10;
			while(copiaN > 0) {
				contador++;
				int num2 = copiaN % 10;
				if (num2 == num1) {
					if (indice == 0) {
						indice = contador;
						resposta++;
					} else {
						indice++;
						if (contador == indice + 1) {
							resposta++;
						}
					}
				}
				copiaN /= 10;
			}
		}
		if (resposta >= 1) {
			System.out.print(copiaX + " está contido em " + n);
		} else {
			System.out.print(copiaX + " não está contido em " + n);
		}

	}

}
