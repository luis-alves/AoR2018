import java.util.Scanner;

/**
 * Programa consiste em acrescentar um dígito ao número original de modo a que a 
 * soma dos dígitos do novo número seja um número par. Para isso 
 * acrescenta-se um ‘0’ ou um ‘1’ à direita do número original, 
 * conforme necessário. 
 *
 * @sid 2012
 * @aid 3.16
 */
public class Ex16 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("numeroCartao = ");
		int numeroCartao = scanner.nextInt();
		
		scanner.close();

		//end_inputs
		
		int copiaNumeroCartao = numeroCartao;
		int soma = 0;
		
		while (numeroCartao > 0) {
			soma += numeroCartao % 10;
			numeroCartao /= 10;
		}
		
		if (soma % 2 == 0) {
			System.out.print("Numero final = " + copiaNumeroCartao * 10);
		} else {
			System.out.print("Numero final = " + (copiaNumeroCartao * 10 + 1));
		}

	}

}
