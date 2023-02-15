package task_9.college;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Сделать коллекцию студентов. Она характеризуется ФИО и средним баллом.
 * При вводе в консоль слова LIST должна выводиться информация о всех студентах и их средней оценке.
 * При вводе команды Sort необходимо спрашивать: ”По какому полю требуется сортировка”.
 * При вводе FIO – сортируем по ФИО.
 * При вводе “GRADE” – сортируем по среднему баллу.
 */

public class College {

    public static void main(String[] args) throws IOException {
        List<Student> studentsList = new ArrayList<>();

        Collections.addAll(studentsList,
                new Student("Коротков Иван Петрович", 4.82),
                new Student("Краснов Денис Александрович", 3.45),
                new Student("Жарков Степан Михайлович", 4.72),
                new Student("Цветков Дмитрий Николаевич", 4.4),
                new Student("Смирнов Виталий Викторович", 3.88),
                new Student("Амосов Сергей Андреевич", 3.85));

        System.out.println("Введите LIST для вывода информация о всех студентах и их средней оценке");
        System.out.println("Введите SORT для сортировки");


        var reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String command = reader.readLine();

            if (command != null && command.equalsIgnoreCase("LIST")) {
                for (Student student : studentsList) {
                    System.out.println("Студент \t" + student.getFio() + "\t Средний балл = " + student.getAverageRating());
                }
            } else if (command != null && command.equalsIgnoreCase("SORT")) {
                var reader2 = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Введите FIO если сортируем по ФИО");
                System.out.println("Введите GRADE если сортируем по среднему баллу");
                try {
                    String commandSort = reader2.readLine();

                    if (commandSort != null && commandSort.equalsIgnoreCase("FIO")) {
                        Collections.sort(studentsList, new FIOComparator());
                        System.out.println("Студенты отсортированы по ФИО:");
                        System.out.println("----------------------------------------------------------------------");
                        for (Student student : studentsList) {
                            System.out.println("Студент \t" + student.getFio() + "\t Средний балл = " + student.getAverageRating());
                        }
                    } else if (commandSort != null && commandSort.equalsIgnoreCase("GRADE")) {
                        Collections.sort(studentsList, new RatingComparator());
                        System.out.println("Студенты отсортированы по среднему баллу:");
                        System.out.println("----------------------------------------------------------------------");
                        for (Student student : studentsList) {
                            System.out.println("Студент \t" + student.getFio() + "\t Средний балл = " + student.getAverageRating());
                        }
                    } else {
                        System.out.println("Вы ввели неверную команду");
                    }

                } catch (IOException ex) {
                    System.out.println("I/O Exception");
                } finally {
                    reader2.close();
                }
            } else {
                System.out.println("Вы ввели неверную команду");
            }
        } catch (IOException ex) {
            System.out.println("I/O Exception");
        } finally {
            reader.close();
        }
    }
}