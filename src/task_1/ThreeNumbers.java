package task_1;

/**
 * Даны три числа. Увеличьте первое число в два раза, второе число уменьшите
 * на 3, третье число возведите в квадрат и затем найдите сумму новых трех чисел.
 */

public class ThreeNumbers {

    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c = -15;

        a = a * 2;
        b = b - 3;
        c = (int) Math.pow(c, 2);

        System.out.println(a + b + c);

    }
}
