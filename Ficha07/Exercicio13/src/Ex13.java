/**
 * Programa em Java que permite visualizar a aplicação do algoritmo para 
 * um ISBN inserido pelo utilizador (isbn). Deverá ser apresentadas as somas 
 * parciais e totais. Indicadrá se o ISBN é válido.
 *
 * @sid 2012
 * @aid 7.13
 */
public class Ex13 {

    public static void main(String[] args) {
        //begin_inputs
        String isbn = "0 8 9 2 3 7 0 1 0 6";
        //end_inputs
        
        isbn = isbn.replaceAll(" ", "");
        
        int[] s1 = new int[isbn.length()];
        int[] s2 = new int[isbn.length()];
        
        s1[0] = (int)isbn.charAt(0)-48;
        
        System.out.print("ISBN original " + ((int)isbn.charAt(0)-48));
        int num = (int)isbn.charAt(0)-48;
        for (int i = 1; i < isbn.length(); i++) {
            System.out.print(" " + isbn.charAt(i));
            num += (int)isbn.charAt(i)-48;
            s1[i] = num;
        }

        System.out.println();
        s2[0] = s1[0];
        System.out.print("Somas parciais (s1) " + s1[0]);
        num = s1[0];
        for (int i = 0; i < s1.length-1; i++) {
            System.out.print(" " + s1[i+1]);
            num += s1[i+1];
            s2[i+1] = num;
        }
        System.out.println();
        System.out.print("Somas totais (s2)");
        for (int i = 0; i < s2.length; i++) {
            System.out.print(" " + s2[i]);
        }
        
        System.out.println();
        System.out.println();
        
        if (s2[s2.length-1] % 11 == 0) {
            System.out.print("O ISBN dado é correto pois " + s2[s2.length-1] +
                            " é divisivel por 11.");
        } else {
            System.out.print("O ISBN dado é incorreto pois " + s2[s2.length-1] + 
                            " não é divisivel por 11");
        }

    }

}
