/**
 * Programa em Java que calcula e imprime os logaritmos binários de todos os 
 * números múltiplos de 100 entre 100 e 1000.
 *
 * @sid 2012
 * @aid 3.40
 */
public class Ex40 {

	public static void main(String[] args) {
		//begin_inputs
		//end_inputs

		for (int i = 100; i <= 1000; i += 100) {
			int numDivisoes = 0;
			
			int copiaI = i;
			while (copiaI >= 2) {
				copiaI /= 2;
				numDivisoes++;
			}
			System.out.println(i + " - " + numDivisoes);
			
		}

	}

}
