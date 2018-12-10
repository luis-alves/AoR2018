import java.util.Scanner;

/**
 * Programa que vai somando todos os números inteiros começando pelo 1 e que 
 * termina quando a soma ultrapasse um limite indicado pelo utilizador (limite).
 *
 * @sid 2012
 * @aid 3.30
 */
public class Ex30 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Qual é o limite da soma = ");
		int limite = scanner.nextInt();
		
		scanner.close();
		
		//end_inputs
		
		int soma = 0;
		int i = 1;
		
		while (soma < limite) {
			soma += i;
			System.out.print(i + " ");
				
			i++;
		}
		System.out.print("(" + soma + ")");

	}

}
