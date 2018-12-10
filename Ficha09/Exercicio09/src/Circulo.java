import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @sid 2012
 * @aid 9.9
 */
public class Circulo extends FiguraGeometrica {

    private int raio;
    private Point centro;

    public Circulo(String nome, int raio, Point centro) {
        super(nome);
        this.raio = raio;
        this.centro = centro;
        this.props.put("Ponto", new Object[]{centro});
        this.props.put("Raio", new Object[]{raio});
    }

    protected HashMap<String, Object[]> propriedades() {
        this.props.put("Área:", new Object[]{this.area()});
        return this.props;
    }

    public double area() {
        return Math.PI * this.getRaio() * this.getRaio();
    }

    private int getRaio() {
        return raio;
    }

    public Point getCentro() {
        return centro;
    }
}
