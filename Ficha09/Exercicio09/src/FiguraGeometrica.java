import java.util.HashMap;
import java.util.Map;

/**
 * @sid 2012
 * @aid 9.9
 */
public abstract class FiguraGeometrica {

    private String nome;
    HashMap<String, Object[]> props = new HashMap<>();

    FiguraGeometrica(String nome) {
        this.nome = nome;
        this.props.put("Nome", new Object[]{nome});
    }

    protected abstract HashMap<String, Object[]> propriedades();

    public String toString() {
        this.propriedades();
        final String[] result = {""};
        for (Map.Entry<String, Object[]> entry : this.props.entrySet()) {
            String s = entry.getKey();
            Object[] d = entry.getValue();
            if (s.equals("Ponto")) {
                result[0] += s + " (" + d[0] + ", " + d[0] + ") ";
            } else {
                result[0] += s + " " + d[0] + " ";
            }
        }
        return result[0];
    }

    protected abstract double area();

    public String getNome() {
        return nome;
    }
}
