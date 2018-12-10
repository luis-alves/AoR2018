/**
 * Programa que, dada uma cadeia de caracteres composta exclusivamente 
 * por caracteres de '0' a '9' (correspondentes aos algarismos) (numero), 
 * determine o valor inteiro que a cadeia representa admitindo que não 
 * há espaços ou outros caracteres entre os algarismos. 
 *
 * @sid 2012
 * @aid 7.2
 */
public class Ex02 {

    public static void main(String[] args) {
        //begin_inputs
        String numero = "12045";
        //end_inputs
        
        long resultado = 0;
        for (int i = 0, k = numero.length()-1; i < numero.length(); i++, k--) {
            resultado += ((int)numero.charAt(i) - 48) * Math.pow(10, k);
        }
        
        System.out.println(resultado);

    }

}
