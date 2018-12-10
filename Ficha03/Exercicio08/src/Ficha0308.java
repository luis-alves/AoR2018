import java.util.Scanner;

/**
 * Programa que lê as alturas dos alunos de uma turma com 20 alunos e 
 * determine quantos são baixos (menos de 1,55 m), de altura média (entre 
 * 1,55 m e 1,70 m) e altos (mais de 1,70 m).
 *
 * @sid 2012
 * @aid 3.8
 */
public class Ficha0308 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		double altura;
		int alturaBaixa = 0;
		int alturaMedia = 0;
		int alturaAlta = 0;
		
		int i = 1;
		
		while (i <= 20) {
			System.out.println("Qual é a altura do " + i + "º aluno?");
			altura = scanner.nextDouble();
			if (altura < 1.55) {
				alturaBaixa++;
			} else if (altura < 1.7) {
				alturaMedia++;
			} else {
				alturaAlta++;
			}
			i++;
		}
		
		System.out.println("São " + alturaBaixa + " alunos de altura baixa, "
				+ "outros " + alturaMedia + " são de altura média e outros "
						+ alturaAlta + " são de altura alta.");
		
		scanner.close();
		
		//end_inputs

	}

}
