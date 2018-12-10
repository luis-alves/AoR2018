import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @sid 2012
 * @aid 9.9
 */
public class Ponto extends FiguraGeometrica {

    private Point ponto;

    public Ponto(String nome, Point ponto) {
        super(nome);
        this.ponto = ponto;
        this.props.put("Ponto", new Object[]{ponto});
    }

    protected HashMap<String, Object[]> propriedades() {
        this.props.put("Área:", new Object[]{0});
        return this.props;
    }

    public double area() {
        return 0;
    }

    public Point getPonto() {
        return ponto;
    }
}
