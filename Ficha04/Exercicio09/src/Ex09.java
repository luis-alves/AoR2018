import java.awt.*;
import java.applet.Applet;

/**
 * Desenha uma linha que muda de cor consoante gira.
 *
 * @sid 2012
 * @aid 4.9
 */
public class Ex09 extends Applet {

	public void paint (Graphics g) {
		
		int xCentro = 100;
		int yCentro = 100;
		
		int PASSO = 10;
		int LINHA = 100;
		
		while (true) {
			for (int i = 0; i <= 360; i+=PASSO) {
				double x2 = LINHA * Math.cos(Math.toRadians(i)) + xCentro;
				double y2 = LINHA * Math.sin(Math.toRadians(i)) + yCentro;

				if (i >= 0 && i < 90) {
					g.setColor(Color.yellow);
					g.drawLine(xCentro, yCentro, (int) x2, (int) y2);
				} else if (i >= 90 && i < 180) {
					g.setColor(Color.green);
					g.drawLine(xCentro, yCentro, (int) x2, (int) y2);
				} else if (i >= 180 && i < 270) {
					g.setColor(Color.blue);
					g.drawLine(xCentro, yCentro, (int) x2, (int) y2);
				} else if (i >= 270 && i < 360){
					g.setColor(Color.red);
					g.drawLine(xCentro, yCentro, (int) x2, (int) y2);
				}
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				g.setColor(getBackground());
				g.drawLine(xCentro, yCentro, (int) x2, (int) y2);
			}
			
		}
	}
}
