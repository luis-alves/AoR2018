import java.util.Scanner;

/**
 * programa que, dado um intervalo em R, calcule um integral.
 *
 * @sid 2012
 * @aid 3.25
 */
public class Ex25 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Limite inferior: ");
		int num1 = scanner.nextInt();
		
		int num2;
		
		do {
			System.out.println("Limite superior: ");
			num2 = scanner.nextInt();
		} while (num2 < num1);
		
		scanner.close();
		
		//end_inputs
		
		double funcaoX0 = 0.5 * (Math.cos(num1) + Math.log(Math.pow(num1, 4) + 1) *
				Math.sin(num1));

		double funcaoXn = 0.5 * (Math.cos(num2) + Math.log(Math.pow(num2, 4) + 1) *
				Math.sin(num2));
		
		double middleValue = 0;
		for (int i = num1+1; i < num2; i++) {
			middleValue += Math.cos(i) + Math.log(Math.pow(i, 4) + 1) *
				Math.sin(num1);
		}
		
		double result = funcaoX0 + middleValue + funcaoXn;

		System.out.println(result);
	}

}
