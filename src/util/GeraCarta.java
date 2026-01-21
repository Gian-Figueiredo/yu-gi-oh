package util;
import repositorio.tipos_elementos;
import util.randomizador;
import util.sorteado;
public class GeraCarta {
    private int ataque;
    private int defesa;
    private String nome;
    private String tipo;
    private String elemento;
    private String lista_randomizador;



    public GeraCarta() {
        int numero_randomizado_p_nome =  randomizador.randomizador("5");
        int numero_randomizado_s_nome =  randomizador.randomizador("4");
        this.nome = sorteado.sorteado(tipos_elementos.p_nome, numero_randomizado_p_nome) + " " +
                    sorteado.sorteado(tipos_elementos.s_nome, numero_randomizado_s_nome);

        int numero_randomizado_tipo =  randomizador.randomizador("2");
        this.tipo = sorteado.sorteado(tipos_elementos.tipo, numero_randomizado_tipo);

        int numero_randomizado_elemento =  randomizador.randomizador("2");
        this.elemento = sorteado.sorteado(tipos_elementos.elemento, numero_randomizado_elemento);

        this.ataque = randomizador.randomizador("3000");
        this.defesa = randomizador.randomizador("3000");
    }


    public static void main(String[] args) {
        System.out.println("Gerando uma carta...");
        GeraCarta carta = new GeraCarta();
        System.out.println("Carta criada: " + carta.nome + " com ataque " + carta.ataque + " e defesa " + carta.defesa + " do tipo " + carta.tipo + " do elemento " + carta.elemento);
    }
}