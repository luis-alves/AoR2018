/**
 * Programa que lê uma palavra (palavra) e indica se ela é ou não alfabética. 
 *
 * @sid 2012
 * @aid 7.6
 */
public class Ex06 {

    public static void main(String[] args) {
        //begin_inputs
        String palavra = "amor";
        //end_inputs

        int contador = 0;
        for (int i = 1; i < palavra.length(); i++) {
            if ((int)palavra.charAt(i) > (int)palavra.charAt(i-1)) {
                contador++;
            }
        }
        if (contador == palavra.length()-1) {
            System.out.println(palavra + " é uma palavra é alfabética");
        } else {
            System.out.println(palavra + " não é uma palavra é alfabética");
        }
    }

}
