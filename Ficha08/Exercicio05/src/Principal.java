import java.util.Scanner;

/**
 * Simulador de um empréstimo.
 *
 * @sid 2012
 * @aid 8.5
 */
public class Principal {

    public static void main(String[] args) {
        Emprestimo emprestimo = new Emprestimo();
        Scanner sc = new Scanner(System.in);

        int valor = 0;
        do {
            System.out.println("Qual é o valor da prestação?");
            valor = sc.nextInt();
            emprestimo.pagamento(valor);
            
        } while (valor > emprestimo.getLimitePrestacao());
        
        emprestimo.obterRelatorio();
    }

}
