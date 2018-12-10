import java.text.DecimalFormat;

/**
 * Dado um conjunto de dados correspondentes às notas dos alunos de uma turma 
 * (notas), desenvolva um programa que determine:
 * - Média;
 * - Desvio padrão;
 * - Moda;
 * - Mediana;
 * - Quartil 25 e
 * - Quartil 75.
 *
 * @sid 2012
 * @aid 6.5
 */
public class Ex05 {

    public static void main(String[] args) {
        //begin_inputs
        int[] notas = {12, 11, 15, 17, 12, 16, 10};
        //end_inputs

        double media = 0.0;
        double desvioPadrao = 0.0;
        int[][] moda = new int[notas.length][notas.length];
        double mediana = 0.0;
        double quartil25 = 0.0;
        double quartil75 = 0.0;

        ordenarVector(notas);

        media = calcMedia(notas);
        desvioPadrao = calcDesvioPadrao(notas, media);
        moda = calcModa(notas);
        mediana = calcMediana(notas);
        quartil25 = calcQuartil(notas, 25);
        quartil75 = calcQuartil(notas, 75);

        DecimalFormat value = new DecimalFormat("0.00");

        System.out.println("Média: " + value.format(media));
        System.out.println("Desvio Padrão: " + value.format(desvioPadrao));
        System.out.print("Moda:");
        int sairDoLoop = 0;
        for (int i = moda.length-1; i > 0; i--) {
            for (int j = 0; j < moda.length; j++) {
                if (moda[i][j] != -1) {
                    System.out.print(" " + moda[i][j]);
                    sairDoLoop = 1;
                }
            } 
            if (sairDoLoop == 1) {
                System.out.println();
                break;
            }
        }
        System.out.println("Mediana: " + mediana);
        System.out.println("Q25: " + quartil25);
        System.out.println("Q50: " + mediana);
        System.out.println("Q75: " + quartil75);
    }
    
    private static double calcQuartil(int[] notas, int q) {
        if (q == 25) {
            double indice = 0.25 * (notas.length + 1);
            if (indice % 1 != 0) {
                return (double) (notas[(int) Math.round(indice)]);
            } else {
                return (double) (notas[(int) indice-1] + notas[(int) indice]) / 2;
            }
        } else {
            double indice = 0.75 * (notas.length + 1);
            if (indice % 1 != 0) {
                return (double) (notas[(int) Math.floor(indice)]);
            } else {
                return (double) (notas[(int) indice-2] + notas[(int) indice-1]) / 2;
            }
            
        }
    }
    
    private static double calcMediana(int[] notas) {
        boolean eImpar = notas.length % 2 != 0;
        if (eImpar) {
            return notas[notas.length / 2];
        } else {
            return (notas[notas.length/2] + notas[notas.length/2+1]) / 2.0;
        }
    }

    private static int[][] calcModa(int[] notas) {
        int[][] elementos = new int[notas.length][notas.length];
        for (int i = 0; i < elementos.length; i++) {
            for (int k = 0; k < elementos[i].length; k++) {
                elementos[i][k] = -1;
            }
        }
        int contador = 0;
        int indice = 0;
        int actual = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (i != notas.length-1) {
                if (actual == notas[i]) {
                    contador++;
                } else {
                    for (int j = 0; j < elementos.length; j++) {
                        if (elementos[contador+1][j] == -1) {
                            elementos[contador+1][j] = actual;
                            break;
                        }
                    }
                    contador = 0;
                    actual = notas[i];
                }
            } else {
                if (notas[i] != notas[i-2]) {
                    for (int j = 0; j < elementos.length; j++) {
                        if (elementos[1][j] == -1) {
                            elementos[1][j] = notas[i];
                            break;
                        }
                    }
                }
            }
        }
        return elementos;

    }

    private static void ordenarVector(int[] notas) {
        int desordenado = 1;
        int temp;
        while (desordenado > 0) {
            desordenado = 0;
            for (int i = 0; i < notas.length-1; i++) {
                if (notas[i] > notas[i+1]) {
                    temp = notas[i];
                    notas[i] = notas[i+1];
                    notas[i+1] = temp;
                    desordenado++; 
                }
            }
        }
    }

    private static double calcDesvioPadrao(int[] notas, double media) {
        double dp = 0.0;
        for (int i = 0; i < notas.length; i++) {
            dp += Math.pow((notas[i] - media), 2) / notas.length;
        }
        return Math.sqrt(dp);
    }

    private static double calcMedia(int[] notas) {
        int soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / (double) notas.length;
    }

}
