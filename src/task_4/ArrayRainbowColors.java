package task_4;

/**
 * Вывести массив, состоящий из цветов радуги в обратном порядке.
 */

public class ArrayRainbowColors {

    static String[] arrayRainbowColors = {
            "КРАСНЫЙ", "ОРАНЖЕВЫЙ", "ЖЕЛТЫЙ", "ЗЕЛЕНЫЙ", "ГОЛУБОЙ", "СИНИЙ", "ФИОЛЕТОВЫЙ"};

    public static void main(String[] args) {
        for (int i = arrayRainbowColors.length-1; i >=0 ; i--) {
            System.out.println(arrayRainbowColors[i]);
        }
    }
}
