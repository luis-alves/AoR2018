import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @sid 2012
 * @aid 10.2
 */
public class Biblioteca {

    private String nome;
    private String morada;
    private ArrayList<Livro> livros;
    private ArrayList<Registo> registos;
    private ArrayList<Registo> historico;
    private ArrayList<Leitor> leitores;
    private int incrementador;
    private int incrementadorIdLivro;

    public Biblioteca(String nome, String morada) {
        this.nome = nome;
        this.morada = morada;
        this.livros = new ArrayList<>();
        this.registos = new ArrayList<>();
        this.leitores = new ArrayList<>();
        this.historico = new ArrayList<>();
        this.incrementador = 0;
        this.incrementadorIdLivro = 0;
    }

    Leitor criarFichaLeitor(String nome, String morada, String email,
                       int idade, long telefone, char tipo) {
        if (tipo == 'E') {
            Leitor leitor = new Estudante(nome, morada, email, idade, telefone, this.getIncrementador(), tipo);
            this.setIncrementador();
            leitor.setNumeroId(this.getIncrementador());
            this.leitores.add(leitor);
            return leitor;
        } else if (tipo == 'P') {
            Leitor leitor = new Professor(nome, morada, email, idade, telefone, this.getIncrementadorIdLivro(), tipo);
            this.setIncrementador();
            leitor.setNumeroId(this.getIncrementador());
            this.leitores.add(leitor);
            return leitor;
        }
        return null;
    }

    ArrayList<Registo> livrosForaPrazoEntrega() {
        ArrayList<Registo> resultado = new ArrayList<>();
        LocalDateTime agora = LocalDateTime.now();
        for (Registo registo : this.registos) {
            if (registo.getLeitor() instanceof Estudante) {
                int intervaloDias = ((Estudante) registo.getLeitor()).getNumMaxDias();
                LocalDateTime dataInicial = registo.getDataLevantamento();
                if (dataInicial.plusDays(intervaloDias).compareTo(agora) < 0) {
                    resultado.add(registo);
                }
            } else if (registo.getLeitor() instanceof Professor) {
                int intervaloDias = ((Professor) registo.getLeitor()).getNumMaxDias();
                LocalDateTime dataInicial = registo.getDataLevantamento();
                if (dataInicial.plusDays(intervaloDias).compareTo(agora) < 0) {
                    resultado.add(registo);
                }
            }
        }
        return resultado;
    }

    Livro adiquirirLivro(String titulo, String[] autores, String area) {
        Livro livro = new Livro(titulo, autores, area);
        this.setIncrementadorIdLivro();
        livro.setCota(this.incrementadorIdLivro);
        this.livros.add(livro);
        return livro;
    }

    ArrayList<Livro> pesquisarLivro(String autor, String area) {
        ArrayList<Livro> livrosComMesmaArea = new ArrayList<>();
        ArrayList<Livro> resultado = new ArrayList<>();
        for (Livro livro : this.livros) {
            if (livro.getArea().equals(area)) {
                livrosComMesmaArea.add(livro);
            }
        }

        for (int i = 0; i < livrosComMesmaArea.size(); i++) {
            String[] x = livrosComMesmaArea.get(i).getAutores();
            for (String a : x) {
                if (a.equals(autor)) {
                    resultado.add(livrosComMesmaArea.get(i));
                }
            }
        }
        return resultado;
    }

    Registo requisitarLivroCota(String cota, Leitor leitor) {
        for (Livro livro: this.livros) {
            System.out.println("livri; " + livro.getCota());
            if (livro.getCota().equals(cota)) {
                Registo registo = new Registo(livro, leitor, LocalDateTime.of(2018, 11, 25, 20, 00));
                this.registos.add(registo);
                return registo;
            }
        }
        return null;
    }

    private void setIncrementador() {
        this.incrementador += incrementador;
    }

    void setIncrementadorIdLivro() {
        this.incrementadorIdLivro += 1;
    }

    int getIncrementador() {
        return incrementador;
    }

    int getIncrementadorIdLivro() {
        return incrementadorIdLivro;
    }

    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    String getMorada() {
        return morada;
    }

    void setMorada(String morada) {
        this.morada = morada;
    }


}
