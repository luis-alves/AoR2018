import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 8.1
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = 0;
        do {
            System.out.println("Diz o dia:");
            dia = sc.nextInt();
        } while (dia < 1 && dia > 31);

        int mes = 0;
        do {
            System.out.println("Diz um mês:");
            mes = sc.nextInt();
            
        } while (mes < 0 && mes > 11);

        int ano = 0;
        do {
            System.out.println("Diz um ano:");
            ano = sc.nextInt();
        } while (ano < 1990 && ano > 2013);
        
        GregorianCalendar data = new GregorianCalendar(ano, mes-1, dia);
        System.out.println(data.isLenient());
        data.add(Calendar.DAY_OF_MONTH, 1);;
        
        System.out.print(data.get(Calendar.DAY_OF_MONTH) + "/ " + 
                         (data.get(Calendar.MONTH) + 1) + "/ " + 
                         data.get(Calendar.YEAR));
    }

}
