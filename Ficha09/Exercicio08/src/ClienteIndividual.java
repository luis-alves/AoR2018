/**
 * @sid 2012
 * @aid 9.8
 */
class ClienteIndividual extends Cliente {

    private String morada;
    private String numBi;

    ClienteIndividual(String nome, String telefone, String morada, String numBi) {
        super(nome, telefone);
        this.morada = morada;
        this.numBi = numBi;
    }

    String getMorada() {
        return morada;
    }

    void setMorada(String morada) {
        this.morada = morada;
    }

    String getNumBi() {
        return numBi;
    }

    void setNumBi(String numBi) {
        this.numBi = numBi;
    }

}
