import java.util.Scanner;

/**
 * Programa que calcule a soma e a média de um conjunto de n valores inteiros 
 * introduzidos pelo utilizador, em que n também é definido pelo utilizador.
 *
 * @sid 2012
 * @aid 3.3
 */
public class Ficha0303 {

	public static void main(String[] args) {

		//begin_inputs

		Scanner scanner = new Scanner(System.in);
		
		int i = 0;
		int numero;
		int soma = 0;
		double media = 0.0;
		
		System.out.println("Qual é o número de valores?");
		int n = scanner.nextInt();
		
		while (i < n) {
			System.out.println("Diz um número.");
			numero = scanner.nextInt();
			soma += numero;
			media = (double) soma / (i + 1);
			i++;
		}
		
		System.out.println("Soma: " + soma + " Media: " + media);
		
		
		
		
		scanner.close();
		
		//end_inputs

	}

}
