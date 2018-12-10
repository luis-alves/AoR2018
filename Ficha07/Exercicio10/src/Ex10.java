import java.util.StringTokenizer;

/**
 * Programa que lê uma frase (frase), identifica as palavras que a 
 * compõem e imprime as palavras e o número dos seus caracteres. 
 *
 * @sid 2012
 * @aid 7.10
 */
public class Ex10 {

    public static void main(String[] args) {
        //begin_inputs
        String frase = "o gato comeu o biscoito";
        //end_inputs
        
        StringTokenizer palavras = new StringTokenizer(frase);
        
        while (palavras.hasMoreElements()) {
            contarImprimirLetras(palavras.nextToken());
        }
    }
    
    private static void contarImprimirLetras(String palavra) {
        System.out.println(palavra + " - " + palavra.length());
    }

}
