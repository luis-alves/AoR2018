/**
 * Programa que lê duas tabelas de n números inteiros (cada) 
 * (tabela1 e tabela2). Cria uma nova tabela com base na informação 
 * contida nas duas tabelas originais. A nova tabela é construída através 
 * da intercalação dos elementos das duas primeiras, mas invertendo a 
 * ordem dos elementos da segunda.
 *
 * @sid 2012
 * @aid 6.3
 */
public class Ex03 {

  public static void main(String[] args) {
    //begin_inputs
    int[] tabela1 = {10, 11, 12};
    int[] tabela2 = {20, 21, 22};
    //end_inputs
    
    for (int i = tabela1.length - 1, j = 0; i >= 0; i--, j++) {
      System.out.print(tabela2[i] + " ");
      if (i == 0) {
        System.out.print(tabela1[j]);
      } else {
        System.out.print(tabela1[j]+ " " );
      }
    }

  }

}
