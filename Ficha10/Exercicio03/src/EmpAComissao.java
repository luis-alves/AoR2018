class EmpAComissao extends Empregado {
    private double comissao;
    private double totalVendas = 0;

    EmpAComissao(String nome, double comissao, double ordenadoBase) {
        super(nome, ordenadoBase);
        this.comissao = comissao;
    }

    @Override
    double calcularSalario(double valorVendas) {
        return 0;
    }

    double getComissao() {
        return comissao;
    }

    double getTotalVendas() {
        return totalVendas;
    }
}

