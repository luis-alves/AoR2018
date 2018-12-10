import java.time.LocalDateTime;

/**
 * @sid 2012
 * @aid 10.2
 */
public class Registo {

    private Livro livro;
    private Leitor leitor;
    private LocalDateTime dataLevantamento;
    private boolean devolvido;

    Registo(Livro livro, Leitor leitor, LocalDateTime dataLevantamento) {
        this.livro = livro;
        this.leitor = leitor;
        this.dataLevantamento = dataLevantamento;
        this.devolvido = false;
    }

    void devolverLivro() {
        this.devolvido = true;
    }

    public Livro getLivro() {
        return livro;
    }

    Leitor getLeitor() {
        return leitor;
    }

    LocalDateTime getDataLevantamento() {
        return dataLevantamento;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

}
