package task_4;

/**
 *
 * Вывести матрицу, изображенную ниже в консоль
 * 0  0  0  0  0
 * 0  1  2  3  4
 * 0  2  4  6  8
 * 0  3  6  9  12
 * 0  4  8  12 16
 */

public class Matrix {

    public static void main(String[] args) {
        int size = 5;
        int[][] massive = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                massive[i][j] = i * j;
                System.out.print(massive[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
