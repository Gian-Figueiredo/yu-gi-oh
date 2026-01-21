package util;
public class Randomizador {

    public static int randomizador (String range_max) {
        int range_min = 0;
        int range_max_int = Integer.parseInt(range_max);
        int randomInt = (int)(Math.random() * (range_max_int - (range_min) + 1) + range_min);
        return randomInt;
    }

}