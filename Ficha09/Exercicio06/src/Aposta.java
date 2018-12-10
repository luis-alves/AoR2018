import java.lang.reflect.Array;
import java.util.*;

/**
 * @sid 2012
 * @aid 9.6
 */
public class Aposta {

    private int num;
    private double preco;
    private Jogador jogador;
    private ArrayList<Integer> aposta;

    public Aposta() {
    }

    public Aposta(int num, Jogador j) {
        this.num = num;
        this.preco = 2;


        HashSet<Integer> apostaTemp = new HashSet<>();
        this.jogador = j;

        Random rd = new Random();
        while (apostaTemp.size() < 4) {
            apostaTemp.add(rd.nextInt(10)+1);
        }

        this.aposta = new ArrayList<>(apostaTemp);


    }

    ArrayList<Integer> getAposta() {
        return aposta;
    }

    void print() {
        System.out.println(this.aposta);
    }

    public Jogador getJogador() {
        return jogador;
    }
}
