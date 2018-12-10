import java.util.ArrayList;

public class ListaDeContatos {
    private int size;
    private ArrayList<Contato> contatos;
    private int numContatos;

    public ListaDeContatos(int size) {
        this.size = size;
        this.contatos = new ArrayList<Contato>(size);
        this.numContatos = 0;
    }

    public Contato pesquisa(String nomeAPesquisar) {
        for (Contato contato : this.contatos ) {
           if (contato.getNome().toLowerCase() == nomeAPesquisar.toLowerCase())
               return contato;
        }
        return  null;
    }

    public void adicionarContato(Contato contato) {
        if (this.numContatos < this.size) {
            contatos.add(contato);
            this.numContatos++;
        } else
            System.out.println("Lista telefónica cheia.");
    }

    public void remove(Contato contato) {
       if (this.contatos.contains(contato)) {
           this.contatos.remove(contato);
       } else
           System.out.println("O contato não está na lista telefónica");
    }

    public void imprime() {
        for (Contato contato : this.contatos) {
            System.out.println(contato.getNome());
        }
    }
}
