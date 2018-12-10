import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Empresa mota = new Empresa("Mota-Engil, S.A.");

        Empregado luis = mota.registarTrabalhor("Luis", 12, 1200, "Hora");
        Empregado ze = mota.registarTrabalhor("José", 0.05, 1000, "Comissão");

        mota.criarTrabalhoDiario(LocalDate.of(2018, 10, 10), 10.4, 0, luis);
        mota.criarTrabalhoDiario(LocalDate.of(2018, 10, 11), 9.4, 0, luis);
        mota.criarTrabalhoDiario(LocalDate.of(2018, 10, 11), 0 , 1900, ze);

        mota.imprimirHorasTrabalhador(luis);

        // Implementar e visualizar a contabilidade mensal (ordenados a pagar) da empresa.
        mota.ordenadosAPagar();



    }
}
