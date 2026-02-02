package objects;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner; 

public class Jogador {
    private List<Carta> mao;
    public Deck deck;
    private String nome;
    private int pv;

    public Jogador(String nome) {
        this.nome = nome;
        this.deck = new Deck();
        this.pv = 8000;
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

    public void perder_pv(int dano) {
        this.pv -= dano;
        if (this.pv < 0) {
            this.pv = 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira seu nome:\t");
        String nome = scanner.nextLine();
        Jogador a = new Jogador(nome);
        System.out.println(a);

    }
}
