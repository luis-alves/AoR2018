import java.util.Scanner;

/**
 * Programa que calcula o maior de n valores inteiros introduzidos pelo 
 * utilizador, em que n é previamente fornecido pelo utilizador.
 *
 * @sid 2012
 * @aid 3.2
 */
public class Ficha0302 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		int i = 0;
		int max = 0;
		
		System.out.println("Qual é o número valores inteiros?");
		int n = scanner.nextInt();
		
		while (i < n) {
			System.out.println("Diz um valor.");
			int num = scanner.nextInt();
			if (num > max) {
				max = num;
			}
			i++;
		}
		
		System.out.println("O maior é: " + max);
		
		scanner.close();
		
		//end_inputs
		
	}

}
