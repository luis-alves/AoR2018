/**
 * @sid 2012
 * @aid 9.8
 */
class ClienteEmpresarial extends Cliente {

    private Empresa empresa;

    ClienteEmpresarial(String nome, String telefone, Empresa empresa) {
        super(nome, telefone);
        this.empresa = empresa;
    }

    Empresa getEmpresa() {
        return empresa;
    }

    void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

}
