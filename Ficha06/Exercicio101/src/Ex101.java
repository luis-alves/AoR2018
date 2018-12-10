/**
 * 
 * Método que recebe uma matriz e calcula o numero de não conformidades 
 * de cada produto.
 * @sid 2012
 * @aid 6.10.1
 */
public class Ex101 {

    public static void main(String[] args) {
        //begin_inputs
        int[][] matriz = {{0, 1, 0, 1, 1, 0}, 
                          {1, 1, 0, 1, 1, 1}, 
                          {0, 0, 0, 1, 1, 0}, 
                          {1, 1, 0, 1, 1, 0}};
        //end_inputs
        
        int[] tabelaNaoConformidades = new int[matriz.length];
        
        for (int i = 0; i < matriz.length; i++) {
            int soma = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j]== 0) {
                    soma++;
                }
            }
            tabelaNaoConformidades[i] = soma;
        }
        
        for (int i = 0; i < tabelaNaoConformidades.length; i++) {
            if (tabelaNaoConformidades[i] == 1) {
            System.out.println("Produto " + (i+1) + ": " + 
                                    tabelaNaoConformidades[i] + 
                                        " não-conformidade");
            } else {
                System.out.println("Produto " + (i+1) + ": " + 
                                tabelaNaoConformidades[i] + 
                                " não-conformidades");
            }
        }
        
    }

}
