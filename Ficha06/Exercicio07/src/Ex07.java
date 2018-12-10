import java.util.Random;
import java.applet.Applet;
import java.awt.*;

/**
 * Applet que gera aleatoriamente as ordenadas de dez pontos, os armazena 
 * num vetor, e mostra a linha formada por eles, unindo cada um dos 
 * pontos adjacentes (o valor da abcissa de cada ponto deve ser igual 
 * ao seu índice no vetor * 20 +50). Seguidamente o applet faz uma 
 * pequena animação em que vai “alisando” a linha formada, 
 * substituindo a ordenada de cada um dos pontos pela média da sua 
 * com a do ponto seguinte. O processo deve continua até que a linha obtida 
 * seja uma reta.
 *
 * @sid 2012
 * @aid 6.7
 */
public class Ex07 extends Applet {

    public void paint(Graphics g) {
        //begin_inputs
        //end_inputs
        int NUMERO_PONTOS = 10;
        
        setSize(800, 200);
        
        // O vector terá a seguinte forma: [x0, y0, x1, y1, .. , x19, y19] 
        int[] pontos = new int[NUMERO_PONTOS*2];
        
        Random rd = new Random();
        int pontoPartilhadoX = pontos[0];
        int pontoPartilhadoY = pontos[1];
        for (int i = 0; i < pontos.length; i++) {
            if (i%2 == 0) {
                // Valor da abssissa
                pontos[i] = i * 20 + 50; 
            } else {
                // Valor da ordenada
                pontos[i] = rd.nextInt(101); 
            }
        }
        int diferencaAltura = 1;
        
        for (int i = 0; i < pontos.length-4; i+=4) {
            pontos[i+1] = (pontos[i+1] + pontos[i+3]) / 2;
        }
        desenhaLinhas(pontos, g);

        while (diferencaAltura != NUMERO_PONTOS-1) {
            diferencaAltura = 0;
            for (int j = 0; j < pontos.length-2; j+=2) {
                if (pontos[j+3] - pontos[j+1] == 0) {
                    diferencaAltura++;
                }
                pontos[j+1] = Math.floorDiv((pontos[j+1] + pontos[j+3]), 2);
                if (j == pontos.length - 4) {
                    pontos[j+3] = Math.floorDiv(pontos[j+3], 2);
                }
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            desenhaLinhas(pontos, g);
        }
    }
    
    private static void desenhaLinhas(int[] pontos, Graphics g) {
        int index = 0;
        g.setColor(Color.white);
        g.fillRect(0, 0, 800, 200);
        g.setColor(Color.black);
        for (int i = 0; i < pontos.length-4; i+=4) {
            if (index > 0) {
                g.drawLine(pontos[i-2], pontos[i-1], pontos[i], pontos[i+1]);
            }
            g.drawLine(pontos[i], pontos[i+1], pontos[i+2], pontos[i+3]);
            index++;
        }
    }
}
