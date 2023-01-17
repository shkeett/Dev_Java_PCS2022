package task_4;

/**
 * Написать программу, которая вычисляет сумму двумерного массива по строкам.
 * Написать программу, которая вычисляет сумму двумерного массива по столбцам.
 */

public class SumMatrix {
    public static void main(String[] args) {

        final int size = 5;
        int summaLine = 0;
        int summaColumn = 0;
        int[][] massive = new int[size + 1][size + 1];

        // Заполнение массива size рандомными числами

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                massive[i][j] = (int) (Math.random() * 10);
            }
            System.out.println();
        }

        //Подсчет суммы в строке и столбце

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                summaLine += massive[i][j];
                summaColumn+=massive[j][i];
            }
            massive[i][size]=summaLine;
            summaLine=0;
            massive[size][i]=summaColumn;
            summaColumn=0;
        }

        //вывод массива на экран c суммой по строкам и столбцам

        for (int i = 0; i < size+1; i++) {
            for (int j = 0; j < size+1; j++) {
                System.out.print(massive[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
