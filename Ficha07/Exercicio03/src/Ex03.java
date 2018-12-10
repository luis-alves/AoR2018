/**
 * Modifica o programa anterior admitindo que podem ser introduzidos espaços 
 * excedentários e outros caracteres não válidos que o seu programa deve 
 * ignorar.
 *
 * @sid 2012
 * @aid 7.3
 */
public class Ex03 {

    public static void main(String[] args) {
        //begin_inputs
        String numero = "' 3 12-0  45";
        //end_inputs
        
        long resultado = 0;
        int k = numero.length()-1;
        int divisor = 0;
        for (int i = 0; i < numero.length(); i++) {
            int letra = (int)numero.charAt(i);
            if (letra > 47 && letra < 57) {
                resultado += ((int)numero.charAt(i) - 48) * Math.pow(10, k);
                k--;
            } else {
                divisor++;
            }
        }
        
        System.out.println((int)(resultado / Math.pow(10, divisor)));

    }

}
