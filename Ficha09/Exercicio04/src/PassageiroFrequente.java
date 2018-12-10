import java.time.LocalDate;

/**
 * @sid 2012
 * @aid 9.4
 */
class PassageiroFrequente extends Passageiro {

    private int numPassageiro;
    private int numMilhas;

    PassageiroFrequente(String nome,
                                 long numBI,
                                 String nacionalidade,
                                 LocalDate dataNacimento,
                                 char genero,
                                 int numPassageiro) {
        super(nome, numBI, nacionalidade, dataNacimento, genero);
        this.numPassageiro = numPassageiro;
        this.numMilhas = 0;
    }

    PassageiroFrequente(String nome, long numBI, String nacionalidade, LocalDate dataNascimento, char genero) {
        super(nome, numBI, nacionalidade, dataNascimento, genero);
        this.numPassageiro = -1;
        this.numMilhas = 0;
    }

    int getNumPassageiroFrequente() {
        return numPassageiro;
    }

    void setNumPassageiroFrequente(int numPassageiro) {
        this.numPassageiro = numPassageiro;
    }

    int getNumMilhas() {
        return numMilhas;
    }

    void setNumMilhas(int numMilhas) {
        this.numMilhas = numMilhas;
    }
}
