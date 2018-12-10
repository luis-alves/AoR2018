import java.awt.*;
import java.applet.Applet;

/**
 * Desenha um queijinho rolante!
 *
 * @sid 2012
 * @aid 4.6
 */
public class Ex06 extends Applet {
	
	public void paint (Graphics g) {
		
		int raio = 0;
		int x = 100;
		int y = 100;
		int x1 = 0;
		int y1 = 0;

		while (true) {
			for (int i = 1, k = 0; i < 100; i+=1, k+=36) {
				x1 = x;
				y1 = x;
				x1 -= i;
				y1 -= i;

				g.setColor(Color.red);
				g.drawOval(x1, y1, raio = 2*i, raio= 2*i);
				repaint();
				
				// O desenhar dos queijinhos
				for (int j = 0; j < 360; j+= 36) {
					double x2 = i * Math.cos(Math.toRadians(j)) + 100; 
					double y2 = i * Math.sin(Math.toRadians(j)) + 100; 
					g.drawLine(100, 100, (int) x2, (int) y2);
					repaint();
				}
				// O encher de um dos queijinhos
				g.fillArc(x1, y1, raio, raio, k, 36);
				repaint();

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				g.setColor(getBackground());
				g.drawOval(x1, y1 , raio, raio);
				repaint();
				g.fillArc(x1, y1, raio, raio, k, 36);
				repaint();

				if (k == 360) {
					k = 0;
				}
			}

			x = x1;
			y = y1;

			for (int i = 99, j = 0, k = 0; i > 1; i-=1, j+=1, k+=36) {
				x1 = x;
				y1 = x;
				x1 += j;
				y1 += j;

				g.setColor(Color.red);
				g.drawOval(x1, y1, raio = 2*i, raio= 2*i);
				repaint();
				for (int l = 0; l < 360; l+= 36) {
					double x2 = i * Math.cos(Math.toRadians(l)) + 100; 
					double y2 = i * Math.sin(Math.toRadians(l)) + 100; 
					g.drawLine(100, 100, (int) x2, (int) y2);
					repaint();
				}

				g.fillArc(x1, y1, raio, raio, k, 36);
				repaint();

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				g.setColor(getBackground());
				for (int l = 0; l < 360; l+= 36) {
					double x2 = i * Math.cos(Math.toRadians(l)) + 100; 
					double y2 = i * Math.sin(Math.toRadians(l)) + 100; 
					g.drawLine(100, 100, (int) x2, (int) y2);
					repaint();
				}
				g.drawOval(x1, y1 , raio, raio);
				repaint();
				g.fillArc(x1, y1, raio, raio, k, 36);
				repaint();
			}

			x = 100;
			y = 100;

		}
	}
}
