package objects;

import java.util.Stack;

public class Deck {
    private Stack<Carta> pilha_cartas;
    private final int tamanho_max = 40;
    private final int tamanho_inicial_mao = 5;
    private Stack<Carta> mao;
    public Deck() {
        pilha_cartas = new Stack<Carta>();
        mao = new Stack<Carta>();
        for (int i = 0; i < tamanho_max; i++) {
            pilha_cartas.push(new Carta());
        }
        for (int j = 0; j < tamanho_inicial_mao; j++) {
            mao.push(puxar_carta());
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
    public void destruir_carta(Carta carta) {
      mao.remove(carta);
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
