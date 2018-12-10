import java.util.StringTokenizer;

/**
 * Programa que lê uma data (data) no formato DD/MM/AAAA e a converte no 
 * formato DD de MMMM de AAAA.
 *
 * @sid 2012
 * @aid 7.8
 */
public class Ex08 {

    public static void main(String[] args) {
        //begin_inputs
        String data = "11/12/2016";
        //end_inputs
        
        StringTokenizer palavras = new StringTokenizer(data, "/");
        
        while (palavras.hasMoreTokens()) {
            System.out.print(palavras.nextToken());
            System.out.print(" de ");
            System.out.print(acharMes(palavras.nextToken()));
            System.out.print(" de ");
            System.out.print(palavras.nextToken());
        }
    }
    
    private static String acharMes(String num) {
        switch (num) {
        case "01":
            return "Janeiro";
        case "02":
            return "Fevereiro";
        case "03":
            return "Março";
        case "04":
            return "Abril";
        case "05":
            return "Maio";
        case "06":
            return "Junho";
        case "07":
            return "Julho";
        case "08":
            return "Agosto";
        case "09":
            return "Setembro";
        case "10":
            return "Outubro";
        case "11":
            return "Novembro";
        case "12":
            return "Dezembro";

        default:
            return "";
        }
    }

}
