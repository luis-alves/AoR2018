/**
 * Algoritmo que enconta um número de 3 digitos, cuja soma deles elevado ao cubo
 * dá o próprio número.
 *
 * @sid 2012
 * @aid 3.36
 */
public class Ex36 {

	public static void main(String[] args) {

		//begin_inputs
		//end_inputs

		long soma;
		int num;
		int iter;
		
		System.out.print("Os 4 números são:");
		for (int i = 100; i <= 999; i++) {
			soma = 0;
			iter = i;
			while (iter > 0) {
				num = iter % 10;
				soma += Math.pow(num, 3);
				iter /= 10;
			}
			if (soma == i) {
				System.out.print(" " + i);
			}
		}

	}

}
