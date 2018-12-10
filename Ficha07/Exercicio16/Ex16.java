/**
 * Programa em Java que recebe um conjunto de strings em HTML determina se 
 * são válidas ou se contêm erros.
 *
 * @sid 2012
 * @aid 7.16
 */
public class Ex16 {

    public static void main(String[] args) {
        //begin_inputs
        String codigo = "<BEGIN> Estou dentro da tag BEGIN </BEGIN>\n" + 
                        "        <START>   Aqui vem mais um pedaço\n" + 
                        "       de texto. </START>\n" + 
                        "    Esta tag está vazia <>\n" + 
                        "Aqui tudo bem <OKAY> e\n" + 
                        "<GOOD> aqui também.\n" + 
                        "</GOOD> </OKAY>\n" + 
                        "Aqui há um erro <START> </STOP>\n" + 
                        "Aqui falta qualquer coisa: <OK></OK></NOTOK><Z>";
        //end_inputs

        int n = quantidadeTags(codigo);
        
        String[] tags = new String[n];
        int[] localizacaoTags = new int[n];
        
        preencherMatrizComTags(codigo, tags, localizacaoTags);
        
        for (int i = 0; i < tags.length; i++) {
            int contador = 0;
            if (tags[i].equals("")) {
                System.out.println("Tag vazia <> na linha nº " + 
                                    localizacaoTags[i]);
            } else {
                if (tags[i].equals("x")) {
                    continue;
                } else {
                    for (int j = i+1; j < tags.length-1; j++) {
                        String tag = "/" + tags[i];
                        if (tag.equals(tags[j])) {
                            contador++;
                            tags[j] = "x";
                        }
                    }
                }
                if (contador == 0) {
                    if (tags[i].charAt(0) != '/') {
                        System.out.println("Tag <" + tags[i] + 
                                        "> sem fecho, na linha nº " + 
                                        localizacaoTags[i]);
                    } else {
                        System.out.println("Tag <" + tags[i] + 
                                        "> sem tag de início, na linha nº " + 
                                        localizacaoTags[i]);
                    }

                }
            }
        }
    }


    private static void preencherMatrizComTags(String codigo, String[] tags, int[] localizacaoTags) {
        int index = 0;
        int linha = 1;
        for (int i = 0; i < codigo.length(); i++) {
            String aString = "";
            if (codigo.charAt(i) == '\n') {
                linha++;
            }
            if (codigo.charAt(i) == '<') {
                for (int j = i+1; j < codigo.length(); j++) {
                    if (codigo.charAt(j) == '>') {
                        break;
                    } else {
                        aString += codigo.charAt(j); 
                    }
                }
                tags[index] = aString;
                localizacaoTags[index] = linha;
                index++;
            }
        }
    }

    private static int quantidadeTags(String codigo) {
        int contador = 0;
        for (int i = 0; i < codigo.length(); i++) {
            if (codigo.charAt(i) == '<') {
                contador++;
            }
        }
        return contador;
    }

}
