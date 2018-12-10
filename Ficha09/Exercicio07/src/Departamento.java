import javax.lang.model.element.NestingKind;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @sid 2012
 * @aid 9.7
 */
public class Departamento implements Convivio {

    private String nome;
    private String morada;
    private ArrayList<Pessoa> pessoas;

    public Departamento(String nome, String morada) {
        this.nome = nome;
        this.morada = morada;
        this.pessoas = new ArrayList<>();
    }

    @Override
    public void convida(Pessoa p) {
        switch (p.getClass().getName()) {
            case "Funcionario":
                p.setValorAPagar(p.getNumAcompanhantes() * this.precoFuncionarioAc + this.precoFuncionario);
                inscreve(p);
                break;
            case "Docente":
                p.setValorAPagar(p.getNumAcompanhantes() * this.precoDocenteAc + this.precoDocente);
                inscreve(p);
                break;
            case "AlunoDoutoramento":
                p.setValorAPagar(p.getNumAcompanhantes() * this.precoAlunoDoutorAc + this.precoAlunoDoutor);
                inscreve(p);
                break;
            case "AlunoMestrado":
                p.setValorAPagar(p.getNumAcompanhantes() * this.precoAlunoMestreAc + this.precoAlunoMestre);
                inscreve(p);
                break;
            case "AlunoBSc":
                p.setValorAPagar(p.getNumAcompanhantes() * this.precoAlunoBScAc + this.precoAlunoBSc);
                inscreve(p);
                break;
            default:
        }
    }

    private void inscreve(Pessoa p) {
        if (this.pessoas.contains(p)) {
            System.out.format("O %s já se tinha inscrito.", p.getNome());
        } else {
            this.pessoas.add(p);
        }
    }

    void imprimirListaPessoasInscritas() {
        try {
            for (Pessoa p : pessoas) {
                System.out.format("Nome: %s. Quantidade acompanhantes: %d. Valor total pago: %d escudos%n",
                        p.getNome(),
                        p.getNumAcompanhantes(),
                        p.getValorAPagar());
            }
        } catch (Exception e) {
            // TODO Porque razão não imprime esta mensagem?
            System.out.println("Ainda não tem convidados inscritos." + e.getMessage());
        }
    }

    void imprimirPorCategorias() {
        Map<String, Integer> totais = new HashMap<>();
        for (Pessoa p : this.pessoas) {
            if (p instanceof Funcionario) {
                if (totais.get("Funcionário") == null) {
                    totais.put("Funcionário", p.getValorAPagar());
                } else {
                    Integer value = totais.get("Funcionário");
                    totais.put("Funcionário", p.getValorAPagar() + value);
                }
            } else if (p instanceof Docente) {
                if (totais.get("Docente") == null) {
                    totais.put("Docente", p.getValorAPagar());
                } else {
                    Integer value = totais.get("Docente");
                    totais.put("Docente", p.getValorAPagar() + value);
                }
            } else if (p instanceof AlunoDoutoramento) {
                if (totais.get("Aluno Doutorado") == null) {
                    totais.put("Aluno Doutorado", p.getValorAPagar());
                } else {
                    Integer value = totais.get("Aluno Doutorado");
                    totais.put("Aluno Doutorado", p.getValorAPagar() + value);
                }
            } else if (p instanceof AlunoMestrado) {
                if (totais.get("Aluno Mestrado") == null) {
                    totais.put("Aluno Mestrado", p.getValorAPagar());
                } else {
                    Integer value = totais.get("Aluno Mestrado");
                    totais.put("Aluno Mestrado", p.getValorAPagar() + value);
                }
            } else if (p instanceof AlunoBSc) {
                if (totais.get("Aluno Licenciatura") == null) {
                    totais.put("Aluno Licenciatura", p.getValorAPagar());
                } else {
                    Integer value = totais.get("Aluno Licenciatura");
                    totais.put("Aluno Licenciatura", p.getValorAPagar() + value);
                }
            }
        }

        for (String s : totais.keySet()) {
            System.out.println("Tipo: " + s.toString() + ". Valor pago: " + totais.get(s));
        }
    }

}
