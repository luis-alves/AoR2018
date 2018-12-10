import java.util.ArrayList;
import java.util.Arrays;

/**
 * @sid 2012
 * @aid 9.6
 */
public class Supermercado {

    private String nome;
    private String morada;
    private int nif;
    private int numAposta;
    private ArrayList<Jogador> jogadores;
    private ArrayList<Aposta> apostas;
    private ArrayList<Aposta> chave;

    public Supermercado(String nome, String morada, int nif) {
        this.nome = nome;
        this.morada = morada;
        this.nif = nif;
        this.numAposta = 0;
        this.jogadores = new ArrayList<>();
        this.apostas = new ArrayList<>();
        this.chave = new ArrayList<>();
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public ArrayList<Aposta> getChave() {
        return chave;
    }

    public void setChave(Aposta chave) {
        this.chave.add(chave);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public int getNumAposta() {
        this.setNumAposta();
        return this.numAposta;
    }

    public void setNumAposta() {
        this.numAposta += 1;
    }

    public Aposta venderAposta(Jogador j) {
        int qtJogador = contarPresencas(j);
        int limite = 0;
        if (j instanceof Cliente) {
            limite = 3;
        } else if (j instanceof Funcionario) {
            limite = 5;
        }

        if (qtJogador < limite) {
            Aposta aposta = new Aposta(this.getNumAposta(), j);
            this.apostas.add(aposta);
            System.out.format("Aposta vendida a %s. Os números são: ", j.getNome());
            aposta.print();
            System.out.println();
            j.adicionarAposta(aposta);
            this.jogadores.add(j);
            return aposta;
        } else {
            if (j instanceof Funcionario) {
                System.out.format("O apostador %s, já atingiu o limite de 5 apostas por jogador interno%n%n", j.getNome());
            } else {
                System.out.format("O apostador %s, já atingiu o limite de 3 apostas por jogador externo%n%n", j.getNome());
            }


        }
        return null;
    }

    private int contarPresencas(Jogador jogador) {
        int contador = 0;
        if (this.jogadores.contains(jogador)) {

            for (Jogador jog: this.jogadores) {
                if (jog.equals(jogador)) {
                    contador++;
                }
            }
        }
        return contador;
    }

    Aposta rolarATombula() {
        Aposta chaveSorteada = new ChaveSorteada();
        setChave(chaveSorteada);
        chaveSorteada.print();
        return chaveSorteada;
    }

    void encontrarVencedor() {
        int contar = 0;
        for (Aposta a: apostas) {
            if (a.getAposta().equals(((ChaveSorteada)this.chave.get(0)).getChave())) {
                System.out.format("ENCONTRAMOS A CHAVE. e ela pertence a %s", a.getJogador().getNome());
                contar++;
            }
        }

        if (contar == 0) {
            System.out.println("Não houve vencedores neste sorteio.");
        } else
            System.out.println("Houve " + contar + " vencedores.");

    }
}
