public class Contato {
    private String nome;
    private String email;
    private String morada;
    private String telefone;

    public Contato() {

    }

    public Contato(String nome, String email, String morada, String telefone) {
        this.nome = nome;
        this.email = email;
        this.morada = morada;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void insere(String nome, String email, String morada, String telefone) {
        setEmail(email);
        setNome(nome);
        setMorada(morada);
        setTelefone(telefone);
    }


}
