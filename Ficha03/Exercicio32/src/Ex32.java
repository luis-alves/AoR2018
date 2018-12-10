import java.util.Scanner;

/**
 * Programa que converte um número decimal no seu equivalente na base 2.
 *
 * @sid 2012
 * @aid 3.32
 */
public class Ex32 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		int numeroDecimal;
		
		do {
			System.out.println("numeroDecimal (inteiro positvo) = ");
			numeroDecimal = scanner.nextInt();
		} while (numeroDecimal <= 0);
		
		scanner.close();

		//end_inputs
		
		
		int resto;
		long numBinario = 0;
		int copiaNumeroDecimal = numeroDecimal;

		for (; numeroDecimal > 0;) {
			resto = numeroDecimal % 2;
			if (resto == 0) {
				numBinario *= 10;
			} else {
				numBinario = numBinario * 10 + 1;
			}
			numeroDecimal /= 2;
		}
		
		long resultado = 0;
		long resto2;

		while (numBinario > 0) {
			resto2 = numBinario % 10;
			if (resto2 == 0) {
				resultado *= 10;
			} else {
				resultado = resultado * 10 + 1;
			}
			numBinario /= 10;
		}

		System.out.print(copiaNumeroDecimal + " = " + resultado);

	}

}
