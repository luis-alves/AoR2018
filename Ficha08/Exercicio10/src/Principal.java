import java.util.Scanner;

/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 8.10
 */
public class Principal {

    public static void main(String[] args) {
        MaquinaVendaBilhetes xpto = new MaquinaVendaBilhetes(123);
        
        xpto.abastecerMaquinaBilhetes(20);
        xpto.abastecerMaquinaTitulos(10);
        xpto.getValorEmCaixa();
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Que deseja compar? Bilhete (b) ou Talão (t)?");
        char opcao = sc.next().charAt(0);
        if (opcao == 'b') {
            System.out.println("Quantos bilhetes deseja comprar?");
            int bilhetes = sc.nextInt();
            System.out.println("Qual é o valor que me entregará?");
            double dinheiro = sc.nextDouble();
            char desistir; 
            do {
                System.out.println("Se quiser anular clique na tecla (q), para"
                                + " continuar clique em (c).");
                desistir = sc.next().charAt(0);
            } while (desistir != 'q' && desistir != 'c');
            if (desistir == 'c') {
                Bilhete bilhete; 
                bilhete = xpto.vendaBilhete(bilhetes, dinheiro);
                xpto.getValorEmCaixa();
            } else {
                System.out.println("Desistiu da compra. Volte sempre");
            }
        } else {
            System.out.println("Quantos talões deseja comprar?");
            int bilhetes = sc.nextInt();
            System.out.println("Qual é o valor que me entregará?");
            double dinheiro = sc.nextDouble();
            char desistir; 
            do {
                System.out.println("Se quiser anular clique na tecla (q), para"
                                + " continuar clique em (c).");
                desistir = sc.next().charAt(0);
            } while (desistir != 'q' && desistir != 'c');
            if (desistir == 'c') {
                Bilhete[] talao; 
                talao = xpto.vendaTitulo(bilhetes, dinheiro);
                xpto.getValorEmCaixa();
            } else if (desistir == 'q'){
                System.out.println("Desistiu da compra. Volte sempre");
            }
            
        }
        sc.close();
    }

}
