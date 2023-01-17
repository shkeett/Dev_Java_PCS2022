package task_4;

import java.util.Arrays;

/**
 * Создать метод, который создает и возвращает массив случайных целых чисел.
 * Найти среднее арифметическое полученного массива.
 * Можно среднее арифметическое в теле метода main.
 */

public class ArrayRandomIntegerNumbers {

    public static int number = 4;

    public static void main(String[] args) {

        System.out.println(average(createArray(number)));
    }

    // Создание массива
    public static int[] createArray(int index) {

        int[] array = new int[index];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (100 - (-100)) - 100);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    //Расчет среднего арифметического в массиве
    public static double average(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.print("Среднее арифметическое = ");
        return sum / array.length;
    }

}
