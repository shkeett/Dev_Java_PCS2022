package task_3;

/*
 * Вывести в консоль 20 строк вида, используя цикл
 * #
 * ##
 * ###
 * ####
 */

import java.util.Scanner;

public class TwentyLines {

    public static void main(String[] args) {

        System.out.println("Введите целое положительное число строк");
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        }

        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        scanner.close();

    }
}
