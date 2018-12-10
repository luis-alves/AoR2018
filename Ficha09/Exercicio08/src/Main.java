import java.time.LocalDate;
/**
 * @sid 2012
 * @aid 9.8
 */
public class Main {

    public static void main(String[] args) {

        Hotel ludo = new Hotel("Ludo", "Avenida dir");
        Cliente luis = ludo.criarFichaClienteIndividual("Luis", "9123429", "Rua dali", "43242342");
        Empresa bach = ludo.criarRegistoEmpresa("Bach", "Rua da ikik", "934293498", "98493893");
        Cliente silvia = ludo.criarFichaClienteEmpresarial("Silvia", "848484848", bach);

        Reserva reservaLuis = ludo.criarReserva(luis, LocalDate.of(2018, 10, 22), 2, "Simples");

        Reserva reservaSilvia = ludo.criarReserva(silvia, LocalDate.of(2018, 11, 12), 2, "Duplo");

        ludo.listarReservas();

        ludo.alterarReserva(reservaLuis, LocalDate.of(2019, 2,1),1,"Simples");

        ludo.listarReservas();

    }

}
