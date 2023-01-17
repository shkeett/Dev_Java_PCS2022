package task_2;

/**
 * Написать программу сравнения двух  случайных чисел. В результате должна
 * содержаться информация – насколько одно число больше другого. Используйте модуль числа
 */

public class RandomNumbers {
    public static void main(String[] args) {

        int a = (int) (Math.random() * (1000 - (-1000)) - 1000);
        int b = (int) (Math.random() * (1000 - (-1000)) - 1000);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        if (a > b) {
            System.out.println("a > b на " + Math.abs(a - b));
        } else if (a < b) {
            System.out.println("a < b на " + Math.abs(b - a));
        } else
            System.out.println("a = b = " + a);
    }
}
