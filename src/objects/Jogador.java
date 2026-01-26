package objects;

import java.util.List;
import java.util.ArrayList;

public class Jogador {
    private List<Carta> mao;
    private Deck deck;
    private String nome;
    private int pv;

    public Jogador(String nome) {
        this.nome = nome;
        this.deck = new Deck();
        this.pv = 10000;
        this.mao = new ArrayList<Carta>();
        for (int i = 0; i < 5; i++) {
            this.mao.add(deck.puxar_carta());
        }
    }

    @Override
    public String toString() {
        return nome + " \nPonto de vida: " + pv + "\n[" + mao.get(0) + ", " + mao.get(1) + ", " + mao.get(2) + ", " + 
        mao.get(3) + ", " + mao.get(4) + "]";
    }

    public static void main(String[] args) {
        Jogador a = new Jogador("Leo");
        System.out.println(a);

    }
}
