package objects;
import repositorio.Tipos_elementos;
import util.Randomizador;
import util.Sorteado;
public class Carta {
    private int ataque;
    private int defesa;
    private String nome;
    private String tipo;
    private String elemento;
    private String lista_randomizador;



    public Carta() {
        int numero_randomizado_p_nome =  Randomizador.randomizador("5");
        int numero_randomizado_s_nome =  Randomizador.randomizador("4");
        this.nome = Sorteado.sorteado(Tipos_elementos.p_nome, numero_randomizado_p_nome) + " " +
                    Sorteado.sorteado(Tipos_elementos.s_nome, numero_randomizado_s_nome);

        int numero_randomizado_tipo =  Randomizador.randomizador("2");
        this.tipo = Sorteado.sorteado(Tipos_elementos.tipo, numero_randomizado_tipo);

        int numero_randomizado_elemento =  Randomizador.randomizador("2");
        this.elemento = Sorteado.sorteado(Tipos_elementos.elemento, numero_randomizado_elemento);

        this.ataque = Randomizador.randomizador("3000");
        this.defesa = Randomizador.randomizador("3000");
    }


    public static void main(String[] args) {
        System.out.println("Gerando uma carta...");
        Carta carta = new Carta();
        System.out.println("Carta criada: " + carta.nome + " com ataque " + carta.ataque + " e defesa " + carta.defesa + " do tipo " + carta.tipo + " do elemento " + carta.elemento);
    }
}