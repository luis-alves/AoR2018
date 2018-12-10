/**
 * Método que recebe uma matriz quadrada de inteiros de n × n e que devolve 
 * um vetor de n inteiros em que em cada posição é colocado o maior 
 * elemento encontrado na linha correspondente da matriz. Use-o num 
 * programa que leia estas matrizes (matriz) e determine e mostre os 
 * resultados obtidos.
 *
 * @sid 2012
 * @aid 6.8
 */
public class Ex08 {

    public static void main(String[] args) {
        //begin_inputs
        int n = 3;
        
        int[][] matriz = {{10, 20, 30}, {35, 67, 1}, {5, 30, 89}};
        //end_inputs
        
        int[] valoresMaiores = obterValoresMaiores(matriz, n);
        
        System.out.print("Maiores:");
        for (int i = 0; i < valoresMaiores.length; i++) {
            System.out.print(" " + valoresMaiores[i]);
        }
    }
    
    private static int[] obterValoresMaiores(int[][] matriz, int n) {
        int[] vector = new int[n];
        for (int i = 0; i < matriz.length; i++) {
            int maior = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            vector[i] = maior; 
        }
        return vector;
    }

}
