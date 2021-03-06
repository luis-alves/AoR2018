import java.util.Arrays;

/**
 * 
 *
 * @sid 2012
 * @aid 8.4
 */
public class Fracao {
    
    private int numerador;

    private int denominador;
    
    public Fracao() {
        // TODO Auto-generated constructor stub
    }
    
    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public void imprimeFracao() {
        if (this.denominador == 1) {
            System.out.println("Resultado = " + this.numerador);
        } else if (this.numerador == this.denominador) {
            System.out.println("Resultado = " + 1);
        }else {
            System.out.println("Resultado = " + this.numerador + " / " + this.denominador);
        }
    }

    public Fracao divisao(Fracao num) {
        Fracao num1 = new Fracao();
        
        num1.numerador = this.numerador * num.denominador;
        num1.denominador = this.denominador * num.numerador;
        
        int redutorNum = redutor(num1.numerador, num1, denominador);
        
        num1.numerador /= redutorNum;
        num1.denominador /= redutorNum;
        
        return num1;
    }

    public Fracao multiplicacao(Fracao num) {
        Fracao num1 = new Fracao();
        
        num1.numerador = this.numerador * num.numerador;
        num1.denominador = this.denominador * num.denominador;

        int redutorNum = redutor(num1.numerador, num1, denominador);
        num1.numerador /= redutorNum;
        num1.denominador /= redutorNum;
        
        return num1;
    }

    public Fracao subtracao(Fracao num) {
        Fracao num1 = new Fracao();

        int mdc1 = minimoDenominadorComum(this.denominador, num.denominador);
        int mdc2 = minimoDenominadorComum(num.denominador, this.denominador);
        num1.denominador = this.denominador * mdc2;

        num1.numerador = this.numerador * mdc2 - num.numerador * mdc1;
        int redutorNum = redutor(num1.numerador, num1, denominador);
        
        num1.numerador /= redutorNum;
        num1.denominador /= redutorNum;
        
        return num1;
    }
    
    public Fracao adicao(Fracao num) {
        Fracao num1 = new Fracao();
        
        int mdc1 = minimoDenominadorComum(this.denominador, num.denominador);
        int mdc2 = minimoDenominadorComum(num.denominador, this.denominador);
        num1.denominador = this.denominador * mdc2;

        num1.numerador = this.numerador * mdc2 + num.numerador * mdc1;
        int redutorNum = redutor(num1.numerador, num1, denominador);
        
        num1.numerador /= redutorNum;
        num1.denominador /= redutorNum;
        
        return num1;
    }
    
    private int minimoDenominadorComum(int num1, int num2) {
        int[] arr1 = new int[100];
        int[] arr2 = new int[100];
        for (int i = 0; i < 100; i++) {
            arr1[i] = num1 * (i); 
            arr2[i]= num2 * (i); 
        }
        int mdc = 0;
        if (arr1[1] == arr2[1]) {
            mdc = 1;
            return mdc;
        }
        
        boolean continuar = true;
        int index = 2;
        while (continuar == true) {
            for (int i = 2; i < arr2.length-3; i++) {
                if (arr1[index] == arr2[i]) {
                    mdc = i;
                    continuar = false;
                    break;
                }
            }
            index++;
        }

        return mdc;
    }

    private int redutor(int numerador2, Fracao num1, int denominador2) {
        for (int i = 2; i <= Math.max(numerador2, denominador2); i++) {
            if (numerador2 % i == 0 && denominador2 % i == 0) {
                return i;
            }
        }
        return 1;
    }

}
