abstract class Empregado {
    private String nome;
    private int id;
    private double ordenadoBase;

    Empregado(String nome, double ordenadoBase) {
        this.nome = nome;
        this.ordenadoBase = ordenadoBase;
    }

    abstract double calcularSalario(double num);

    void setId(int id) {
        this.id = id;
    }

    public double getOrdenadoBase() {
        return ordenadoBase;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }
}
