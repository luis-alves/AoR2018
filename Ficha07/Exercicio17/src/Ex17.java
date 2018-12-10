import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Programa em Java que comece por ler um conjunto de 10 palavras diferentes. 
 * Seguidamente, o programa deve ler uma frase e tentar fazer a sua correção 
 * ortográfica, com base nas palavras obtidas inicialmente. 
 *
 * @sid 2012
 * @aid 7.17
 */
public class Ex17 {

    public static void main(String[] args) {
        //begin_inputs
        String[] dicionario = {"interessa",
                               "interessar",
                               "interessante",
                               "discipulo",
                               "disciplinar",
                               "disciplina",
                               "estamos",
                               "estar",
                               "este",
                               "esta"};
        
        String frase = "esda disciplima é muito intesessan";
        //end_inputs
        Scanner sc = new Scanner(System.in);
        
        StringTokenizer palavra = new StringTokenizer(frase);
        
        int qtPalavras = palavra.countTokens();
        String[] fraseCorrigida = new String[qtPalavras];
        
        int indexPalavra = 0;
        while (palavra.hasMoreTokens()) {
            String pal = palavra.nextToken();
            int listaP;
            listaP = listaDePossibilidades(pal, dicionario);
            String[] palSeleccionadas = new String[listaP];
            palSeleccionadas = listaPalavras(pal, dicionario, listaP);
            char continuar = 'n';
            int index = 0;
            do {
                if (palSeleccionadas.length == 0) {
                    continuar = 's';
                    fraseCorrigida[indexPalavra] = pal;
                } else {
                    System.out.println(pal + " -> " + palSeleccionadas[index%palSeleccionadas.length] + "? (s/n)");
                    continuar = sc.next().charAt(0);
                    if (continuar == 's') {
                        fraseCorrigida[indexPalavra] = palSeleccionadas[index%palSeleccionadas.length];
                    }
                    index++;
                }
            } while (continuar != 's');
            indexPalavra++;
        }
        
        for (String string : fraseCorrigida) {
            System.out.print(string + " ");
        }

    }

    private static String[] listaPalavras(String pal, String[] dicionario, int listaP) {
        String[] resultado = new String[listaP];
        int index = 0;
        for (String dicString : dicionario) {
            int contador = 0;
            if (dicString.charAt(0) == pal.charAt(0) && dicString.charAt(1) == pal.charAt(1)) {
                int comprimentoPal = pal.length();
                int comprimentoDicString = dicString.length();
                int diff = comprimentoDicString - comprimentoPal;
                if (comprimentoPal == comprimentoDicString) {
                    for (int i = 2; i < (comprimentoDicString < comprimentoPal ? comprimentoDicString : comprimentoPal); i++) {
                        if (dicString.charAt(i) == pal.charAt(i)) {
                            contador++;
                        }
                    }
                    if (contador >= comprimentoPal-4) {
                        resultado[index] = dicString;
                        index++;
                    }

                } else if (comprimentoDicString > comprimentoPal && comprimentoDicString <= comprimentoPal+2) {
                    for (int i = 2; i < (comprimentoDicString < comprimentoPal ? comprimentoDicString : comprimentoPal); i++) {
                        if (dicString.charAt(i) == pal.charAt(i)) {
                            contador++;
                        }
                    }
                    if (contador >= comprimentoPal-6) {
                        resultado[index] = dicString; 
                        index++;
                    }
                    
                }

            }
        }
        return resultado;
    }

    private static int listaDePossibilidades(String pal, String[] dicionario) {
        int soma = 0;
        for (String dicString : dicionario) {
            int contador = 0;
            if (dicString.charAt(0) == pal.charAt(0) && dicString.charAt(1) == pal.charAt(1)) {
                int comprimentoPal = pal.length();
                int comprimentoDicString = dicString.length();
                int diff = comprimentoDicString - comprimentoPal;
                if (comprimentoPal == comprimentoDicString) {
                    for (int i = 2; i < (comprimentoDicString < comprimentoPal ? comprimentoDicString : comprimentoPal); i++) {
                        if (dicString.charAt(i) == pal.charAt(i)) {
                            contador++;
                        }
                    }
                    if (contador >= comprimentoPal-4) {
                        soma++;
                    }

                } else if (comprimentoDicString > comprimentoPal && comprimentoDicString <= comprimentoPal+2) {
                    for (int i = 2; i < (comprimentoDicString < comprimentoPal ? comprimentoDicString : comprimentoPal); i++) {
                        if (dicString.charAt(i) == pal.charAt(i)) {
                            contador++;
                        }
                    }
                    if (contador >= comprimentoPal-6) {
                        soma++;
                    }
                    
                }

            }
        }
        return soma;
    }

}
