import java.util.ArrayList;

/**
 * @sid 2012
 * @aid 9.6
 */
public class Jogador {
    private String nome;
    private int idade;
    private ArrayList<Aposta> apostas;

    Jogador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.apostas = new ArrayList<>();
    }

    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    int getIdade() {
        return idade;
    }

    void setIdade(int idade) {
        this.idade = idade;
    }

    ArrayList<Aposta> getApostas() {
        return apostas;
    }

    void adicionarAposta(Aposta a) {
       this.apostas.add(a);
    }

    void imprimirApostas() {
        if (this.getApostas().size() > 0) {
            System.out.format("As apostas do jogador %s são as seguintes:%n", this.getNome());
            for (Aposta a : this.apostas) {
                a.print();
            }
            System.out.println();
        } else {
            System.out.format("O jogador %s não tem apostas%n", this.getNome());
        }
    }
}
