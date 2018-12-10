import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        FileReader fileReader = null;
        BufferedReader fR = null;
        int numLinhas = 0;
        int totalVogais = 0;

        try {
            File file = new File("/Users/luisalves/Documents/acertar_o_rumo/Intro_Java/Pratica/Exercicios/Ficha11/Exercicio01/src/Aux/texto.txt");
            fileReader = new FileReader(file);
            fR = new BufferedReader(fileReader);
            int num;
            while ((num = fR.read()) != -1) {
                if ((char) num == '\n') {
                    numLinhas++;
                }
                totalVogais += evogal(num);
//                System.out.print((char) num);
            }
        } catch (IOException e) {
            System.out.println("Ficheiro não encontrado " + e.getMessage());
        } finally {
            try {
                if (fR != null) {
                    fR.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException ex) {
                System.out.println("Não consegiu fechar!" + ex.getStackTrace());
            }
        }

        System.out.println("Número de linhas = " + numLinhas);
        System.out.println("Número de vogais = " + totalVogais);




    }

    private static int evogal(int num) {
        char c = (char) num;
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return 1;
        }
        return 0;
    }
}
