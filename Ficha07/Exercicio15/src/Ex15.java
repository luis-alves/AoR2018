/**
 * Implementa o algoritmo de compressão Run Length Encoding (RLE).
 *
 * @sid 2012
 * @aid 7.15
 */
public class Ex15 {

    public static void main(String[] args) {
        //begin_inputs
        String algarismos = "12355555555555542222223333";
        //end_inputs
        
        int contador = 0;
        
        for (int i = 0; i <= algarismos.length()-1; i++) {
            if (i == algarismos.length()-1) {
                if (algarismos.charAt(i) == algarismos.charAt(i-1)) {
                    if (contador >= 4) {
                        System.out.println(
                                        "b" + 
                                        algarismos.charAt(i) + 
                                        (contador+1) + 
                                        "e"
                        );
                    } else {
                        for (int j = 0; j <= contador; j++) {
                            System.out.print(algarismos.charAt(i));
                        }
                    } 
                } else {
                    System.out.print(algarismos.charAt(i));
                }
            } else if (algarismos.charAt(i) == algarismos.charAt(i+1)) {
                contador++;
            } else {
                if (contador >= 5) {
                    System.out.print(
                                    "b" + 
                                    algarismos.charAt(i) + 
                                    (contador+1) + 
                                    "e"
                    );
                    contador = 0;
                } else {
                    System.out.print(algarismos.charAt(i));
                    contador = 0;
                }
            }
        }
    }

}
