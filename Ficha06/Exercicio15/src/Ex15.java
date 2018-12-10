import java.util.Arrays;
import java.util.Scanner;

/**
 * Método que procura todas as ocorrências de determinada palavra (palavra) no 
 * quebra-cabeças.
 *
 * @sid 2012
 * @aid 6.15
 */
public class Ex15 {

    public static void main(String[] args) {
        //begin_inputs
        char[][] retangulo = {{'E', 'l', 'u', 'a', 'l', 'q'},
                             {'L', 'e', 'r', 'r', 's', 's'},
                             {'u', 'w', 'u', 'q', 'g', 'r'},
                             {'a', 'a', 'l', 'l', 'u', 'a'},
                             {'p', 'm', 'h', 'u', 'd', 'j'}};
        
        Scanner sc = new Scanner(System.in);
        System.out.println("palavra = ");
        String palavra = sc.next();
//        String palavra = "lua";
        sc.close();
        //end_inputs
        
        converterMaiusculasEmMinusculas(retangulo);
        
        int jaImprimiu = imprimeLocalPalavraLinha(retangulo, palavra);


        int imprimiu = imprimeLocalPalavraColuna(retangulo, palavra, jaImprimiu);
        
        if (jaImprimiu != 1 && imprimiu != 1) {
            System.out.println("Não contém a palavra");
        }

    }
    
    private static void converterMaiusculasEmMinusculas(char[][] retangulo) {
        for (int i = 0; i < retangulo.length; i++) {
            for (int j = 0; j < retangulo[0].length; j++) {
                retangulo[i][j] = Character.toLowerCase(retangulo[i][j]); 
            }
        }
//        for (int i = 0; i < retangulo.length; i++) {
//            System.out.println(Arrays.toString(retangulo[i]));
//        }
    }
    
    private static int imprimeLocalPalavraColuna(
                    char[][] matriz, String palavra, int imprimiu) {
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[j][i] == palavra.charAt(0) ) {
                    int contador = 0;
                    for (int k = j+1, m = 1; k < j+palavra.length() && k <= matriz.length-1; k++, m++) {
                        if (matriz[k][i] == palavra.charAt(m)) {
                            contador++;
                        }
                    }
                    if (contador == palavra.length()-1) {
                        if (imprimiu == 1) {
                            System.out.println("Ao longo da coluna " + i + " com início na linha " + j);
                        } else {
                            System.out.println("A palavra " + palavra + " surge:");
                            System.out.println("Ao longo da coluna " + i + " com início na linha " + j);
                            imprimiu = 1;
                        }
                    }
                }
            }
        }
        return imprimiu;
    }
    
    private static int imprimeLocalPalavraLinha(
                    char[][] matriz, String palavra) {
        int encontrouLinha = 0;
        int imprimiu = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == palavra.charAt(0)) {
                    int contador = 0;
                    for (int k = j+1, m = 1; k < j+palavra.length() && k <= matriz[0].length-1; k++, m++) {
                        if (matriz[i][k] == palavra.charAt(m)) {
                            contador++;
                        }
                    }
                    if (contador == palavra.length()-1) {
                        if (imprimiu == 0) {
                            System.out.println("A palavra " + palavra + " surge:");
                            System.out.println("Ao longo da linha " + i + " com início na coluna " + j);
                            imprimiu = 1;
                        } else {
                            System.out.println("Ao longo da linha " + i + " com início na coluna " + j);
                        }
                        encontrouLinha = 1;
                    }
                }
                
            }
        }
        return encontrouLinha;
    }

}
