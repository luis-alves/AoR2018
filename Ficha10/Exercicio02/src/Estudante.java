/**
 * @sid 2012
 * @aid 10.2
 */
class Estudante extends Leitor {

    private int numMaxLivros;
    private int numMaxDias;

    Estudante(String nome, String morada, String email, int idade, long telefone, int numeroId, char tipoLeitor) {
        super(nome, morada, email, idade, telefone, numeroId, tipoLeitor);
        this.numMaxLivros = 3;
        this.numMaxDias = 8;
    }

    public int getNumMaxLivros() {
        return numMaxLivros;
    }

    public int getNumMaxDias() {
        return numMaxDias;
    }
}
