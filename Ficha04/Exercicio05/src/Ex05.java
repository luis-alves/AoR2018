import java.awt.*;
import java.applet.Applet;
import java.util.*;

/**
 * Simulador de bola de bilhar.
 *
 * @sid 2012
 * @aid 4.5
 */
public class Ex05 extends Applet {

	public void paint (Graphics g) {
		
		int raioBola = 10; // em pixels
		
		Random numRandom = new Random();

		// Coordenadas aleatórias da posição inicial da bola
		double x = numRandom.nextInt(150);
		double y = numRandom.nextInt(150);

		g.setColor(Color.red);
		g.fillOval((int) x, (int) y, raioBola, raioBola);

		g.setColor(getBackground());
		g.fillOval((int) x, (int) y, raioBola, raioBola);
		repaint();
		
		// definição da velocidade e direção da bola
		int velocidade = raioBola/3;
		int direcao = numRandom.nextInt(360);
		
		double dirX = Math.cos(Math.toRadians(direcao));
		double dirY = Math.sin(Math.toRadians(direcao));
		
		g.setColor(Color.red);
		double x1 = velocidade * dirX + x;
		double y1 = velocidade * dirY + y;
		g.fillOval((int) x1,(int) y1, raioBola, raioBola);

		try {
			repaint();
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		g.setColor(getBackground());
		g.fillOval((int) x1, (int) y1, raioBola, raioBola);
		repaint();
		
		while (true) {
			velocidade += raioBola/3;
			if (x1 > 200-raioBola) {
				velocidade = raioBola/3;
				x = x1;
				y = y1;
				if (direcao < 360 && direcao > 270) {
					direcao = (360 + direcao - 90) % 360;
					dirX = Math.cos(Math.toRadians(direcao));
					dirY = Math.sin(Math.toRadians(direcao));

				}
				if (direcao > 0 && direcao < 90) {
					direcao = (360 + direcao + 90) % 360;
					dirX = Math.cos(Math.toRadians(direcao));
					dirY = Math.sin(Math.toRadians(direcao));
				}
			} else if (x1 < 0) {
				velocidade = raioBola/3;
				x = (int) x1;
				y = (int) y1;
				if (direcao > 180 && direcao < 270) {
					direcao = (360 + direcao + 90) % 360;
					dirX = Math.cos(Math.toRadians(direcao));
					dirY = Math.sin(Math.toRadians(direcao));
				}
				if (direcao > 90 && direcao < 180) {
					direcao = (360 + direcao - 90) % 360;
					dirX = Math.cos(Math.toRadians(direcao));
					dirY = Math.sin(Math.toRadians(direcao));
				}
			} else if (y1 < 0) {
				velocidade = raioBola/3;
				x = (int) x1;
				y = (int) y1;
				if (direcao > 180 && direcao < 270) {
					direcao = (360 + direcao - 90) % 360;
					dirX = Math.cos(Math.toRadians(direcao));
					dirY = Math.sin(Math.toRadians(direcao));
				}
				if (direcao > 270 && direcao < 360) {
					direcao = (360 + direcao + 90) % 360;
					dirX = Math.cos(Math.toRadians(direcao));
					dirY = Math.sin(Math.toRadians(direcao));
				}
				
			} else if (y1 > 220-2*raioBola) {
				velocidade = raioBola/3;
				x = (int) x1;
				y = (int) y1;
				if (direcao > 90 && direcao < 180) {
					direcao = (360 + direcao + 90) % 360;
					dirX = Math.cos(Math.toRadians(direcao));
					dirY = Math.sin(Math.toRadians(direcao));
				}
				if (direcao > 0 && direcao < 90) {
					direcao = (360 + direcao - 90) % 360;
					dirX = Math.cos(Math.toRadians(direcao));
					dirY = Math.sin(Math.toRadians(direcao));
				}
				
			}

			x1 = velocidade * dirX + x;
			y1 = velocidade * dirY + y;

			g.setColor(Color.red);
			g.fillOval((int) x1,(int) y1, raioBola, raioBola);

			try {
				repaint();
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			g.setColor(getBackground());
			g.clearRect((int) x1, (int) y1, raioBola, raioBola);
			
		}
		
	}

}
