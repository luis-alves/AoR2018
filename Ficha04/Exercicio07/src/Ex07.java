import java.awt.*;
import java.util.Scanner;
import java.applet.Applet;

/**
 * Desenha um polígono dentro de uma circunferência, com retas enre
 * vértices e centro do ultímo.
 *
 * @sid 2012
 * @aid 4.7
 */
public class Ex07 extends Applet {
	
	public void paint (Graphics g) {
		
		int numVertices;
		int raio = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Quantos vértices?");
			numVertices = sc.nextInt();
		} while(numVertices < 4 || numVertices >= 20);
		
		do {
			System.out.println("Qual é o raio?");
			if (sc.hasNextInt()) {
				raio = sc.nextInt();
			}
		} while (raio < 50 || raio > 100);
		sc.close();
		
		double anguloVertice = 360 / (double) numVertices;
		
		g.drawOval(100-raio, 100-raio, 2*raio, 2*raio);
		
		double x0 = 100 + raio;
		double y0 = 100;
		
		for (int i = 0; i <= 360; i+=anguloVertice) {
			double x = (raio + 10) * Math.cos(Math.toRadians(i)) + 100;
			double y = (raio + 10) * Math.sin(Math.toRadians(i)) + 100;
			
			if (i != 360) {
				g.drawLine(100,  100, (int) x, (int)y); 
			}
			
			x = raio * Math.cos(Math.toRadians(i)) + 100;
			y = raio * Math.sin(Math.toRadians(i)) + 100;
			
			g.drawLine((int) x0, (int) y0, (int) x, (int) y);
			
			x0 = x;
			y0 = y;
		}
		
	}
}
