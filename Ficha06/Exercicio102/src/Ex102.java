/**
 * 
 * Método que recebe uma destas matrizes e calcula a percentagem global de 
 * ensaios com resultado conforme.
 * de cada produto.
 * 
 * @sid 2012
 * @aid 6.10.2
 */
public class Ex102 {

    public static void main(String[] args) {
        //begin_inputs
        int[][] matriz = {{0, 1, 0, 1, 1, 0}, 
                          {1, 1, 0, 1, 1, 1}, 
                          {0, 0, 0, 1, 1, 0}, 
                          {1, 1, 0, 1, 1, 0}};
        //end_inputs
        
        int[] tabelaNaoConformidades = new int[matriz.length];
        
        int total = 0;
        int naoConforme = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j]== 0) {
                    naoConforme++;
                }
                total++;
            }
        }
        
        float media = (1 - naoConforme / (float) total) * 100;
        if (total != 0) {
            System.out.format("Percentagem de ensaios com resultado conforme: "
                                    + "%.1f", media);
            System.out.println(" %");
        }
    }

}
