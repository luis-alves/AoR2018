/**
 * Programa que pede uma cadeia de caracteres (str) e apresente no 
 * ecrã todas as suas subcadeias de caracteres de comprimento 3.
 *
 * @sid 2012
 * @aid 7.12
 */
public class Ex12 {

    public static void main(String[] args) {
        //begin_inputs
        String str = "Programação";
        //end_inputs
        
        for (int i = 0; i < (str.length()-2); i++) {
            System.out.println("" + str.charAt(i) + str.charAt(i+1) + 
                            str.charAt(i+2));
        }

    }

}
