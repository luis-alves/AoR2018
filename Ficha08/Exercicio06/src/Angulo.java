/**
 * Classe utilizada para criar objectos Angulo.
 *
 * @sid 2012
 * @aid 8.6
 */
public class Angulo {

    private double graus;
    
    public Angulo() {
        this.graus = 0.0;
    }
    
    public Angulo(double graus) {
        this.graus = graus;
    }
    
    public double getGraus() {
        return this.graus;
    }
    
    public void setGraus(double graus) {
        this.graus = graus;
    }
    
    public Angulo adicao(Angulo x) {
        Angulo y = new Angulo();
        
        y.graus = this.graus + x.graus;
        return y;
    }

    public Angulo subtracao(Angulo x) {
        Angulo y = new Angulo();
        
        y.graus = this.graus - x.graus;
        return y;
    }
    
    public double radianos() {
        return Math.toRadians(this.graus);
    }

    public double paraGraus() {
        return Math.toDegrees(Math.abs(this.graus));
    }
    
    public boolean equals(Angulo x) {
        final double LIMITE = 0.001;
        return Math.abs(this.graus - x.getGraus()) < LIMITE;
    }
    
    public double sin() {
        return Math.sin(Math.toRadians(this.graus));
    }
    
    public double cos() {
        return Math.cos(Math.toRadians(this.graus));
    }
    
    public double tg() {
        return Math.tan(Math.toRadians(this.graus));
    }
    
    public void print() {
        System.out.println("ângulo de " + this.graus + " graus");
    }
    
    public void print(double radianos) {
        System.out.println(radianos);
    }

}
