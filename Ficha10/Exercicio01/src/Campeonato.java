import java.util.ArrayList;

/**
 * @sid: 2012
 * @aid: 10.1
 */
public class Campeonato {

    private String nome;
    private String pais;
    private int numMaxEquipas;
    private ArrayList<Equipa> equipas;
    private ArrayList<Jogador> equipaMaravilha;

    public Campeonato(String nome, String pais, int numMaxEquipas) {
        this.nome = nome;
        this.pais = pais;
        this.numMaxEquipas = numMaxEquipas;
        this.equipas = new ArrayList<>(numMaxEquipas);
    }

    Jogador melhorJogadorCampeonato() {
        Equipa melhorCampeonato = this.formarEquipaMaravilha(this);
        return melhorCampeonato.jogadorMaisValioso();
    }

    Jogador melhorJogadorCampeonato(int tipo) {
        Equipa melhorCampeonato = this.formarEquipaMaravilha(this);
        return melhorCampeonato.jogadorMaisValioso(tipo);
    }

    Equipa formarEquipaMaravilha(Campeonato liga) {
        Equipa equipaMaravilha = new Equipa("Equipa Maravilha", 11);
        ArrayList<Jogador> todosGuardaRedes = getTodosGuardaRedes();
        ordenarGuardaRedes(todosGuardaRedes);
        for (int i = 0; i < 3; i++) {
            equipaMaravilha.adicionarJogadorEquipaMaravilha(todosGuardaRedes.get(i), this);
        }

        ArrayList<Jogador> todosDefesas = getTodosDefesas();
        ordenarDefesas(todosDefesas);
        for (int i = 0; i < 8; i++) {
            equipaMaravilha.adicionarJogadorEquipaMaravilha(todosDefesas.get(i), this);
        }

        ArrayList<Jogador> todosMedios = getTodosMedios();
        ordenarMedios(todosMedios);
        for (int i = 0; i < 8; i++) {
            equipaMaravilha.adicionarJogadorEquipaMaravilha(todosMedios.get(i), this);
        }

        ArrayList<Jogador> todosAvancados = getTodosAvancados();
        ordenarAvancados(todosAvancados);
        for (int i = 0; i < 4; i++) {
            System.out.println(todosAvancados.get(i).getNome());
            equipaMaravilha.adicionarJogadorEquipaMaravilha(todosAvancados.get(i), this);
        }
        
        return equipaMaravilha;
    }

    private void ordenarAvancados(ArrayList<Jogador> jogador) {
        Jogador temp = new Avancado("", 0, 0);
        boolean continuar = true;
        while (continuar) {
            int contador = 0;
            for (int i = 0; i < jogador.size()-1; i++) {
                Avancado jogAnterior = ((Avancado) jogador.get(i));
                Avancado jogPosterior = ((Avancado) jogador.get(i + 1));
                if (jogAnterior.pontuacao() < jogPosterior.pontuacao()) {
                    temp = jogAnterior;
                    jogador.set(i, jogPosterior);
                    jogador.set(i + 1, temp);
                    contador++;
                }
            }
            if (contador == 0) {
                continuar = false;
            }
        }
    }

    private ArrayList<Jogador> getTodosAvancados() {
        ArrayList<Jogador> jogadores = new ArrayList<>();
        for (Equipa e : this.getEquipas()) {
            for (Jogador j : e.getJogadores()) {
                if (j instanceof Avancado) {
                    jogadores.add(j);
                }
            }
        }
        return jogadores;
    }

    private void ordenarMedios(ArrayList<Jogador> jogador) {
        Jogador temp = new Medio("", 0, 0, 0);
        boolean continuar = true;
        while (continuar) {
            int contador = 0;
            for (int i = 0; i < jogador.size()-1; i++) {
                Medio jogAnterior = ((Medio) jogador.get(i));
                Medio jogPosterior = ((Medio) jogador.get(i + 1));
                if (jogAnterior.pontuacao() < jogPosterior.pontuacao()) {
                    temp = jogAnterior;
                    jogador.set(i, jogPosterior);
                    jogador.set(i + 1, temp);
                    contador++;
                }
            }
            if (contador == 0) {
                continuar = false;
            }
        }
    }

    private ArrayList<Jogador> getTodosMedios() {
        ArrayList<Jogador> jogadores = new ArrayList<>();
        for (Equipa e : this.getEquipas()) {
            for (Jogador j : e.getJogadores()) {
                if (j instanceof Medio) {
                    jogadores.add(j);
                }
            }
        }
        return jogadores;
    }

    private void ordenarDefesas(ArrayList<Jogador> jogador) {
        Jogador temp = new Defesa("", 0, 0, 0);
        boolean continuar = true;
        while (continuar) {
            int contador = 0;
            for (int i = 0; i < jogador.size()-1; i++) {
                Defesa jogAnterior = ((Defesa) jogador.get(i));
                Defesa jogPosterior = ((Defesa) jogador.get(i + 1));
                if (jogAnterior.getRacio() < jogPosterior.getRacio()) {
                    temp = jogAnterior;
                    jogador.set(i, jogPosterior);
                    jogador.set(i + 1, temp);
                    contador++;
                }
            }
            if (contador == 0) {
                continuar = false;
            }
        }
    }

    private ArrayList<Jogador> getTodosDefesas() {
        ArrayList<Jogador> jogadores = new ArrayList<>();
        for (Equipa e : this.getEquipas()) {
            for (Jogador j : e.getJogadores()) {
                if (j instanceof Defesa) {
                    jogadores.add(j);
                }
            }
        }
        return jogadores;
    }

    private void ordenarGuardaRedes(ArrayList<Jogador> jogador) {
        Jogador temp = new GuardaRedes("", 0, 0);
        boolean continuar = true;
        while (continuar) {
            int contador = 0;
            for (int i = 0; i < jogador.size()-1; i++) {
                if (((GuardaRedes) jogador.get(i)).pontuacao() > ((GuardaRedes) jogador.get(i + 1)).pontuacao()) {
                    temp = jogador.get(i);
                    jogador.set(i, jogador.get(i + 1));
                    jogador.set(i + 1, temp);
                    contador++;
                }
            }
            if (contador == 0) {
                continuar = false;
            }
        }
    }

    private ArrayList<Jogador> getTodosGuardaRedes() {
        ArrayList<Jogador> jogadores = new ArrayList<>();
        for (Equipa e : this.getEquipas()) {
            for (Jogador j : e.getJogadores()) {
                if (j instanceof GuardaRedes) {
                    jogadores.add(j);
                }
            }
        }
        return jogadores;
    }

    void imprimirEquipas() {
        if (this.equipas != null && this.equipas.size() > 0) {
            this.equipas.forEach(equipa -> System.out.println("- " + equipa.getNome()));
        } else {
            System.out.println("Não existem equipas no campeonato.");
        }
    }

    void adicionarEquipa(Equipa e) {
        if (this.numMaxEquipas > this.equipas.size()) {
            if (!this.equipas.contains(e)) {
                this.equipas.add(e);
                System.out.println("A equipa " + e.getNome() + " foi inscrita no campeonato.");
            } else
                System.out.println("A equipa já está inscrita no Campeonato");
        } else
            System.out.println("De momento a equipa " + e.getNome() + " não pode ser inscrita, pois, " +
                    "o campeonato atingiu o limite de equipas que se podem inscrever.");
    }

    void removerEquipa(Equipa e) {
        if (this.equipas.contains(e)) {
            this.equipas.remove(e);
            System.out.println("A equipa " + e.getNome() + " foi removida do campeonato");
        } else
            System.out.println("A equipa " + e.getNome() + " Não está inscrita no campeonato.");
    }

    String getNome() {
        return nome;
    }

    String getPais() {
        return pais;
    }

    int getNumMaxEquipas() {
        return numMaxEquipas;
    }

    ArrayList<Equipa> getEquipas() {
        return equipas;
    }
}
