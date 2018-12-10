import java.time.LocalDate;

class RegistoDiarioTrabalho {

    private Empregado empregado;
    private LocalDate data;
    private double horasTrabalho;
    private double volumeVendas;
    private String descricaoTrabalho;

    RegistoDiarioTrabalho(Empregado empregado, double horasTrabalho, LocalDate data, double volumeVendas, String descricaoTrabalho) {
        this.empregado = empregado;
        this.data = data;
        this.horasTrabalho = horasTrabalho;
        this.volumeVendas = volumeVendas;
        this.descricaoTrabalho = descricaoTrabalho;
    }

    double getHorasTrabalho() {
        return horasTrabalho;
    }

    double getVolumeVendas() {
        return volumeVendas;
    }

    String getDescricaoTrabalho() {
        return descricaoTrabalho;
    }

}
