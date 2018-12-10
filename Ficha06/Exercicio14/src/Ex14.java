
//import java.util.Arrays;
import java.util.Scanner;

/**
 * Método que cria um Triângulo de Pascal com qualquer dimensão. Recebe como
 * parâmetro a dimensão pretendida (dimensao) e devolve a referência para uma
 * matriz que contém o Triângulo de Pascal dessa dimensão.
 *
 * @sid 2012
 * @aid 6.14
 */
public class Ex14 {

    public static void main(String[] args) {
        // begin_inputs
        Scanner sc = new Scanner(System.in);

        int dimensao = 0;
        do {
            System.out.println("dimensao = ");
            dimensao = sc.nextInt();
        } while (dimensao < 1);

        sc.close();
        // end_inputs

        trianguloPascal(dimensao);

    }

    private static int[][] trianguloPascal(int dimensao) {
        int[][] resultado = new int[dimensao][dimensao];

        int counter = dimensao;
        int soma = 0;
        for (int i = 0; i < dimensao; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == dimensao - counter) {
                    resultado[i][j] = 1;
                } else {
                    if (i > 1) {
                        soma = resultado[i - 1][j - 1] + resultado[i - 1][j];
                    }
                    resultado[i][j] = soma;
                }
            }
            counter--;
        }
        return resultado;
    }

}
