/**
 * @sid 2012
 * @aid 9.8
 */
class Empresa {

    private String nome;
    private String morada;
    private String telefone;
    private String nif;
    private double taxaDesconto;

    Empresa(String nome, String morada, String telefone, String nif) {
        this.nome = nome;
        this.morada = morada;
        this.telefone = telefone;
        this.nif = nif;
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

    String getTelefone() {
        return telefone;
    }

    void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    String getNif() {
        return nif;
    }

    void setNif(String nif) {
        this.nif = nif;
    }

    double getTaxaDesconto() {
        return taxaDesconto;
    }

    void setTaxaDesconto(double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }

}


