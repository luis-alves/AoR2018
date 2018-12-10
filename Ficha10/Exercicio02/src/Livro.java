import java.time.LocalDateTime;

/**
 * @sid 2012
 * @aid 10.2
 */
class Livro {
    private String titulo;
    private String[] autores;
    private String area;
    private String cota;
    private LocalDateTime dataRequisicao;

    Livro(String titulo, String[] autores, String area) {
        this.titulo = titulo;
        this.autores = autores;
        this.area = area;
        this.cota = "";
    }

    void setCota(int numero) {
        String s = "";
        if (this.autores.length > 0) {
            s = this.autores[0].toUpperCase().substring(0, 3);
        } else {
            s = getTitulo().toUpperCase().substring(0, 3);
        }
        this.cota = s + numero;
    }

    String getTitulo() {
        return titulo;
    }

    String[] getAutores() {
        return autores;
    }

    String getArea() {
        return area;
    }

    String getCota() {
        return cota;
    }

}
