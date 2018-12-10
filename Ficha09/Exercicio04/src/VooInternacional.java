import java.time.LocalDateTime;

/**
 * @sid 2012
 * @aid 9.4
 */
class VooInternacional extends Voo {

    VooInternacional(int numVoo, String modeloAviao, String origem, String destino,  LocalDateTime horaPartida, LocalDateTime horaChegada, int milhas, int numLugaresMax) {
        super(numVoo, modeloAviao, origem, destino, horaPartida, horaChegada, milhas, numLugaresMax);
    }
}
