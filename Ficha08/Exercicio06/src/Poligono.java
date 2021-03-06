import java.awt.geom.Point2D;
import java.util.Arrays;

/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 8.6
 */
public class Poligono {

    private int lados;
    private Point2D[] vertices = new Point2D[lados];
    private Angulo[] declives;


    public Poligono(Point2D[] points) {
        this.lados = points.length;
        this.vertices = points;
        declives = new Angulo[lados];

    decliveLados();
//        System.out.println(Arrays.toString(this.vertices));
    }
    
    public void printAngulos() {
        for (Angulo angulo : declives) {
            System.out.println(angulo.paraGraus());
        }
    }

    private void decliveLados() {
        for (int i = 0, k = this.lados-1; i < this.lados-1; i++, k++) {
//            System.out.println(this.vertices[i].toString()+" "+
//                               this.vertices[i+1].toString()+" "+this.vertices[k%this.lados]);
            this.declives[i] = calcDeclive(this.vertices[i], 
                                           this.vertices[i+1], 
                                           this.vertices[k%this.lados]);
        }
        this.declives[this.lados-1] = calcDeclive(this.vertices[this.lados-1], 
                                                  this.vertices[0], 
                                                  this.vertices[this.lados-2]);
    }
    
    
    private Angulo calcDeclive(Point2D a, Point2D b, Point2D c) {
//        System.out.println("a (" + a.getX() + ", " + a.getY() + ") b (" + b.getX()+", "+b.getY()+") c ("+c.getX()+", "+c.getY()+")");
        Angulo angulo1 = new Angulo(Math.abs(Math.atan2((double)a.getY() - b.getY(), (double)a.getX() - b.getX())));
        Angulo angulo2 = new Angulo(Math.abs(Math.atan2((double)a.getY() - c.getY(), (double)a.getX() - c.getX())));
        
        Angulo x = angulo1.subtracao(angulo2);
        double y = x.paraGraus();
        
        x.setGraus(y);
        
        return x;
    }
    
    public boolean temTodosLadosIguais() {
        int contador = 0;
        double dist = distancia(this.vertices[0], this.vertices[this.lados-1]);
        double dist3 = dist;
        for (int i = 0; i < this.lados-1; i++) {
            double dist2 = distancia(this.vertices[i], this.vertices[i+1]);
            if (dist2 == dist) {
                contador++;
            }
            dist = dist2;
        }
        if (dist == dist3) {
            contador++;
        }
        return contador == this.lados;
    }
    
    public boolean temTodosAngulosIguais() {
        for (int i = 0; i < declives.length-1; i++) {
            if (!this.declives[i].equals(this.declives[i+1])) {
                return false;
            }
        }
        return true;
    }
    
    private double distancia(Point2D a, Point2D b) {
//        System.out.println("s " + a.x + " a " + a.y + " -- " + b.x + " .. " + b.y + " R " + Math.sqrt(Math.pow(Math.abs(a.x-b.x), 2) + Math.pow(Math.abs(a.y-b.y), 2)));
        return Math.sqrt(Math.pow(Math.abs(a.getX()-b.getX()), 2) + Math.pow(Math.abs(a.getY()-b.getY()), 2));
    }

}
