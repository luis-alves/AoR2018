/**
 * Programa que lê duas matrizes quaisquer (matriz1 e matriz2), 
 * procede à sua multiplicação, se for possível, e apresenta a 
 * matriz resultante. Quando não for possível efetuar a 
 * multiplicação o programa apresentará uma mensagem elucidativa. 
 *
 * @sid 2012
 * @aid 6.9
 */
public class Ex09 {

    public static void main(String[] args) {
        //begin_inputs
        int[][] matriz1 = {{10, 10}, {10, 10}};
        int[][] matriz2 = {{20, 20, 30}, {40, 50, 60}};
        //end_inputs
        
        if (matriz1[0].length != matriz2.length) {
            System.out.println("As matrizes não são compativeis "
                            + "para a multiplicação");
        } else {
            long[][] produto2Matrizes = multiplicaMatrizes(matriz1, matriz2);
            imprimeResultado(produto2Matrizes);
        }
    }
    
    private static void imprimeResultado(long[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][0]);
            for (int j = 1; j < matriz[i].length; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println();
        }
    }
    
    // Prof diz que há um loop mais simples, infelizmente, após muitas horas,
    // nesta solução que funciona decidi prosseguir com a vida.
    private static long[][] multiplicaMatrizes(int[][] m1, int[][] m2) {
        long[][] resultado = new long[m1.length][m2[0].length];
        for (int i = 0, f = 0; i < m1.length; i++, f--) {
            for (int k = 0; k < m2[0].length; k++) {
                for (int j = 0; j < m1[0].length; j++) {
                    resultado[i][k] += m1[i][j] * m2[j][i+k+f]; 
                }
            }
        }
        return resultado;
    }
    
}
