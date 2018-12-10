import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String linha;
        Ler ler = new Ler();
        Ler ler1 = new Ler();

        try {
            ler.abrirFicheiro("/Users/luisalves/Documents/acertar_o_rumo/Intro_Java/Pratica/Exercicios/Ficha11/Exercicio02/src/Aux/texto.txt");
            ler1.abrirFicheiro("/Users/luisalves/Documents/acertar_o_rumo/Intro_Java/Pratica/Exercicios/Ficha11/Exercicio02/src/Aux/texto_copia.txt");
//            ler1.abrirFicheiro("/Users/luisalves/Documents/acertar_o_rumo/Intro_Java/Pratica/Exercicios/Ficha11/Exercicio02/src/Aux/texto_diferente.txt");
            String linhaCopia = ler1.linha();
            while ((linha = ler.linha()) != null) {
                if (!linha.equals(linhaCopia)) {
                    System.out.println("Os ficheiros são diferentes.");
                    return;
                }
                linhaCopia = ler1.linha();
            }
            System.out.println("Os ficheiros são idênticos.");
        } catch (IOException e) {
            System.out.println("Ficheiro não encontrado");
        } finally {
            try {
                if (ler != null) {
                    ler.close();
                }
            } catch (IOException ex) {
                System.out.println("Não foi possivel fechar pontadores.");
            }
        }
    }
}
