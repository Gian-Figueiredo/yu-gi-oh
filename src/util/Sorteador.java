package util;

import java.util.List;

public class Sorteador {

   public static String sortear(List<String> lista_randomizador, int range_max) {
        int indice = Randomizador.randomizador(range_max);
        return lista_randomizador.get(indice);
    }

    public static void main(String[] args) {
        System.out.println("Reali eh gay");
    }
}