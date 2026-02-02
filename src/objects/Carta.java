package objects;
import repositorio.Tipos_elementos;
import util.Randomizador;
import util.Sorteador;
public class Carta {
    private int ataque;
    private int defesa;
    private String nome;
    private String tipo;
    private String elemento;
    private String lista_randomizador;
    private boolean flag_modo;
    public Carta() {
        this.nome = Sorteador.sortear(Tipos_elementos.p_nome, Tipos_elementos.p_nome.size() - 1) + " " +
                    Sorteador.sortear(Tipos_elementos.s_nome, Tipos_elementos.s_nome.size() - 1);

        this.tipo = Sorteador.sortear(Tipos_elementos.tipo, Tipos_elementos.tipo.size() - 1);

        this.elemento = Sorteador.sortear(Tipos_elementos.elemento, Tipos_elementos.elemento.size() - 1);
        this.flag_modo = false;
        this.ataque = Randomizador.randomizar(3000);
        this.defesa = Randomizador.randomizar(3000);
    }

    public void ataque_carta(Carta atacada, Carta atacante, Jogador atacante_jogador, Jogador atacada_jogador){
        if(atacada.flag_modo == false && atacante.ataque > atacada.ataque){
            atacada_jogador.perder_pv(atacante.ataque - atacada.ataque);
            atacada_jogador.deck.destruir_carta(atacada);

            
        }
        else if (atacada.flag_modo == true && atacante.ataque > atacada.defesa){
            atacada_jogador.perder_pv(atacante.ataque - atacada.defesa);
            atacada_jogador.deck.destruir_carta(atacada);
        }
        else if (atacada.flag_modo == false && atacante.ataque < atacada.ataque){

            atacante_jogador.perder_pv(atacada.ataque - atacante.ataque);
            atacante_jogador.deck.destruir_carta(atacante);
        }
        else if (atacada.flag_modo == true && atacante.ataque < atacada.defesa){
            // causar dano ao jogador atacante
            atacante_jogador.perder_pv(atacada.defesa - atacante.ataque);
            //aqui nao acontece a destruição de cartas
        }
        else {
            //empate, ambas as cartas sao destruídas
            
        }

    }

    public void efeito(){
        //TO DO
        //Criar os efeitos das cartas
    }

    @Override
    public String toString(){
        return this.nome + " (ataque: " + this.ataque + ", defesa: " + this.defesa + ")"; 
    }

    public static void main(String[] args) {
        Carta carta1 = new Carta();
        System.out.println(carta1);
        Carta carta2 = new Carta();
        System.out.println(carta2);
        System.out.println(carta2);
    }
}