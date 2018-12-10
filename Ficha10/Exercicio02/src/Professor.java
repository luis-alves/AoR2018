/**
 * @sid 2012
 * @aid 10.2
 */
class Professor extends Leitor{

    private int numMaxLivros;
    private int numMaxDias;

    Professor(String nome, String morada, String email, int idade, long telefone, int numeroId, char tipoLeitor) {
        super(nome, morada, email, idade, telefone, numeroId, tipoLeitor);
        this.numMaxLivros = 10;
        this.numMaxDias = 60;
    }

    public int getNumMaxLivros() {
        return numMaxLivros;
    }

    public int getNumMaxDias() {
        return numMaxDias;
    }

}
