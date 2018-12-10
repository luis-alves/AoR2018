class EmpAHora extends Empregado {

    private double valorHora;

    EmpAHora(String nome, double valorHora, double ordenadoBase) {
        super(nome, ordenadoBase);
        this.valorHora = valorHora;
    }

    @Override
    double calcularSalario(double horas) {
        return horas * this.getValorHora();
    }

     double getValorHora() {
        return valorHora;
    }

}
