import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Random;

/**
 * @sid 2012
 * @aid 9.6
 */
public class ChaveSorteada extends Aposta {

    private LocalDate data;
    private ArrayList<Integer> chave;
    private Set<Integer> chaveTemp;

    public ChaveSorteada() {
        super();
        this.data = LocalDate.now();

        chaveTemp = new HashSet<>();
        Random rd = new Random();
        while (chaveTemp.size() < 4) {
            chaveTemp.add(rd.nextInt(10)+1);
        }

        chave = new ArrayList<>(chaveTemp);
    }

    void print() {
        System.out.println("A chave sorteada é a seguinte:");
        System.out.println(this.chave);
    }

    public ArrayList<Integer> getChave() {
        return chave;
    }
}
