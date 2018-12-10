import java.util.HashMap;

/**
 * @sid 2012
 * @aid 9.9
 */
public class Retangulo extends FiguraGeometrica {

    private int comprimento;
    private int largura;

    public Retangulo(String nome, int comprimento, int largura) {
        super(nome);
        this.comprimento = comprimento;
        this.largura = largura;
    }

    protected HashMap<String, Object[]> propriedades() {
        this.props.put("Área:", new Object[]{this.area()});
        return this.props;
    }

    public double area() {
        return this.getComprimento() * this.getLargura();
    }

    private int getComprimento() {
        return comprimento;
    }

    private int getLargura() {
        return largura;
    }
}
