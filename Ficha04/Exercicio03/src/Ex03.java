import java.awt.*;
import java.applet.Applet;

/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 4.3
 */
public class Ex03 extends Applet {
	
	public void paint (Graphics g) {

		int raio = 60;
		
		g.drawOval(100-60, 100-60, 2*raio, 2*raio);
		
		// Desenho dos marcadores dos minutos
		for (int i = 0; i < 360; i+=30) {
			double x = raio * Math.cos(Math.toRadians(i)) + 100;
			double y = raio * Math.sin(Math.toRadians(i)) + 100;

			double x1 = (raio - 5) * Math.cos(Math.toRadians(i)) + 100;
			double y1 = (raio - 5) * Math.sin(Math.toRadians(i)) + 100;

			g.drawLine((int) x1, (int) y1, (int) x, (int) y);

			switch (i) {
				case 0:
					g.drawString("12", 92, 57);
					break;
				case 30:
					g.drawString("3", 145, 105);
					break;
				case 60:
					g.drawString("6", 96, 153);
					break;
				case 90:
					g.drawString("9", 46, 105);
					break;
				default:
					break;
			}

		}
		
		int minutos = 0;
		int horas;
		int contador = 0;
		int inicio = 270;
		int inicioHora = 270;

		double xSegundos = raio*6/7 * Math.cos(Math.toRadians(270)) + 100;
		double ySegundos = raio*6/7 * Math.sin(Math.toRadians(270)) + 100;

		double xMinutos = (raio*5/7 - 5) * Math.cos(Math.toRadians(270)) + 100;
		double yMinutos = (raio*5/7 - 5) * Math.sin(Math.toRadians(270)) + 100;

		double xHoras = (raio*4/7 - 5) * Math.cos(Math.toRadians(270)) + 100;
		double yHoras = (raio*4/7 - 5) * Math.sin(Math.toRadians(270)) + 100;

		
		while (true) {
			for (int i = 0; i < 360; i+=6) {
				g.setColor(Color.red);
				xSegundos = raio*6/7 * Math.cos(Math.toRadians(i-90)) + 100;
				ySegundos = raio*6/7 * Math.sin(Math.toRadians(i-90)) + 100;
				g.drawLine(100, 100, (int) xSegundos, (int) ySegundos);

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				g.setColor(Color.black);
				g.drawString("12", 92, 57);
				g.drawString("3", 145,  105);
				g.drawString("6", 96, 153);
				g.drawString("9", 46, 105);
				
				if (i == 0 && contador != 0) {
					inicio += 6;
					g.setColor(getBackground());
					g.drawLine(100, 100, (int) xSegundos, (int) ySegundos);
					g.drawLine(100, 100, (int) xMinutos, (int) yMinutos);
					xMinutos = (raio*5/7 - 5) * Math.cos(Math.toRadians(360 + (inicio%360))) + 100;
					yMinutos = (raio*5/7 - 5) * Math.sin(Math.toRadians(360 + (inicio%360))) + 100;
					g.setColor(Color.green);
					g.drawLine(100, 100, (int) xMinutos, (int) yMinutos);
					minutos++;
					if (minutos % 60 == 0 && contador != 0) {
						inicioHora += 30;
						g.setColor(getBackground());
						g.drawLine(100, 100, (int) xHoras, (int) yHoras);
						xHoras = (raio*4/7 - 5) * Math.cos(Math.toRadians(360 + inicioHora%360)) + 100;
						yHoras = (raio*4/7 - 5) * Math.sin(Math.toRadians(360 + inicioHora%360)) + 100;
						g.setColor(Color.green);
						g.drawLine(100, 100, (int) xHoras, (int) yHoras);
					}
				} else {
					g.setColor(getBackground());
					g.drawLine(100, 100, (int) xSegundos, (int) ySegundos);
					g.setColor(Color.green);
					g.drawLine(100, 100, (int) xMinutos, (int) yMinutos);
					g.setColor(Color.black);
					g.drawLine(100, 100, (int) xHoras, (int) yHoras);
					
					contador++;
				}
				

			}
		}


	}

}
