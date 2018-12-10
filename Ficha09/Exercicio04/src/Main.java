import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

/**
 * @sid 2012
 * @aid 9.4
 */
public class Main {
    public static void main(String[] args) {

        CompanhiaAeria tap = new CompanhiaAeria("Tap", "Portugal");

        /**
         * Criação de passageiros
         */
        Passageiro luisAlves = tap.criarPassageiroFrequente(
                "Luís Alves",
                12341222,
                "Portuguesa",
                LocalDate.of(1975, 10, 9),
                'M');

        Passageiro antonioJose = tap.criarPassageiroFrequente(
                "António José",
                1234232342,
                "Inglesa",
                LocalDate.of(1928, 11, 9),
                'M');
        /**
         * Criação de voos
         */
        Voo portoLisboa = tap.criarVooDomestico(
                231,
                "Airbus 320",
                "Porto",
                "Lisboa",
                LocalDateTime.of(2018, 10, 9,10,20),
                LocalDateTime.of(2018,10,9,11,30),
                300,
                120);

        Voo lisboaFunchal = tap.criarVooDomestico(
                3452,
                "Embraier 200",
                "Lisboa",
                "Funchal",
                LocalDateTime.of(2018, 11, 19,19,20),
                LocalDateTime.of(2018,11,19,22,30),
                1300,
                20);

        Voo lisboaParis = tap.criarVooInternacional(
                8492,
                "Airbus 340",
                "Lisboa",
                "Paris",
                LocalDateTime.of(2018, 10, 19,20,20),
                LocalDateTime.of(2018,10,19,23,30),
                3500,
                220);

        /**
         * Criação de reserva para passageiro frequente
         */
        tap.reservarPassagem(luisAlves, portoLisboa);
        tap.reservarPassagem(luisAlves,  lisboaParis);
        /**
         * Listar voos que o passageiro tem reservado
         */
        luisAlves.getListaReservas();

        /**
         * Imprimir lista voos
         */
        tap.imprimirListaVoos();

        /**
         * Imprimir lista de passageiros por voo
         */
        tap.imprimirListaPassageiros(portoLisboa);

        System.out.println("-----------");
        /**
         * Alterar reserva
         */
        tap.alterarReserva(lisboaFunchal, luisAlves, portoLisboa);
        luisAlves.getListaReservas();
        System.out.println("-------k------");
        /**
         * Cancelar reserva
         */
        tap.cancelarReserva(luisAlves, lisboaParis);
        luisAlves.getListaReservas();


        System.out.println(((PassageiroFrequente) antonioJose).getNumPassageiroFrequente());

    }
}
