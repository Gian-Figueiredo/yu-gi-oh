package util;
public class Randomizador {

    /**
     * Função geradora de um inteiro aleatório
     * @param range_max
     * @return Retorna um inteiro entre [0, range_max]
     */
    public static int randomizar (double range_max) {
        int range_min = 0;
        int range_max_int = (int)range_max;
        int randomInt = (int)(Math.random() * (range_max_int - (range_min) + 1) + range_min);
        return randomInt;
    }

    /**
     * Função geradora de um inteiro aleatório
     * @param range_min
     * @param range_max
     * @return Retorna um inteiro entre [range_min, range_max]
     */
    public static int randomizar (double range_min, double range_max) {
        int range_min_int = (int)range_min;
        int range_max_int = (int)range_max;
        int randomInt = (int)(Math.random() * (range_max_int - (range_min_int) + 1) + range_min_int);
        return randomInt;
    }

    public static void main(String[] args) {
        System.out.println(randomizar(20, 1));
    }
}