import java.util.Scanner;;

/**
 * Programa que escreve todos os números inteiros entre 1 e um limite
 *  introduzido pelo utilizador (limite).
 *
 * @sid 2012
 * @aid 3.1
 */
public class FIcha0301 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Qual é o número?");
		int limite = sc.nextInt();
		
		sc.close();
		
		//end_inputs
		
		int i = 1;
		
		while (i <= limite) {
			System.out.print(i + " ");
			i++;
		}

	}

}
