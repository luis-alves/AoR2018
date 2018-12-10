import java.util.ArrayList;

/**
 * @sid: 2012
 * @aid: 9.3
 */
class Equipa {
    private String nome;
    private int numMaxJogadores;
    private ArrayList<Jogador> jogadores;

    Equipa(String nome, int numMaxJogadores) {
        this.nome = nome;
        this.numMaxJogadores = numMaxJogadores;
        this.jogadores = new ArrayList<>();
    }

    void imprimirJogadores() {
        if (this.jogadores != null && this.jogadores.size() > 0) {
            for (Jogador jogador: this.jogadores) {
                if (jogador instanceof GuardaRedes) {
                    System.out.println("- " + jogador.getNome() + " | GS: " + ((GuardaRedes) jogador).getNumGolosSofridos());
                } else if (jogador instanceof Defesa) {
                    System.out.println("- " + jogador.getNome() +
                            " | FC: " + ((Defesa) jogador).getNumFaltasCometidas() +
                            " | RB: " + ((Defesa) jogador).getNumRecuperacaoBola());
                } else if (jogador instanceof Medio) {
                    System.out.println("- " + jogador.getNome() +
                            " | NA " + ((Medio) jogador).getNumAssitencias() +
                            " | GM " + ((Medio) jogador).getNumGolosMarcados());
                } else if (jogador instanceof Avancado){
                    System.out.println("- " + jogador.getNome() +
                            " | GM " + ((Avancado) jogador).getNumGolosMarcados());
                }
            }
        } else {
            System.out.println("A equipa " + this.getNome().toString() + " não tem jogadores inscritos.");
        }
    }

    void adicionarJogadorEquipaMaravilha(Jogador j, Campeonato c) {
        this.jogadores.add(j);
    }

    void adicionarJogador(Jogador j, Campeonato c) {
        Equipa jogadorInscrito = jogadorEstaInscrito(j, c);

        if (jogadorInscrito == null) {
            if (this.jogadores.size() < 24) {
                this.jogadores.add(j);
            } else {
                System.out.println("A equipa atingiu o limite máximo de jogadores.");

            }
        } else {
            System.out.println("O jogador " + j.getNome() + " já está inscrito na equipa " + jogadorInscrito.getNome());
        }
    }

    private Equipa jogadorEstaInscrito(Jogador jogador, Campeonato campeonato) {
        for (Equipa e:campeonato.getEquipas()) {
            if (e.jogadores.contains(jogador)) {
                return e;
            }
        }
        return null;
    }

    void removerJogador(Jogador j) {
        if (this.jogadores.contains(j)) {
            this.jogadores.remove(j);
            System.out.println("O jogador " + j.getNome() + " foi inscrito na equipa.");
        } else
            System.out.println("O jogador " + j.getNome() + " não está inscrito nesta equipa");

    }

    public String getNome() {
        return nome;
    }

    ArrayList<Jogador> getJogadores() {
        return this.jogadores;
    }

    public int getNumMaxJogadores() {
        return numMaxJogadores;
    }
}
