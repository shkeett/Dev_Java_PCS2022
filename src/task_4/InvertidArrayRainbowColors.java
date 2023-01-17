package task_4;

import java.util.Arrays;

/**
 * Перевернуть массив, который содержит названия цветов радуги.
 * То есть первый элемент должен стать последним второй – предпоследним.
 */

public class InvertidArrayRainbowColors {

    static String[] arrayRainbowColors = {
            "КРАСНЫЙ", "ОРАНЖЕВЫЙ", "ЖЕЛТЫЙ", "ЗЕЛЕНЫЙ", "ГОЛУБОЙ", "СИНИЙ", "ФИОЛЕТОВЫЙ"};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayRainbowColors)); //Вывод массива до разворота
        InvertidArrayRainbowColors.reversArray(arrayRainbowColors);
        System.out.println("---------------------------------------------------------------------");
        System.out.println(Arrays.toString(arrayRainbowColors)); //Вывод массива после разворота

    }

    //Разворот массива
    public static String[] reversArray(String[] array) {
        String[] reverseArray = new String[array.length];
        int index = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[index] = array[i];
            index++;
        }
        return arrayRainbowColors=reverseArray;
    }
}
