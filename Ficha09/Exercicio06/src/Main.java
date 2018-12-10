/**
 * @sid 2012
 * @aid 9.6
 */
public class Main {

    public static void main(String[] args) {

        Supermercado lidle = new Supermercado("Lidle", " rua do lado", 122345534);

        Jogador luis = new Cliente("Luís", 43, 3929392);
        Jogador maria = new Funcionario("Maria", 32, 23322332,2322);

        lidle.venderAposta(luis);
        lidle.venderAposta(luis);
        lidle.venderAposta(luis);
        lidle.venderAposta(luis);
        lidle.venderAposta(maria);
        lidle.venderAposta(maria);
        lidle.venderAposta(maria);
        lidle.venderAposta(maria);
        lidle.venderAposta(maria);
        lidle.venderAposta(maria);

        luis.imprimirApostas();

        Aposta chaveSorteada = lidle.rolarATombula();

        lidle.encontrarVencedor();

    }
}
