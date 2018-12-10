import java.util.Scanner;

/**
 * Programa que determina o máximo divisor comum de dois números inteiros num1 
 * e num2 fornecidos pelo utilizador.
 *
 * @sid 2012
 * @aid 3.9
 */
public class Ficha0309 {

	public static void main(String[] args) {
		
		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual é o primeiro número?");
		int num1 = scanner.nextInt();
		
		System.out.println("Qual é o segundo número?");
		int num2 = scanner.nextInt();
		
		scanner.close();
		
		//end_inputs
		
		int resto = 1;
		int numMenor;
		int numMaior;
		int restoI;
		int numerador;
		
		if (num1 > num2) {
			numMenor = num2;
			numMaior = num1;
		} else {
			numMaior = num2;
			numMenor = num1;
		}

		restoI = numMaior % numMenor;
		if (restoI == 0) {
				System.out.println("MDC de " + num2 + " e " + num1 + ": " +  numMenor);
		} else {
			numerador = numMenor;
			
			while (resto != 0) {
				resto = numerador % restoI;
				if (resto == 0) {
					System.out.println("MDC de " + num2 + " e " + num1 + ": " +  restoI);
				}
				numerador = restoI;
				restoI = resto;
			}
		}

	}

}
