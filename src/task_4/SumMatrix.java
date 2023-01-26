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


//          Решение преподователя

//        int tablePif[][] = new int[6][6];
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                tablePif[i][j]=i*j;
//                tablePif[i][5]+=tablePif[i][j];
//                tablePif[5][j]+=tablePif[i][j];
//                System.out.print(tablePif[i][j]+"\t");
//            }
//            System.out.println(tablePif[i][5]);
//        }
//        for (int j = 0; j < 5; j++) {
//            System.out.println(tablePif[5][j] + "\t");
//        }
    }
}
