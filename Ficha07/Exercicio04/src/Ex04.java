/**
 * Programa que dada uma string (str) determine se é um palíndromo (se se lê 
 * da mesma forma do princípio para o fim e do fim para o princípio).
 *
 * @sid 2012
 * @aid 7.4
 */
public class Ex04 {

    public static void main(String[] args) {
        //begin_inputs
        String str = "anassana";
        //end_inputs

        if (seraPalindromo(str)) {
            System.out.println(str + " é um palíndromo");
        } else {
            System.out.println(str + " não é um palíndromo");
        }
    }

    private static boolean seraPalindromo(String str) {
        for (int i = 0, j = str.length()-1; i < str.length() && j > str.length()/2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }   
        }
        return true;
    }

}
