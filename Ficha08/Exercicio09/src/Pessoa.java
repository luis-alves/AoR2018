import java.time.LocalDate;
/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 8.9
 */
public class Pessoa {
    private String nome;
    private String sexo;
    private LocalDate nascimento;
    private String morada;
    
    public Pessoa(String nome, String sexo, LocalDate nascimento, String morada) {
        super();
        this.nome = nome;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.morada = morada;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }
    
}

