/**
 * @sid 2012
 * @aid 9.8
 */
class Cliente {

    private String nome;
    private String telefone;
    private int numCliente;

    Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    String getNome() {
        return nome;
    }

    String getTelefone() {
        return telefone;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

}
