import java.time.LocalDate;

class DadosDiarios {

    private LocalDate data;
    private double horasTrabalho;
    private double valorFaturado;
    private Empregado empregado;

    DadosDiarios(LocalDate data, double horasTrabalho, double valorFaturado, Empregado empregado) {
        this.data = data;
        this.horasTrabalho = horasTrabalho;
        this.valorFaturado = valorFaturado;
        this.empregado = empregado;
    }

    LocalDate getData() {
        return data;
    }

    double getHorasTrabalho() {
        return horasTrabalho;
    }

    double getValorFaturado() {
        return valorFaturado;
    }

    Empregado getEmpregado() {
        return empregado;
    }

}
