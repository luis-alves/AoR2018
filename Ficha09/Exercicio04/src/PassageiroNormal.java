import java.time.LocalDate;

/**
 * @sid 2012
 * @aid 9.4
 */
class PassageiroNormal extends Passageiro {

    PassageiroNormal(String nome, long numP, String nacionalidade, LocalDate dataNacimento, char genero) {
        super(nome, numP, nacionalidade, dataNacimento, genero);
    }

}
