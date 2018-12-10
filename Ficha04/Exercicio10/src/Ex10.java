import java.awt.*;
import java.applet.Applet;
import java.util.*;

/**
 * Desenha um labirinto de duas cores.
 *
 * @sid 2012
 * @aid 4.10
 */
public class Ex10 extends Applet {

	public void paint(Graphics g) {
		
		int troco = 10;
		
		setSize(500, 500);
		
		int x = getWidth() / 2;
		int y = getHeight() / 2;
		int i = 1;
		int incrementa = 0;
		
		Random random = new Random();
		
		int color1 = random.nextInt(4) + 1;
		int color2 = color1;

		do {
			color2 = random.nextInt(4);
		} while (color2 == color1);


		
		while (x > 0 && x < getWidth() && y > 0 & y < getHeight()) {
			if (i%3 == 0 || i%4 == 0) {
				switch (color1) {
					case 1:
						g.setColor(Color.red);
						break;
					case 2:
						g.setColor(Color.green);
						break;
					case 3:
						g.setColor(Color.blue);
						break;
					case 4:
						g.setColor(Color.gray);
						break;
					
					default:
						break;
				}
				if (i%3 == 0) {
					g.drawLine(x, y, x, y-troco);
					y = y - troco;
				} else {
					g.drawLine(x, y, x-troco, y);
					x = x - troco;
				}
				
				incrementa++;
			} else {
				switch (color2) {
					case 1:
						g.setColor(Color.red);
						break;
					case 2:
						g.setColor(Color.green);
						break;
					case 3:
						g.setColor(Color.blue);
						break;
					case 4:
						g.setColor(Color.gray);
						break;
					
					default:
						break;
				}
				if (i%1 == 0 && i%2 != 0) {
					g.drawLine(x, y, x, y+troco);
					y = y + troco;
				} else {
					g.drawLine(x, y, x+troco, y);
					x = x + troco;
				}
				
				incrementa++;
			}
			

			if (incrementa % 2 == 0) {
				troco += 10;
			}
			if (i == 4) {
				i = 0;
			}

			i++;
		}
		
	}
}
