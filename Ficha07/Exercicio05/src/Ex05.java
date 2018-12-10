import java.util.StringTokenizer;

/**
 * Programa que dada uma cadeia de caracteres representando um nome de uma 
 * pessoa (nome) o processe abreviando-o.
 *
 * @sid 2012
 * @aid 7.5
 */
public class Ex05 {

    public static void main(String[] args) {
        //begin_inputs
        String nome = "Luís Miguel Oliveira Alves";
        //end_inputs
        
        StringTokenizer palavra = new StringTokenizer(nome);
        
        int numNomes = palavra.countTokens();
        
        String[] listaNomes = new String[numNomes];
        
        int i = 0;
        while (palavra.hasMoreTokens()) {
            listaNomes[i] = palavra.nextToken(); 
            i++;
        }
        
        for (int j = 0; j < listaNomes.length; j++) {
            if (j == 0) {
                System.out.print(listaNomes[j] + " ");
            } else if (j == listaNomes.length-1) {
                System.out.print(listaNomes[j]);
            } else {
                System.out.print(listaNomes[j].charAt(0) + ". ");
            }

        }
    }

}
