import java.util.Scanner;

/**
 *  Programa que recebendo um qualquer número inteiro positivo (numero), 
 *  devolva a soma dos seus dígitos.
 *
 * @sid 2012
 * @aid 3.12
 */
public class Ex12 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Número = ");
		int numero = scanner.nextInt();
		
		scanner.close();
		
		//end_inputs
		
		int soma = 0;
		int contador = 0;
		int copiaNumero = numero;
		int num;
		
		while (numero > 0) {
			soma += numero % 10;
			numero /= 10;
			contador++;
		}
		
		// Decomposição da variável "numero"
		while (copiaNumero > 0) {
			num = (int) (copiaNumero / Math.pow(10, contador - 1));
			if (contador != 1) {
				System.out.print(num + "+");
			} else {
				System.out.print(num + " ");
			}
			copiaNumero %= Math.pow(10, contador - 1);
			contador--;
		}
		
		System.out.print("= " + soma);

	}

}
