import java.util.StringTokenizer;

/**
 * Programa que, dadas duas strings, a primeira contendo uma frase (frase) e 
 * a segunda uma palavra (palavra), determina quantas vezes a palavra
 * aparece na frase. 
 *
 * @sid 2012
 * @aid 7.9
 */
public class Ex09 {

    public static void main(String[] args) {
        //begin_inputs
        String frase = "o gato comeu o biscoito";
        String palavra = "gato";
        //end_inputs
        
        StringTokenizer palavrasFrase = new StringTokenizer(frase);

        int count = 0;
        while (palavrasFrase.hasMoreTokens()) {
            if (palavrasFrase.nextToken().equals(palavra)) {
                count++;
            }
        }
        
        System.out.println('"' + palavra + '"' + " aparece " + count + 
                        " vez na frase " + '"' + frase + '"');
    }

}
