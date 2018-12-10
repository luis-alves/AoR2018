import java.util.Scanner;

/**
 * Programa que recebe do utilizador um número binário (numeroBinario) e 
 * indica no ecrã qual o número de zeros e uns que existem nesse número, 
 * bem como o seu equivalente decimal.
 *
 * @sid 2012
 * @aid 3.31
 */
public class Ex31 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		int numeroBinario;

		do {
			System.out.print("numeroBinario = ");
			numeroBinario = scanner.nextInt();
		} while (numeroBinario <= 0);

		scanner.close();
		
		//end_inputs
		
		int copiaNumBinario = numeroBinario;
		int resultado = 0;
		int quantUns = 0;
		int quantZeros = 0;
		int i = 0;
		
		while (numeroBinario > 0) {
			int numero = numeroBinario % 10;
			if (numero == 1) {
				quantUns++;
			} else {
				quantZeros++;
			}
			resultado += numero * Math.pow(2, i);
			numeroBinario /= 10;
			i++;
			
		}

		System.out.println(copiaNumBinario + " = " + resultado);
		System.out.println("1 - " + quantUns);
		System.out.println("0 - " + quantZeros);
		
	}

}
