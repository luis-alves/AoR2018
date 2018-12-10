public class Cliente {

    private final String nome;
    private final int nif;
    private final int nu;
    private final String morada;

    public Cliente(String nome, int nif, int nu, String morada) {
        this.nome = nome;
        this.nif = nif;
        this.nu = nu;
        this.morada = morada;
    }

    public String getNome() {
        return nome;
    }
}
