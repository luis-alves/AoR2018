import java.util.StringTokenizer;

/**
 * Encontre as palavras compostas de duas palavras num dicionário.
 *
 * @sid 2012
 * @aid 7.14
 */
public class Ex14 {

    public static void main(String[] args) {
        //begin_inputs
        String palavras = "a\n" + 
                          "ateu\n" +
                          "cão\n" +
                          "dado\n" + 
                          "fim\n" +
                          "fura\n" +
                          "furacão\n" +
                          "mal\n" + 
                          "mão\n" + 
                          "mar\n" +
                          "marfim\n" + 
                          "maltratar\n" +
                          "sal\n" +
                          "salmão\n" +
                          "sol\n" +
                          "soldado\n" +
                          "teu\n" +
                          "tratar\n";
        //end_inputs
        
        System.out.println("Palavras compostas:");
        
        StringTokenizer palavra = new StringTokenizer(palavras, "\n");
        
        String[] todasPalavras = new String[palavra.countTokens()];
        
        int i = 0;
        while (palavra.hasMoreTokens()) {
            todasPalavras[i] = palavra.nextToken();             
            i++;
        }
        
        // TODO Fazer para palavras no inverso.
        procurarPalavrasCompostas(todasPalavras);

    }
    
    private static void procurarPalavrasCompostas(String[] listaPalavras) {
        for (String palavra : listaPalavras) {
            for (String string : listaPalavras) {
                for (String string2 : listaPalavras) {
                    if (string.concat(string2).equals(palavra)) {
                        System.out.println(string.concat(string2));
                    }
                }
            }
        }
    }

}
