import java.awt.*;
import java.applet.Applet;

/**
 * Desenha uma estrela!
 *
 * @sid 2012
 * @aid 4.4
 */
public class Ex04 extends Applet {

	public void paint (Graphics g) {
		
		int raio = 60;
		
		int i = 235;
		double j = 0.5;
		for (; i <= 310 || j < 3; i+=15, j+=0.6) {
			double x = raio*j * Math.cos(Math.toRadians(i)) + 300;
			double y = raio*j * Math.sin(Math.toRadians(i)) + 300;	
			
			g.drawLine(300, 300, (int) x, (int) y);
		}

		i = 385;
		j = 0.5;
		for (; i > 310 || j < 3; i-=15, j+=0.6) {
			double x = raio*j * Math.cos(Math.toRadians(i)) + 300;
			double y = raio*j * Math.sin(Math.toRadians(i)) + 300;	
			
			g.drawLine(300, 300, (int) x, (int) y);
		}

		i = 425;
		j = 0.5;
		for (; i > 385; i-=15, j+=0.6) {
			double x = raio*j * Math.cos(Math.toRadians(i)) + 300;
			double y = raio*j * Math.sin(Math.toRadians(i)) + 300;	
			
			g.setColor(Color.red);
			g.drawLine(300, 300, (int) x, (int) y);
		}

		i = 425;
		j = 0.5;
		for (; i < 465; i+=15, j+=0.6) {
			double x = raio*j * Math.cos(Math.toRadians(i)) + 300;
			double y = raio*j * Math.sin(Math.toRadians(i)) + 300;	
			
			g.drawLine(300, 300, (int) x, (int) y);
		}

		i = 465;
		j = 0.5;
		for (; i <= 530; i+=13, j+=0.6) {
			double x = raio*j * Math.cos(Math.toRadians(i)) + 300;
			double y = raio*j * Math.sin(Math.toRadians(i)) + 300;	
			
			g.setColor(Color.blue);
			g.drawLine(300, 300, (int) x, (int) y);
		}

		i = 595;
		j = 0.5;
		for (; i > 530; i-=13, j+=0.6) {
			double x = raio*j * Math.cos(Math.toRadians(i)) + 300;
			double y = raio*j * Math.sin(Math.toRadians(i)) + 300;	
			
			g.drawLine(300, 300, (int) x, (int) y);
		}
		
	}
}
