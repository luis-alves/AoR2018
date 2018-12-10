import java.awt.*;
import java.util.Scanner;
import java.applet.Applet;

/**
 * Desenha uma bola a saltitar, indicando o caminho percorrido e altura
 * atingida em cada salto.
 *
 * @sid 2012
 * @aid 4.11
 */
public class Ex11 extends Applet {
	
	public void paint(Graphics g) {

//		setSize(500, 500);
		
		int ALTURA_MAXIMA = getHeight();
		int RAIO_BOLA = getWidth()/60;
		int ALTURA_SOLO = 20;
		double h;
		int n;

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("Qual é a altura (h)? Não pode ser superior a " +
					ALTURA_MAXIMA + ". ");
			h = scanner.nextInt();
		} while (h > ALTURA_MAXIMA || h <= 0);
		
		do {
			System.out.println("Qual é o valor de n? ");
			n = scanner.nextInt();
		} while (n <= 0);
		
		scanner.close();
		
		// Desenho da superficie
		g.drawLine(0, ALTURA_MAXIMA-ALTURA_SOLO, getWidth(), ALTURA_MAXIMA-ALTURA_SOLO);
		
		// Posição inicial da bola
		int x = getWidth() / 2;
		double y = ALTURA_MAXIMA - h - ALTURA_SOLO;
		System.out.println(x + " "+ y);
		g.drawOval(x-RAIO_BOLA,(int) y-RAIO_BOLA, RAIO_BOLA, RAIO_BOLA);
		
		boolean aCair = true;
		int dist = 0;

		g.setColor(Color.red);
		g.drawString("Dist. Total: ", 0, ALTURA_MAXIMA-9);
		g.drawString("Alt.: ", 130, ALTURA_MAXIMA-9);
		for (int i = 0; i < 2*n; i++) {
			if (aCair) {
				dist += h;
				for (int j = 0; j < h; j+=4) {
					g.setColor(Color.black);
					g.drawOval(x-RAIO_BOLA,(int) y+j-RAIO_BOLA, RAIO_BOLA, RAIO_BOLA);
					g.setColor(Color.red);
					g.drawString("" + (int) dist, 90, ALTURA_MAXIMA-9);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					g.setColor(getBackground());
					g.drawOval(x-RAIO_BOLA, (int) y+j-RAIO_BOLA, RAIO_BOLA, RAIO_BOLA);
					g.drawString("" + dist, 90, ALTURA_MAXIMA-9);
				}
				
				aCair = false;
			} else {
				h = Math.random()*h;
				dist += h;
				for (int j = ALTURA_MAXIMA-ALTURA_SOLO; j > ALTURA_MAXIMA-h-ALTURA_SOLO; j-=4) {
					g.setColor(Color.black);
					g.drawOval(x-RAIO_BOLA, j-2*RAIO_BOLA, RAIO_BOLA, RAIO_BOLA);
					g.setColor(Color.red);
					g.drawString("" + (int) dist, 90, ALTURA_MAXIMA-9);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					g.setColor(getBackground());
					g.drawOval(x-RAIO_BOLA, j-2*RAIO_BOLA, RAIO_BOLA, RAIO_BOLA);
					g.fillRect(89, ALTURA_MAXIMA-19, 30, 30);
					g.fillRect(154, ALTURA_MAXIMA-19, 30, 30);
				}
				g.setColor(Color.red);
				g.drawString("" + (int) h, 155, ALTURA_MAXIMA-9);
				y = ALTURA_MAXIMA - ALTURA_SOLO-h;
				aCair = true;
				
			}
			
		}
	}

}
