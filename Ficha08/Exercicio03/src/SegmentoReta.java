import java.awt.Point;

/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 
 */
public class SegmentoReta {
    Point[] pts = new Point[2];
    
    public SegmentoReta() {
        // TODO Auto-generated constructor stub
    }
    
    public SegmentoReta(int x1, int x2, int y1, int y2) {
        Point x = new Point(x1, y1);
        Point y = new Point(x2, y2);
        
        this.pts[0] = x;
        this.pts[1] = y;
    }
    
    public Point getPonto(boolean primeiro) {
        return primeiro == true ? pts[0] :pts[1];
    }
    
    protected void setPonto(boolean primeiro, int x, int y) {
        if (primeiro) {
            this.pts[0].x = x;
            this.pts[0].y = y;
        } else {
            this.pts[1].x = x;
            this.pts[1].y = y;
        }
    }
    
    public double calculaDeclive() {
        // NOTA: o enunciado pede um método tipo double, mas se for uma
        // reta vertical o declive é indefinido, pelo que não se pode 
        // representar com um número!
        double declive;
        
        declive = (Math.abs(pts[1].y - pts[0].y)) / 
                        (Math.abs(pts[1].x - pts[0].x));

        return declive;
    }
    
    public double comprimento() {
       double comprimento; 
       
       comprimento = Math.sqrt(Math.pow(Math.abs(pts[0].x - pts[1].x),2) + 
                       Math.pow(Math.abs(pts[0].y - pts[1].y),2));
       
       return comprimento;
    }
    
}
