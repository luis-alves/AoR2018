import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @sid 2012
 * @aid 9.3
 */
public class Main {

    public static void main(String[] args) {

        // Criação Liga
        Campeonato liganos = new Campeonato("Liga Nos", "Portugal", 4);

        // Criação 5 equipas
        Equipa sporting = new Equipa("Sporting", 23);
        Equipa porto = new Equipa("Porto", 23);
        Equipa benfica = new Equipa("Benfica", 23);
        Equipa aves = new Equipa("Aves", 23);
        Equipa mealhada = new Equipa("Mealhada", 23);

        liganos.adicionarEquipa(sporting);
        liganos.adicionarEquipa(porto);
        liganos.adicionarEquipa(benfica);
        liganos.adicionarEquipa(aves);
        liganos.adicionarEquipa(mealhada);
        //liganos.imprimirEquipas();
        //sporting.imprimirJogadores();

        Jogador luis = new GuardaRedes("Luis", 1, num());
        Jogador luis2 = new GuardaRedes("Luis2", 2, num());
        Jogador luis3 = new GuardaRedes("Luis3", 3, num());
        Jogador luis4 = new GuardaRedes("Luis4", 4, num());
        Jogador luis5 = new Defesa("luis5", 5, 0, num());
        Jogador luis6 = new Defesa("luis6", 6, 1, num());
        Jogador luis7 = new Defesa("luis7", 7, 2, num());
        Jogador luis8 = new Defesa("luis8", 8, 3, num());
        Jogador luis9 = new Defesa("luis9", 9, 3, num());
        Jogador luis10 = new Medio("luis10", 10, 3, num());
        Jogador luis11 = new Medio("luis11", 11, 5, num());
        Jogador luis12 = new Medio("luis12", 12, 6, num());
        Jogador luis13 = new Medio("luis13", 13, 4, num());
        Jogador luis14 = new Medio("luis14", 14, 3,	num());
        Jogador luis15 = new Avancado("Luís15",15,num());
        Jogador luis16 = new Avancado("Luís16",16,num());
        Jogador luis17 = new Avancado("Luís17",17,num());

        sporting.adicionarJogador(luis, liganos);
        sporting.adicionarJogador(luis2, liganos);
        sporting.adicionarJogador(luis3, liganos);
        sporting.adicionarJogador(luis4, liganos);
        sporting.adicionarJogador(luis5, liganos);
        sporting.adicionarJogador(luis6, liganos);
        sporting.adicionarJogador(luis7, liganos);
        sporting.adicionarJogador(luis8, liganos);
        sporting.adicionarJogador(luis9, liganos);
        sporting.adicionarJogador(luis10, liganos);
        sporting.adicionarJogador(luis11, liganos);
        sporting.adicionarJogador(luis12, liganos);
        sporting.adicionarJogador(luis13, liganos);
        sporting.adicionarJogador(luis14, liganos);
        sporting.adicionarJogador(luis15, liganos);
        sporting.adicionarJogador(luis16, liganos);
        sporting.adicionarJogador(luis17, liganos);

        Jogador daniel = new GuardaRedes("Daniel", 1, num());
        Jogador daniel2 = new GuardaRedes("Daniel2", 2, num());
        Jogador daniel3 = new GuardaRedes("Daniel3", 3, num());
        Jogador daniel4 = new GuardaRedes("Daniel4", 4, num());
        Jogador daniel5 = new Defesa("daniel5", 5, num(), num());
        Jogador daniel6 = new Defesa("daniel6", 6, num(), num());
        Jogador daniel7 = new Defesa("daniel7", 7, num(), num());
        Jogador daniel8 = new Defesa("daniel8", 8, num(), num());
        Jogador daniel9 = new Defesa("daniel9", 9, num(), num());
        Jogador daniel10 = new Medio("daniel10", 10, num(), num());
        Jogador daniel11 = new Medio("daniel11", 11, num(), num());
        Jogador daniel12 = new Medio("daniel12", 12, num(), num());
        Jogador daniel13 = new Medio("daniel13", 13, num(), num());
        Jogador daniel14 = new Medio("daniel14", 14, num(),num());
        Jogador daniel15 = new Avancado("Daniel15",15,num());
        Jogador daniel16 = new Avancado("Daniel16",16,num());
        Jogador daniel17 = new Avancado("Daniel17",17,num());

        benfica.adicionarJogador(daniel, liganos);
        benfica.adicionarJogador(daniel2, liganos);
        benfica.adicionarJogador(daniel3, liganos);
        benfica.adicionarJogador(daniel4, liganos);
        benfica.adicionarJogador(daniel5, liganos);
        benfica.adicionarJogador(daniel6, liganos);
        benfica.adicionarJogador(daniel7, liganos);
        benfica.adicionarJogador(daniel8, liganos);
        benfica.adicionarJogador(daniel9, liganos);
        benfica.adicionarJogador(daniel10, liganos);
        benfica.adicionarJogador(daniel11, liganos);
        benfica.adicionarJogador(daniel12, liganos);
        benfica.adicionarJogador(daniel13, liganos);
        benfica.adicionarJogador(daniel14, liganos);
        benfica.adicionarJogador(daniel15, liganos);
        benfica.adicionarJogador(daniel16, liganos);
        benfica.adicionarJogador(daniel17, liganos);

        Jogador francisco = new GuardaRedes("francisco", 1, num());
        Jogador francisco2 = new GuardaRedes("francisco2", 2, num());
        Jogador francisco3 = new GuardaRedes("francisco3", 3, num());
        Jogador francisco4 = new GuardaRedes("francisco4", 4, num());
        Jogador francisco5 = new Defesa("francisco5", 5, num(), num());
        Jogador francisco6 = new Defesa("francisco6", 6, num(), num());
        Jogador francisco7 = new Defesa("francisco7", 7, num(), num());
        Jogador francisco8 = new Defesa("francisco8", 8, num(), num());
        Jogador francisco9 = new Defesa("francisco9", 9, num(), num());
        Jogador francisco10 = new Medio("francisco10", 10, num(), num());
        Jogador francisco11 = new Medio("francisco11", 11, num(), num());
        Jogador francisco12 = new Medio("francisco12", 12, num(), num());
        Jogador francisco13 = new Medio("francisco13", 13, num(), num());
        Jogador francisco14 = new Medio("francisco14", 14, num(),	num());
        Jogador francisco15 = new Avancado("francisco15",15,num());
        Jogador francisco16 = new Avancado("francisco16",16,num());
        Jogador francisco17 = new Avancado("francisco17",17,num());

        porto.adicionarJogador(francisco, liganos);
        porto.adicionarJogador(francisco2, liganos);
        porto.adicionarJogador(francisco3, liganos);
        porto.adicionarJogador(francisco4, liganos);
        porto.adicionarJogador(francisco5, liganos);
        porto.adicionarJogador(francisco6, liganos);
        porto.adicionarJogador(francisco7, liganos);
        porto.adicionarJogador(francisco8, liganos);
        porto.adicionarJogador(francisco9, liganos);
        porto.adicionarJogador(francisco10, liganos);
        porto.adicionarJogador(francisco11, liganos);
        porto.adicionarJogador(francisco12, liganos);
        porto.adicionarJogador(francisco13, liganos);
        porto.adicionarJogador(francisco14, liganos);
        porto.adicionarJogador(francisco15, liganos);
        porto.adicionarJogador(francisco16, liganos);
        porto.adicionarJogador(francisco17, liganos);

        Jogador helder = new GuardaRedes("helder", 1, num());
        Jogador helder2 = new GuardaRedes("helder2", 2, num());
        Jogador helder3 = new GuardaRedes("helder3", 3, num());
        Jogador helder4 = new GuardaRedes("helder4", 4, num());
        Jogador helder5 = new Defesa("helder5", 5, num(), num());
        Jogador helder6 = new Defesa("helder6", 6, num(), num());
        Jogador helder7 = new Defesa("helder7", 7, num(), num());
        Jogador helder8 = new Defesa("helder8", 8, num(), num());
        Jogador helder9 = new Defesa("helder9", 9, num(), num());
        Jogador helder10 = new Medio("helder10", 10, num(), num());
        Jogador helder11 = new Medio("helder11", 11, num(), num());
        Jogador helder12 = new Medio("helder12", 12, num(), num());
        Jogador helder13 = new Medio("helder13", 13, num(), num());
        Jogador helder14 = new Medio("helder14", 14, num(),	num());
        Jogador helder15 = new Avancado("helder15",15,num());
        Jogador helder16 = new Avancado("helder16",16,num());
        Jogador helder17 = new Avancado("helder17",17,num());

        aves.adicionarJogador(helder, liganos);
        aves.adicionarJogador(helder2, liganos);
        aves.adicionarJogador(helder3, liganos);
        aves.adicionarJogador(helder4, liganos);
        aves.adicionarJogador(helder5, liganos);
        aves.adicionarJogador(helder6, liganos);
        aves.adicionarJogador(helder7, liganos);
        aves.adicionarJogador(helder8, liganos);
        aves.adicionarJogador(helder9, liganos);
        aves.adicionarJogador(helder10, liganos);
        aves.adicionarJogador(helder11, liganos);
        aves.adicionarJogador(helder12, liganos);
        aves.adicionarJogador(helder13, liganos);
        aves.adicionarJogador(helder14, liganos);
        aves.adicionarJogador(helder15, liganos);
        aves.adicionarJogador(helder16, liganos);
        aves.adicionarJogador(helder17, liganos);

        //sporting.imprimirJogadores();
        //porto.imprimirJogadores();

        Equipa equipaMaravilha = liganos.formarEquipaMaravilha(liganos);

        System.out.println(equipaMaravilha.getJogadores());
        equipaMaravilha.imprimirJogadores();

    }
    private static int num() {
        Random rd = new Random();
        return rd.nextInt(30);
    }
}
