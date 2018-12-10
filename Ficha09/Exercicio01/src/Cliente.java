/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 9.1
 */
public class Cliente {
    private String nome;
    private String morada;
    private int idNumber;
    private int numContaBancaria;

    Cliente(String nome, String morada, int id) {
        this.nome = nome;
        this.morada = morada;
        this.idNumber = id;
    }

    String getNome() {
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
