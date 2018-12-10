import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @sid 2012
 * @aid 9.9
 */
public class SegmentoReta extends FiguraGeometrica {

    private Point pontoInicial;
    private Point pontoFinal;

    public SegmentoReta(String nome, Point pontoInicial, Point pontoFinal) {
        super(nome);
        this.pontoInicial = pontoInicial;
        this.pontoFinal = pontoFinal;
        this.props.put("Ponto Inicial:", new Object[] {pontoInicial});
        this.props.put("Ponto Final:", new Object[] {pontoFinal});
    }

    protected HashMap<String, Object[]> propriedades() {
        this.props.put("Área:", new Object[]{0});
        return this.props;
    }

    public double area() {
        return 0;
    }

    public Point getPontoInicial() {
        return pontoInicial;
    }

    public Point getPontoFinal() {
        return pontoFinal;
    }
}
