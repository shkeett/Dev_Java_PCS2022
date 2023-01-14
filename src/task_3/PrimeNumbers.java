package task_3;

/*
 *Вывести все простые числа от 2 до 100
 */

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        System.out.println("Введите целое положительное число");
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int count = 0;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        }
        boolean bool = true;
        for (int i = 2; i < number; i++) {
            for (int j = 2; j < i / Math.pow(i, 0.5); j++) {
                if (i % j == 0) {
                    bool = false;
                    break;
                }
            }
            if (bool) {
                System.out.print(i + "; ");
                count++;
            } else {
                bool = true;
            }
        }
        System.out.println("\n" + count);
        scanner.close();
    }
}