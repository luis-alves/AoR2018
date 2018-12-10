import java.awt.*;
import java.util.Scanner;

import java.applet.Applet;

/**
 * Applet contendo um desenho com circunferências. O centro é no 
 * ponto (100,100) e o raio das circunferências é de 30.
 *
 * @sid 2012
 * @aid 4.1
 */
public class Ex01 extends Applet {

	public void paint (Graphics g) {

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual é o raio da circunferência interior?");
		int r = scanner.nextInt();
		
		System.out.println("Qual é o raio das circunferências exteriores?");
		int rc = scanner.nextInt();
		
		System.out.println("Qual é a coordenada x do centro da circunferência"
				+ "interior?");
		int x0 = scanner.nextInt();
		
		System.out.println("Qual é a coordenada y do centro da circunferência"
				+ "interior?");
		int y0 = scanner.nextInt();
		
		scanner.close();
		
		g.drawOval(x0-r, y0-r, 2*r, 2*r);

		g.drawOval((x0-rc), (y0-r-rc), 2*rc, 2*rc);
		g.drawOval((x0-r-rc), (y0-rc), 2*rc, 2*rc);
		g.drawOval((x0+r-rc), (y0-rc), 2*rc, 2*rc);
		g.drawOval((x0-rc), (y0+r-rc), 2*rc, 2*rc);

		
		double x = 0.5 * (Math.sqrt((r + r) * (r + 0)) + 
				Math.sqrt((r - r) * (double) (r - 0)));
		
		//System.out.println(x);
		
		
		g.drawOval((x0+(int)x-rc), (y0-(int)x-rc), 2*rc, 2*rc);
		g.drawOval((x0-(int)x-rc), (y0-(int)x-rc), 2*rc, 2*rc);
		g.drawOval((x0+(int)x-rc), (y0+(int)x-rc), 2*rc, 2*rc);
		g.drawOval((x0-(int)x-rc), (y0+(int)x-rc), 2*rc, 2*rc);

		//begin_inputs
		//end_inputs

	}

}
