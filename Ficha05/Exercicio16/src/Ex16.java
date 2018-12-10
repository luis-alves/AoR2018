/**
 * Função que dado um número natural devolve o número de uns necessários para escrever todos os 
 * números entre 0 e n (inclusive). Qual é o menor valor de n, n>1, tal que f(n)=n
 *
 * @sid 2012
 * @aid 5.16
 */
public class Ex16 {

  public static void main(String[] args) {
    //begin_inputs
    //end_inputs
    int n = 2;
    
    int resultado = 1;
    
    while (true) {
      resultado = qtUns(n);
      if (resultado == n) {
        System.out.println("O número mínimo de n é: " + resultado);
        break;
      }
      n++;
    }
  }
  
  private static int qtUns(int n) {
    int contador = 0;
    for (int i = 0; i <= n; i++) {
      int copia = i;
      while (copia > 0) {
        if (copia % 10 == 1) {
          contador++;
        }
        copia /= 10;
      }
    }
    return contador;
  }

}
