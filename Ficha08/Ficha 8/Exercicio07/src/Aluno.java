/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 8.7
 */
public class Aluno {
    String primeiroNome;
    String segundoNome;
    int idade;
    char sexo;
    int altura; // em cm
    double peso; // em kg,g

    public Aluno() {
        // TODO Auto-generated constructor stub
    }

    public Aluno(String primeiroNome, String segundoNome) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
    }

    public Aluno(String primeiroNome, String segundoNome, int idade) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.idade = idade;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
}
