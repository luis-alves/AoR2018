/**
 * Método que, recebendo a representação de uma imagem (imagem) e as respetivas 
 * dimensões, determina e devolve o número da cor mais frequente nessa imagem. 
 *
 * @sid 2012
 * @aid 6.11
 */
public class Ex11 {

    public static void main(String[] args) {
        //begin_inputs
        int[][] imagem = {{2, 10, 10, 10},
                          {121, 10, 102, 10},
                          {10, 50, 77, 10},
                          {124, 41, 2, 2}};
        //end_inputs
        
        
        int[] matrizCoresExtraida = extrairMatrizParaVector(imagem);
        
        int numeroMaisFrequente = buscarNumeroMaisFrequente(matrizCoresExtraida);

        System.out.println("Cor mais popular: " + numeroMaisFrequente);
    }
    
    private static int buscarNumeroMaisFrequente(int[] vector) {
        int[][] qtPorNumero = new int[2][vector.length];
        for (int i = 0; i < qtPorNumero.length; i++) {
            for (int j = 0; j < qtPorNumero[0].length; j++) {
            }
        }

        boolean existe = false;
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < qtPorNumero[0].length; j++) {
                if (qtPorNumero[0][j] == vector[i] ) {
                    qtPorNumero[1][j]++;
                    existe = true;
                } 
            }
            if (existe == false) {
                for (int k = 0; k < qtPorNumero[0].length; k++) {
                    if (qtPorNumero[1][k] == 0) {
                        qtPorNumero[0][k] = vector[i]; 
                        qtPorNumero[1][k] = 1; 
                        break;
                    }
                }
            }
            existe = false;
        }
        
        int maior = 0;
        int resulado = 0;
        for (int i = 0; i < qtPorNumero[1].length; i++) {
            if (qtPorNumero[1][i] > maior) {
               maior = qtPorNumero[1][i]; 
               resulado = qtPorNumero[0][i];
            }
        }
        return resulado;
        
    }
    
    private static int[] extrairMatrizParaVector(int[][] img) {
        int[] resultado = new int[img.length * img[0].length];
        
        int indexador = 0;
        for (int i = 0; i < img.length; i++) {
            for (int j = 0, k = 0; j < img[i].length ; k++, j++) {
                    resultado[indexador] = img[i][j]; 
                    indexador++;
            }
        }
        return resultado;
    }

}
