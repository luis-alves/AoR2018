import java.util.Arrays;

/**
 * Programa capaz de simular uma versão simplificada do jogo “Sudoku”.
 *
 * @sid 2012
 * @aid 6.13.1
 */
public class Ex131 {

    public static void main(String[] args) {
        //begin_inputs
        //end_inputs
        int[][] sudoku = new int[9][9];

        int numAInserir = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                numAInserir = (int)(Math.random() * 10);
                if (numAInserir == 0) {
                    sudoku[i][j] = numAInserir;
                } else {
                    do {
                        numAInserir = (int)(Math.random() * 10);
                    } while (podeSerInserido(sudoku, numAInserir, i, j) == false);
                    sudoku[i][j] = numAInserir;
                }
            }
        }
        
        for (int i = 0; i < sudoku.length; i++) {
           System.out.println(Arrays.toString(sudoku[i])); 
        }

    }
    
    private static boolean podeSerInserido(
                    int[][] matriz, int num, int linha, int coluna) {
        if (num == 0) {
            return true;
        }
        for (int i = linha; i <= linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (matriz[linha][j] == num) {
                    return false;
                }
            }
            for (int j = coluna+1; j < matriz.length; j++) {
                if (matriz[linha][j] == num) {
                    return false;
                }
            }
        }
        
        for (int i = coluna; i <= coluna; i++) {
            for (int j = 0; j < linha ; j++) {
                if (matriz[j][coluna] == num ) {
                    return false;
                }
            }
            for (int j = linha+1; j < matriz.length; j++) {
                if (matriz[j][coluna] == num ) {
                    return false;
                }
            }
        }
        return true;
    }

}
