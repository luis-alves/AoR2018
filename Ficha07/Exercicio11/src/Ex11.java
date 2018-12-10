import java.util.StringTokenizer;

/**
 * Programa que lê uma string (str) dada pelo utilizador, e a 
 * converte numa string que contenha apenas as palavras onde a 
 * letra ‘a’ apareça mais do que uma vez. 
 *
 * @sid 2012
 * @aid 7.11
 */
public class Ex11 {

    public static void main(String[] args) {
        //begin_inputs
        String str = "A Maria compra uma camisa amarela";
        //end_inputs
        
        StringTokenizer palavra = new StringTokenizer(str);
        
        System.out.print(str + " =>");
        while (palavra.hasMoreTokens()) {
            verificaImprimePalavra(palavra.nextToken());
        }
        System.out.println('\b');
    }
    
    private static void verificaImprimePalavra(String palavra) {
        int contador = 0;
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'a') {
                contador++;
            }
        }
        if (contador > 1) {
            System.out.print(" " + palavra);
        }
    }

}
