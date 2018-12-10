/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 8.12
 */
public class Cliente {
    protected String nome;
    protected String morada;
    protected int idNumber;
    protected int numContaBancaria;
    
    public Cliente(String nome, String morada, int id) {
        this.nome = nome;
        this.morada = morada;
        this.idNumber = id;
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

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getNumContaBancaria() {
        return numContaBancaria;
    }

    public void setNumContaBancaria(int numContaBancaria) {
        this.numContaBancaria = numContaBancaria;
    }
    
    

}
