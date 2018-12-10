/**
 * Programa que lê uma string (frase) e determina quantas das suas letras 
 * são maiúsculas e quantas são minúsculas.
 *
 * @sid 2012
 * @aid 7.1
 */
public class Ex01 {

    public static void main(String[] args) {
        //begin_inputs
        String frase = "Bom Dia";
        //end_inputs
        
        int maiusculas = 0;
        int minusculas = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) > 64 && frase.charAt(i) < 91) {
                maiusculas++;
            } 
            if (frase.charAt(i) > 96 && frase.charAt(i) < 123) {
                minusculas++;
            } 
        }
        
        System.out.println("Minúsculas: " + minusculas);
        System.out.println("Maiúsculas " + maiusculas);

    }

}
