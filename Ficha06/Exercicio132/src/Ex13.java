import java.util.Arrays;

/**
 * Método que, recebendo uma destas tabelas e as coordenadas x, y de 
 * uma posição, crie e devolva um vetor contendo os números que, 
 * nesse momento, podem ocupar essa posição da tabela
 *
 * @sid 2012
 * @aid 6.13.2
 */
public class Ex13 {

    public static void main(String[] args) {
        //begin_inputs
        //end_inputs
        int[][] sudoku = {{1,2,0,4,5,6,7,8,9},
                          {2,3,4,5,6,7,8,9,1},
                          {3,0,5,6,7,0,9,1,2},
                          {4,5,6,7,8,9,1,2,3},
                          {5,6,7,8,9,1,2,3,4},
                          {6,7,8,9,1,2,3,4,5},
                          {7,8,0,1,2,3,4,5,6},
                          {8,9,1,2,3,4,5,6,7},
                          {9,1,2,3,4,5,6,7,8}};
        
        int x = 2;
        int y = 2;
        
        int[] valoresNaoPresentes = new int[9];
        
        int index = 0;
        for (int i = x; i <= x; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                if (sudoku[i][j] > 0) {
                    valoresNaoPresentes[index] = sudoku[i][j];
                    index++;
                }
            }
        }
        for (int i = y; i <= y; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                if (sudoku[j][i] > 0) {
                    if (naoExiste(sudoku[j][i], valoresNaoPresentes)) {
                        valoresNaoPresentes[index] = sudoku[i][j];
                        index++;
                    }
                }
            }
        }
        
        int[] resultado = new int[9];
        index = 0;
      
        for (int i = 0; i < 9; i++) {
            if (naoExiste(i, valoresNaoPresentes)) {
                resultado[index] = i;
                index++;
            }
        }
        
        System.out.println(Arrays.toString(numerosPossiveis(resultado, index)));

        
    }
    
    private static int[] numerosPossiveis(int[] vector, int qtValores) {
        int[] resultadoFinal = new int[qtValores];

        for (int i = 0; i < qtValores; i++) {
            resultadoFinal[i] = vector[i]; 
        }
        return resultadoFinal;
    }
    
    private static boolean naoExiste (int num, int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                return false;
            }
        }
        return true;
    }

}
