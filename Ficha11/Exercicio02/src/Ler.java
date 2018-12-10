import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ler {

    BufferedReader fR;
    FileReader fileReader;

    void abrirFicheiro(String caminhoFicheiro) throws IOException {
        fileReader = new FileReader(caminhoFicheiro);
        fR = new BufferedReader(fileReader);
    }

    String linha() throws IOException {
        return fR.readLine();
    }

    void close() throws IOException {
        if (fR != null) {
            fR.close();
        }
        if (fileReader != null) {
            fileReader.close();
        }
    }
}
