import java.util.Scanner;

/**
 * Programa que permitw jogar um jogo com o computador. O computador gera um 
 * número aleatório entre 0 e 1000 e a tarefa do utilizador é tentar 
 * adivinhar esse número. Por cada tentativa o computador indica 
 * se o número introduzido é maior ou menor que o número gerado. 
 * Quando for fornecida a resposta correta, o programa escreve o número 
 * de tentativas que foram efetuadas e termina.
 *
 * @sid 2012
 * @aid 3.22
 */
public class Ex22 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		int numDado;
		int diferenca;
		int contador = 0;
		
		int numSegredo = (int) (Math.random() * 1001);
		
		do {
			System.out.print("Escreva um número inteiro positivo: ");
			numDado = scanner.nextInt();
			
			diferenca = numDado - numSegredo;
			

			if (diferenca < 0) {
				System.out.println("O número secreto é maior do que o dado!\n");
			} else {
				System.out.println("O número secreto é inferior ao que deu!\n");
			}
			
			contador++;
			
		} while (numSegredo != numDado);
		
		System.out.println("Fez " + contador + " tentativas!");

		scanner.close();

		//end_inputs

	}

}
