import java.util.Scanner;

/**
 * Programa que determina o mínimo múltiplo comum de dois números inteiros num1 
 * e num2 fornecidos pelo utilizador.
 *
 * @sid 2012
 * @aid 3.10
 */
public class Ex10 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual é o primeiro número?");
		int num1 = scanner.nextInt();
		
		System.out.println("Qual é o segundo número?");
		int num2 = scanner.nextInt();
		
		scanner.close();
		
		//end_inputs
		
		int test1 = num1;
		int test2 = num2;
		int resultado = 1;
		int ePrimo = 0;
		int primo = 2;
		int i;
		
		while (test1 > 1 || test2 > 1) {
			// Calcular se é um numero primo:
			if (primo > 2) {
				while (ePrimo == 0) {
					if(primo % 2 == 0) {
						ePrimo = 0;
					} else {
						ePrimo = 1;
					}
					i = 3;
					while (i < primo && primo > 3) {
						if (primo % i == 0) {
							ePrimo = 0;
							i += primo;
						} else {
							i += 2;
						}
					}
					if (ePrimo == 0 && primo > 3) {
						primo++;
					} else {
						ePrimo = 1;
					}
				}
			}
			ePrimo = 0;

			// Fim do cálculo de número primo
			
			
			if (test1 % primo == 0 && test2 % primo == 0) {
				test1 /= primo;
				test2 /= primo;
				resultado *= primo;
			} else if (test1 % primo == 0 && test2 % primo != 0) {
				test1 /= primo;
				resultado *= primo;
			} else if (test1 % primo != 0 && test2 % primo == 0) {
				test2 /= primo;
				resultado *= primo;
			} else if (test1 % primo != 0 && test2 % primo != 0){
				primo++;
			}

		}
		System.out.println("MMC de " + num2+ " e " + num1 + ": " + resultado);

	}

}
