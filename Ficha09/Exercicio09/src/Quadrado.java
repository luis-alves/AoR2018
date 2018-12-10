import java.util.HashMap;

/**
 * @sid 2012
 * @aid 9.9
 */
public class Quadrado extends FiguraGeometrica {

    private int compAresta;

    public Quadrado(String nome, int compAresta) {
        super(nome);
        this.compAresta = compAresta;
        this.props.put("Aresta", new Object[]{compAresta});
        this.props.put("Área", new Object[]{this.area()});
    }

    int getCompAresta() {
        return this.compAresta;
    }

    protected HashMap<String, Object[]> propriedades() {
        this.props.put("Área:", new Object[]{this.area()});
        return this.props;
    }

    public double area() {
        return Math.pow(this.compAresta, 2);
    }
}
