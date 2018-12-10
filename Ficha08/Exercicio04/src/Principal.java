/**
 * Instanciação e teste de operadores de frações
 *
 * @sid 2012
 * @aid 8.4
 */
public class Principal {

    public static void main(String[] args) {
        Fracao num1 = new Fracao(1, 2);
        Fracao num2 = new Fracao(1, 2);
        
        num1.adicao(num2).imprimeFracao();
        num1.subtracao(num2).imprimeFracao();
        num1.multiplicacao(num2).imprimeFracao();
        num1.divisao(num2).imprimeFracao();
    }

}
