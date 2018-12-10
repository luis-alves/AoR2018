import java.awt.*;
import java.applet.*;

/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 4.2
 */
public class Ex02 extends Applet {
	
	public void paint (Graphics g) {
		
		boolean andando = true;
		boolean dirDireita = true;
		
		int i = 0;

		while (andando) {
			if (dirDireita == true) {
				while (dirDireita) {
					if (i < 180) {
						g.setColor(Color.black);
						g.drawRect(i, 10, 20, 30);
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						g.setColor(getBackground());
						g.fillRect(i-1, 10-1, getWidth(), getHeight());
							
						i+=10;
					} else {
						dirDireita = false;
					}
				}
			} else {
				while (dirDireita==false) {
					if (i > 0) {
						g.setColor(Color.black);
						g.drawRect(i, 10, 20, 30);
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						g.setColor(getBackground());
						g.fillRect(i-1, 10-1, getWidth(), getHeight());
							
						i-=10;
					} else {
						dirDireita = true;
					}
				}
			}
		}
	}
}
