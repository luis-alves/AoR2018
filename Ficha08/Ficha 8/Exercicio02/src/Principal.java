import java.util.Scanner;

/**
 * Programa utilizado para testar a criação de objectos tipo Angulo. E testar
 * uma variedade de métodos.
 *
 * @sid 2012
 * @aid 8.2
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o primeiro ângulo?");
        Angulo angulo1 = new Angulo(sc.nextDouble());

        System.out.println("Qual é o segundo ângulo?");
        Angulo angulo2 = new Angulo(sc.nextDouble());
        
        sc.close();
        
        angulo1.print();
        angulo2.print();
        
        Angulo soma = angulo1.adicao(angulo2);
        soma.print();
        
        soma.print(soma.cos());
        soma.print(soma.sin());
        soma.print(soma.tg());
    }

}
