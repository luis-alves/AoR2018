import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        FileReader fileReader = null;
        BufferedReader bR = null;
        String linha;
        int negativa = 0;
        int positva = 0;
        int precipitacao = 0;


        try {
            fileReader = new FileReader("/Users/luisalves/Documents/acertar_o_rumo/Intro_Java/Pratica/Exercicios/Ficha11/Exercicio03/src/texto.txt");
            bR = new BufferedReader(fileReader);

            while ((linha = bR.readLine()) != null) {
                String[] l = linha.split(" ");
                if (Integer.parseInt(l[0]) < 0) {
                    negativa++;
                }
                if (Integer.parseInt(l[1]) > 12.5) {
                    positva++;
                }
                if (Integer.parseInt(l[2]) >= 10 && Integer.parseInt(l[2]) <= 35) {
                    precipitacao++;
                }
            }
            System.out.println("Numero de dias com temperatura negativa: " + negativa);
            System.out.println("Numero de dias com temperatura superior a 12.5º: " + positva);
            System.out.println("Numero de dias com precipitação entre 10 e 35mm: " + precipitacao);
        } catch (IOException e) {
            System.out.println("Não conseguiu abrir ficheiro " + e.getMessage());
        } finally {
            try {
                if (bR != null) {
                    bR.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException ex) {
                System.out.println("Não consegiu fechar o leitor: " + ex.getMessage());
            }
        }

    }
}
