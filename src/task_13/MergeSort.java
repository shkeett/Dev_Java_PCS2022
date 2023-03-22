package task_13;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Найти в Internet алгоритм быстрой сортировки [O(N*logN)] и прокомментировать каждую инструкцию данного алгоритма.
 * Сортировка слиянием [O(N*logN)]
 */

public class MergeSort {

    public static void mergeSort(int[] a, int n) {   // Принимает входящий массив "a" и его длинну "n"

        if (n < 2) {                                 //Если длинна меньше 2 возвращаемся без сортировки
            return;
        }
        int mid = n / 2;                             //Узнаем длинну нового массива равную половине длинны нашего массива
        int[] l = new int[mid];                      //Создаем новый массив Левый длинной половине входящего массива
        int[] r = new int[n - mid];                  //Создаем правый массив Правый длинною входящий массив минус длинна Левого

        for (int i = 0; i < mid; i++) {              //Заполняем Левый массив значениями из Входящего массива
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {              //Заполняем Правый массив значениями оставшимися из Входящего массива
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);                           //Делаем рекурсию. Делим Левый массив на 2 половинки по аналогии выше
                                                     //делим пока не останется по 1 элементу (слева и справа)
        mergeSort(r, n - mid);                    //Делаем рекурсию. Делим Правый массив на 2 половинки по аналогии

        merge(a, l, r, mid, n - mid);           //Соединяем массив рекурсивно (вызываем метод merge)
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {   //Собираем массив из подмассивов

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {               //Пробегаем циклом
            if (l[i] <= r[j]) {                       //Проверяем если левый элемент меньше или = правому тогда в массив
                a[k++] = l[i++];                      // "а" вставляем левый
            } else {
                a[k++] = r[j++];                      // иначе правый
            }
        }
        while (i < left) {                            //Если закончились элементы одного подмассива (правого) копируем
            a[k++] = l[i++];                          //оставшиеся элементы левого подмассива
        }
        while (j < right) {                           //аналогично только с (левым) подмассивом
            a[k++] = r[j++];
        }
    }

    @Test
    public void positiveTest() {
        int[] actual = {5, 1, 6, 2, 3, 4, 8, 7, 9, 11, 12, 10};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        MergeSort.mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual);
    }

}
