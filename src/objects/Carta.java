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

    public Carta() {
        this.nome = Sorteador.sortear(Tipos_elementos.p_nome, Tipos_elementos.p_nome.size() - 1) + " " +
                    Sorteador.sortear(Tipos_elementos.s_nome, Tipos_elementos.s_nome.size() - 1);

        this.tipo = Sorteador.sortear(Tipos_elementos.tipo, Tipos_elementos.tipo.size() - 1);

        this.elemento = Sorteador.sortear(Tipos_elementos.elemento, Tipos_elementos.elemento.size() - 1);

        this.ataque = Randomizador.randomizar(3000);
        this.defesa = Randomizador.randomizar(3000);
    }

    /**
     * Método para uma carta conseguir calcular o dano para outra carta
     * @param vitima
     * Carta a ser atingida
     * @return Se a vítima teve sua defesa destuída ou não
     */
    public boolean calcular_dano(Carta vitima) {
        //TO DO
        // Implementar o sistema de vantagem por elemento e tipo
        vitima.defesa -= this.ataque;
        return vitima.defesa > 0;
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
        carta1.calcular_dano(carta2);
        System.out.println(carta2);
    }
}