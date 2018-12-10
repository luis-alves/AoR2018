import java.util.Arrays;

/**
 * Programa para resolver sistemas de n equações lineares a n incógnitas 
 * utilizando o método de eliminação de Gauss.
 *
 * @sid 2012
 * @aid 6.12
 */
public class Ex12 {

    public static void main(String[] args) {
        //begin_inputs
        
        double[][] A = {{1, 1, 3, 4},
                     {2, 1, 1, 0},
                     {2, 2, 1, 4},
                     {2, 2, 2, 8}};
        
        double[] b = {1, -1, 0, 1};
        //end_inputs
        
        for (int i = 0; i < A.length; i++) {
            System.out.println(Arrays.toString(A[i]) + " * " + (char)(97+i) + " = " + b[i]);
        }
        
        double[][] matriz = adicionarVectorAMatriz(A, b);

        // TODO Adicionar possibilidade de pivô ser zero
        double operador = 0;
        int k = 0;
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[k][k] == 0) {
                    operador = -1 * (matriz[i][j]);
                } else {
                    operador = -1 * matriz[i][j] / matriz[k][k]; 
                }
                subtrairVectores(matriz, i, j, operador);
                k++;
            }
            k=0;
        }
        
        System.out.println();
        System.out.println("Matriz após algoritmo de eliminação de Gauss:");

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
    
    private static void subtrairVectores(double[][] matriz, int indice, int base, double operador) {
        for (int i = 0; i < matriz[indice].length; i++) {
            // Inserir condição caso o valor matriz[0] seja zero
            matriz[indice][i] += matriz[base][i] * operador;
        }
    }
    
    private static double[][] adicionarVectorAMatriz(
                                                double[][] matriz, double[] vector) {

        double[][] matrizResultante = new double[matriz.length][matriz[0].length+1];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= matriz[i].length; j++) {
                if (j == matriz[0].length) {
                    matrizResultante[i][j] = vector[i];
                } else {
                    matrizResultante[i][j] = matriz[i][j];
                }
            }
        }
        return matrizResultante;
    }

}
