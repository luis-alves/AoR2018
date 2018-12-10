/**
 * @sid 2012
 * @aid 9.7
 */
class AlunoBSc extends Aluno {
    private double creditoObtidos;

    AlunoBSc(String nome, int numAcompanhantes, int anoEntrada, double creditoObtidos) {
        super(nome, numAcompanhantes, anoEntrada);
        this.creditoObtidos = creditoObtidos;
    }

    double getCreditoObtidos() {
        return creditoObtidos;
    }

    void setCreditoObtidos(double creditoObtidos) {
        this.creditoObtidos = creditoObtidos;
    }
}

