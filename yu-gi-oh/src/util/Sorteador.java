package util;

import java.util.List;

public class Sorteador {

    /**
     * Função que dada uma lista de Strings sorteia um item da substring de 0 até range_max
     * @param lista_randomizador
     * @param range_max
     * @return Retorna uma String da lista passada cujo indice seja maior ou igual a 0 e menor ou igual a range_max
     */
   public static String sortear(List<String> lista_randomizador, int range_max) {
        int indice = Randomizador.randomizar(range_max);
        return lista_randomizador.get(indice);
    }

    public static void main(String[] args) {
        List<String> a = List.of("reali eh gay", "felip eh gay", "leo eh gay", "Gian é gay");
        System.out.println(Sorteador.sortear(a, a.size() - 1));
    }
}