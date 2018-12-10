import java.util.Scanner;

/**
 * Programa que lê as notas de uma turma de 15 alunos e traça um histograma 
 * das mesmas.
 *
 * @sid 2012
 * @aid 3.29
 */
public class Ex29 {

	public static void main(String[] args) {

		//begin_inputs
		
		Scanner scanner = new Scanner(System.in);
		
		int qt = 0;
		int nota = 0;
		short valor0 = 0;
		short valor1 = 0;
		short valor2 = 0;
		short valor3 = 0;
		short valor4 = 0;
		short valor5 = 0;
		short valor6 = 0;
		short valor7 = 0;
		short valor8 = 0;
		short valor9 = 0;
		short valor10 = 0;
		short valor11 = 0;
		short valor12 = 0;
		short valor13 = 0;
		short valor14 = 0;
		short valor15 = 0;
		short valor16 = 0;
		short valor17 = 0;
		short valor18 = 0;
		short valor19 = 0;
		short valor20 = 0;
		
		
		do {
			System.out.print("nota do " + (qt+1) + "º aluno = ");
			nota = scanner.nextInt();
			
			switch (nota) {
			case 0:
				valor0++;
				break;
			case 1:
				valor1++;
				break;
			case 2:
				valor2++;
				break;
			case 3:
				valor3++;
				break;
			case 4:
				valor4++;
				break;
			case 5:
				valor5++;
				break;
			case 6:
				valor6++;
				break;
			case 7:
				valor7++;
				break;
			case 8:
				valor8++;
				break;
			case 9:
				valor9++;
				break;
			case 10:
				valor10++;
				break;
			case 11:
				valor11++;
				break;
			case 12:
				valor12++;
				break;
			case 13:
				valor13++;
				break;
			case 14:
				valor14++;
				break;
			case 15:
				valor15++;
				break;
			case 16:
				valor16++;
				break;
			case 17:
				valor17++;
				break;
			case 18:
				valor18++;
				break;
			case 19:
				valor19++;
				break;
			case 20:
				valor20++;
				break;
			default:
				break;
			}

			qt++;
		} while (qt < 16 || nota < 0 || nota > 20);
		
		scanner.close();

		//end_inputs
		
		System.out.println();
		
		System.out.print("0 ");
		for (int i = 0; i < valor0; i++) {
			System.out.print("*" );
		}
		
		System.out.println();

		System.out.print("1 ");
		for (int i = 0; i < valor1; i++) {
			System.out.print("*" );
		}
		
		System.out.println();

		System.out.print("2 ");
		for (int i = 0; i < valor2; i++) {
			System.out.print("*" );
		}
		
		System.out.println();

		System.out.print("3 ");
		for (int i = 0; i < valor3; i++) {
			System.out.print("*" );
		}
		
		System.out.println();

		System.out.print("4 ");
		for (int i = 0; i < valor4; i++) {
			System.out.print("*" );
		}
		
		System.out.println();

		System.out.print("5 ");
		for (int i = 0; i < valor5; i++) {
			System.out.print("*" );
		}
		
		System.out.println();

		System.out.print("6 ");
		for (int i = 0; i < valor6; i++) {
			System.out.print("*" );
		}
		
		System.out.println();

		System.out.print("7 ");
		for (int i = 0; i < valor7; i++) {
			System.out.print("*" );
		}
		
		System.out.println();

		System.out.print("8 ");
		for (int i = 0; i < valor8; i++) {
			System.out.print("*" );
		}
		
		System.out.println();

		System.out.print("9 ");
		for (int i = 0; i < valor9; i++) {
			System.out.print("*" );
		}
		
		System.out.println();

		System.out.print("10 ");
		for (int i = 0; i < valor10; i++) {
			System.out.print("*" );
		}
		
		System.out.println();

		System.out.print("11 ");
		for (int i = 0; i < valor11; i++) {
			System.out.print("*" );
		}
		
		System.out.println();

		System.out.print("12 ");
		for (int i = 0; i < valor12; i++) {
			System.out.print("*" );
		}
		
		System.out.println();

		System.out.print("13 ");
		for (int i = 0; i < valor13; i++) {
			System.out.print("*" );
		}
		
		System.out.println();

		System.out.print("14 ");
		for (int i = 0; i < valor14; i++) {
			System.out.print("*" );
		}
		
		System.out.println();

		System.out.print("15 ");
		for (int i = 0; i < valor15; i++) {
			System.out.print("*" );
		}
		
		System.out.println();

		System.out.print("16 ");
		for (int i = 0; i < valor16; i++) {
			System.out.print("*" );
		}
		
		System.out.println();

		System.out.print("17 ");
		for (int i = 0; i < valor17; i++) {
			System.out.print("*" );
		}
		
		System.out.println();

		System.out.print("18 ");
		for (int i = 0; i < valor18; i++) {
			System.out.print("*" );
		}
		
		System.out.println();

		System.out.print("19 ");
		for (int i = 0; i < valor19; i++) {
			System.out.print("*" );
		}
		
		System.out.println();

		System.out.print(" ");
		for (int i = 0; i < valor20; i++) {
			System.out.print("*" );
		}
		

	}

}
