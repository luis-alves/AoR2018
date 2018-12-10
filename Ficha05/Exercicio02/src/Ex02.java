import java.util.Scanner;

/**
 * Programa que calcula o número de combinações de n elementos de um conjunto, 
 * tomados k a k.
 *
 * @sid 2012
 * @aid 5.2
 */
public class Ex02 {

	public static void main(String[] args) {
		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("n = ");
		int n = scanner.nextInt();
		
		System.out.println("k = ");
		int k = scanner.nextInt();
		
		scanner.close();
		
		//end_inputs
		
		System.out.print("C = " + comb(n, k));
	}
	

	/**
	 * Cálcula o número de combinações entre dois números.
	 * @param n
	 * @param k
	 * @return fatorial
	 */
	public static long comb(int n, int k) {
		long res = fact(n-k);
		long fk = fact(k);
		long fn = fact(n);
		long fatorial = fn / (fk * res);

		return fatorial;
	}


	/**
	 *  Cálcula o fatorial de um número.
	 * @param num
	 * @return total
	 */
	public static long fact(int num) {
		long total = 1;
		
		for (int j = 1; j <= num; j++) {
			total *= j; 
		}
		
		return total;
	}

}
