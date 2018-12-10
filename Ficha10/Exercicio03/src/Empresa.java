import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Empresa {

    private String nome;
    private ArrayList<Empregado> empregados;
    private HashMap<Integer, ArrayList<DadosDiarios>> registoMensalTrabalho;
    private int numId = 0;

    public Empresa(String nome) {
        this.nome = nome;
        this.empregados = new ArrayList<>();
        this.registoMensalTrabalho = new HashMap<>();
    }

    Empregado registarTrabalhor(String nome, double valor, double ordenadoBase, String tipo) {
        Empregado e = null;
        if (tipo.equals("Hora")) {
            e = new EmpAHora(nome, valor, ordenadoBase);
        } else if (tipo.equals("Comissão")) {
            e = new EmpAComissao(nome, valor, ordenadoBase);
        }
        this.setNumId();
        e.setId(this.getNumId());
        this.empregados.add(e);
        this.registoMensalTrabalho.put(this.getNumId(), new ArrayList<>());
        return e;
    }

    DadosDiarios criarTrabalhoDiario(LocalDate data, double horaTrabalho, double valorFaturado, Empregado empregado) {
        DadosDiarios x = new DadosDiarios(data, horaTrabalho, valorFaturado, empregado);
        this.registoMensalTrabalho.get(empregado.getId()).add(x);
        return x;
    }

    void registarDiaTrabalho(DadosDiarios d) {
        ArrayList<DadosDiarios> dadosDiarios = this.registoMensalTrabalho.get(d.getEmpregado().getId());
        if (dadosDiarios.contains(d)) {
            dadosDiarios.add(d);
        }
    }

    void imprimirHorasTrabalhador(Empregado e) {

        System.out.println("O empregado " + e.getNome() + " tem os seguintes registos diários:");
        this.registoMensalTrabalho.get(e.getId()).forEach(value -> System.out.println("Dia: " + value.getData() +
                                                                                      " Valor de Vendas: " + value.getValorFaturado() +
                                                                                      " Quant. horas: " + value.getHorasTrabalho()));
    }

    void ordenadosAPagar() {
//        Map<Integer, Double> salariosPorTrabalhador = new HashMap<>();
        for (HashMap.Entry<Integer, ArrayList<DadosDiarios>> x : this.registoMensalTrabalho.entrySet()) {
            double salario = 0;
            int a = x.getKey();
            ArrayList<DadosDiarios> z = x.getValue();
            if (!z.isEmpty()) {
                if (z.get(0).getEmpregado() instanceof EmpAHora) {
                    double soma = 0;
                    for (DadosDiarios sal : z) {
                        System.out.println(sal.getHorasTrabalho());
                        soma += sal.getHorasTrabalho();
                    }
                    salario += ((EmpAHora) z.get(0).getEmpregado()).getValorHora() * soma;
                    System.out.println("Empregado: " + z.get(0).getEmpregado().getNome() + " tem de se pagar: " + salario);
                } else if (z.get(0).getEmpregado() instanceof EmpAComissao) {
                    double soma = 0;
                    for (DadosDiarios sal : z) {
                        soma += sal.getValorFaturado();
                    }
                    salario += ((EmpAComissao) z.get(0).getEmpregado()).getComissao() * soma * z.get(0).getEmpregado().getOrdenadoBase();
                    System.out.println("Empregado: " + z.get(0).getEmpregado().getNome() + " tem de se pagar: " + salario);
                }
            }
        }
    }

    void registoDiarioHorasTrabalho(Empregado e, LocalTime horaEntrada, LocalTime horaSaida) {
        double horasTrabalho = horaSaida.compareTo(horaEntrada);
        System.out.println("hora trabalho " + horasTrabalho);
        double valorDia = e.calcularSalario(horasTrabalho);
    }

    public void setNumId() {
        this.numId ++;
    }

    public int getNumId() {
        return numId;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Empregado> getEmpregados() {
        return empregados;
    }
}
