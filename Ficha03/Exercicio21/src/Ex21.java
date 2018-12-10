import java.util.Scanner;

/**
 * Cálculoejlasdjlkjfl da raiz quadrada de um número.
 *
 * @sid 2012
 * @aid 3.21
 */
public class Ex21 {

	public static void main(String[] args) {

		//begin_inputs

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x = ");
		double x = scanner.nextDouble();
		
		System.out.print("Erro máximo: ");
		double erroMaximo = scanner.nextDouble();
		
		scanner.close();
		
		//end_inputs
		
		double y = x/2;
		double erroInicial;
		double erroFinal = x;
		double valorDeY = x/2;
		
		while (erroFinal > erroMaximo) {
			erroInicial = y;
			y = 0.5 * (y + x / y);
			erroFinal =  Math.abs(y - erroInicial);
			if (erroFinal < erroMaximo) {
				valorDeY = y;
			}
		}
		System.out.println(valorDeY);
		

	}

}
