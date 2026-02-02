public class Main {

/**
     * Prepara o estado inicial: instancia os dois Jogadores, gera os Decks de 40 cartas 
     * e garante que cada um comece com a mão inicial de 5 cartas.
     */
    public void iniciar_jogo() {
        // 1. Instanciar player e bot.
        // 2. Loop de 40 iterações para preencher o Deck com novas Cartas.
        // 3. Chamar puxar_carta 5 vezes para cada jogador iniciar.
    }

    /**
     * Verifica as condições de vitória (PV <= 0 ou Deck vazio) e limpa os 
     * objetos da memória ou reinicia o loop do bot.
     */
    public void encerrar_jogo() {
        // 1. Checar se algum jogador está com PV em 0.
        // 2. Exibir mensagem de vencedor/perdedor.
        // 3. Encerrar o loop principal da partida.
    }

    /**
     * Orquestra as fases: Compra automática até ter 5 cartas, exibe a mesa, 
     * recebe a escolha da carta da mão e executa a ação (Ataque/Defesa/Passar).
     */
    public void turno_jogador() {
        // 1. COMPRA: Enquanto j.mao.size() < 5, j.deck.puxar_carta(). Se retornar null, para.
        // 2. STATUS: Imprime PV e Cartas na Mesa (usando flag_modo para mostrar se está em ATK ou DEF).
        // 3. SELEÇÃO: O bot ou user escolhe um índice da ArrayList/Stack 'mao'.
        // 4. AÇÃO: 
        //    - Se ATK: Chama ataque_carta(alvo) comparando atributos e reduzindo PV.
        //    - Se DEF: Altera a flag_modo da carta para true.
        //    - Se PASSAR: Quebra o loop do turno atual.
    }
    public static void main(String[] args) {
        System.out.println("Reali eh gay");
    }
}
