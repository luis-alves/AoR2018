/**
 * @sid 2012
 * @aid 10.2
 */
class Leitor {

    private String nome;
    private String morada;
    private String email;
    private int idade;
    private long telefone;
    private int numeroId;
    private char tipoLeitor;

    Leitor(String nome, String morada, String email,
                  int idade, long telefone, int numeroId, char tipoLeitor) {
        this.nome = nome;
        this.morada = morada;
        this.email = email;
        this.idade = idade;
        this.telefone = telefone;
        this.numeroId = numeroId;
        this.tipoLeitor = tipoLeitor;
    }

    String getNome() {
        return nome;
    }

    String getMorada() {
        return morada;
    }

    String getEmail() {
        return email;
    }

    int getIdade() {
        return idade;
    }

    long getTelefone() {
        return telefone;
    }

    int getNumeroId() {
        return numeroId;
    }

    char getTipoLeitor() {
        return tipoLeitor;
    }

    void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }
}
