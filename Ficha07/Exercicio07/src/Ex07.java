import java.util.Scanner;

/**
 * Programa que, dada uma string (str) inserida pelo utilizador, 
 * lhe acrescente um “p” entre cada duas vogais consecutivas encontradas.
 *
 * @sid 2012
 * @aid 7.7
 */
public class Ex07 {

    public static void main(String[] args) {
        //begin_inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("str = ");
        String str = sc.next();
        sc.close();
        //end_inputs
        
        System.out.print(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (eVogal(str.charAt(i)) && eVogal(str.charAt(i-1))) {
                System.out.print('p');
                System.out.print(str.charAt(i));
            } else {
                System.out.print(str.charAt(i));
            }
        }
    }
    
    private static boolean eVogal(char letra) {
        return (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u');
    }

}
