package task_2;


 * Объявить две целочисленные переменные «a» и «b» и задать им произвольные начальные значения.
 * Затем написать скрипт, который работает по следующему принципу:
 *  если “a” и “b” положительные, вывести их разность;
 *  если “a” и “b” отрицательные, вывести их произведение;
 *  если “a” и “b” разных знаков, вывести их сумму;
 */

import java.util.Scanner;

public class TwoNumbers {

    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое целочисленное число");

        if (sc.hasNextInt()) {
            a = sc.nextInt();
        } else {
            System.out.println("Вы ввели не целочисленное число!!!");
        }
        System.out.println("Введите второе целочисленное число");
        if (sc.hasNextInt()) {
            b = sc.nextInt();
        } else {
            System.out.println("Вы ввели не целочисленное число!!!");
        }
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        if (a >= 0 && b >= 0) {
            System.out.println("а и b положительные.\nРазность чисел a и b равна: " + Math.abs(a - b));
        } else if (a < 0 && b < 0) {
            System.out.println("а и b отрицательные.\nПроизведение чисел a и b равна: " + (a * b));
        } else {
            System.out.println("a и b разных знаков.\nСумма чисел a и b равна: " + (a + b));
        }
        sc.close();
    }


}
