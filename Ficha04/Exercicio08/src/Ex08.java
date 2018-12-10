import java.awt.*;
import java.applet.Applet;

/**
 * Desenho de uma espiral de raio duplicado a cada 180 graus.
 *
 * @sid 2012
 * @aid 4.8
 */
public class Ex08 extends Applet {

	public void paint (Graphics g) {

		setSize(500, 500);
		
		int LARGURA = getWidth();
		int ALTURA = getHeight();

		int xcentro = LARGURA/2;
		int ycentro = ALTURA/2;

		double x = xcentro;
		double y = ycentro;
		
		int raio = 20; // raio inicial em pixels 
		
		int i = 0;
		
		while ((x > 0 && x < LARGURA) && (y > 0 && y < ALTURA)) {

			if (i % 2 == 0) {
				double x1 = raio * Math.cos(Math.toRadians(0)) + xcentro;
				double y1 = raio * Math.sin(Math.toRadians(0)) + ycentro;
				g.drawArc(xcentro-raio, ycentro-raio, 2*raio, 2*raio, 0, 180);

				xcentro = (int) x1;
				ycentro = (int) y1;

				x = x1;
			} else {
				double x2 = raio * Math.cos(Math.toRadians(180)) + xcentro;
				double y2 = raio * Math.sin(Math.toRadians(180)) + ycentro;
				g.drawArc(xcentro-raio, ycentro-raio, 2*raio, 2*raio, 180, 180);

				xcentro = (int) x2;
				ycentro = (int) y2;

				x = x2;
			}
			raio *= 2;
			double topo = raio * Math.sin(Math.toRadians(270)) + ycentro;
			double base = raio * Math.sin(Math.toRadians(90)) + ycentro;
			
			if (i%2 == 0) {
				y = topo;
			} else {
				y = base;
			}
			i++;
		}
		
	}
}
