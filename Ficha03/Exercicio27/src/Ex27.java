import java.util.Scanner;

/**
 * Programa que lê um número "num" e determine e apresente, agora, os 
 * fatoriais de todos os números de 1 até "num".
 *
 * @sid 2012
 * @aid 3.27
 */
public class Ex27 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		int num;

		do {
			System.out.print("num (inteiro positivo) = ");
			num = scanner.nextInt();
		} while (num <= 0);
		
		scanner.close();
		
		//end_inputs
		
		System.out.print("Número     ");
		for (int i = 1; i <= num; i++) {
			System.out.print(i + "   ");
		}
		
		System.out.println();
		
		int fatorial = 1;

		System.out.print("Fatorial   ");
		for (int i = 1; i <= num; i++) {
			fatorial *= i;
			System.out.print(fatorial + "   ");
		}
		

		// Para o caso de ser verificado o fatorial de cada um dos algarismos
		// que compõem o número.

//		int reversoNum = 0;
//		
//		// Inverter número
//		while (num > 0) {
//			reversoNum = reversoNum * 10 + num % 10; 
//			num /= 10;
//		}
//		
//		int contador = 0;
//		int novoNum = reversoNum;
//		
//		System.out.print("Número     ");
//		// Imprimir cada algarismo
//		while (reversoNum > 0) {
//			System.out.print(reversoNum%10 + "   ");
//			reversoNum /= 10;
//			contador++;
//		}
//		
//		System.out.println("");
//		System.out.print("Fatorial   ");
//
//		int fatorial;
//		int resultado;
//
//		for (int i = 0; i < contador; i++) {
//			if (i != 0) {
//				novoNum /= 10;
//			}
//			fatorial = novoNum % 10;
//			resultado = 1;
//			for (int j = fatorial; j > 0; j--) {
//				resultado *= j;
//			}
//			System.out.print(resultado + "   ");
//
//		}

	}

}
