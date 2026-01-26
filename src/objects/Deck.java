package objects;

import java.util.Stack;

public class Deck {
    private Stack<Carta> pilha_cartas;
    private final int tamanho_max = 40;

    public Deck() {
        pilha_cartas = new Stack<Carta>();

        for (int i = 0; i < tamanho_max; i++) {
            pilha_cartas.push(new Carta());
        }
    }

    public boolean esta_vazia() {
        return pilha_cartas.size() == 0;
    }

    public Carta puxar_carta() {
        if (esta_vazia()) {
            return null;
        }
        return pilha_cartas.pop();
    }

    public static void main(String[] args) {
        Deck a = new Deck();
        System.out.println(a.tamanho_max);
        System.out.println(a.pilha_cartas.peek());
        a.puxar_carta();
        a.puxar_carta();
        System.out.println(a.esta_vazia());
    }
}
