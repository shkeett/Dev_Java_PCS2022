package task_1;

/*
 * Cпросить у пользователя год рождения и вывести информацию о его возрасте
 * в текущем году, а также выведите информацию сколько ему осталось работать
 * до пенсии. Считаем, что пенсионный возраст: 65. В Internet найдите информацию
 * для получения текущего года через специальный метод в Java. Если конструкцию
 * для получения года не найдете, используйте явно 2022
 */

import javax.swing.*;
import java.time.LocalDate;

public class YearOfBirth {
    public static void main(String[] args) {

        int year = Integer.parseInt(JOptionPane.showInputDialog("В каком году вы родились?"));
        int yearNow = LocalDate.now().getYear();
        System.out.println(yearNow);
        int age = yearNow - year;
        System.out.println(age);
        if (age >= 65) {
            JOptionPane.showMessageDialog(null, "Вам, " + age + " лет(года) в текущем году" +
                    " . Вы на пенсии!");
        } else {
            int yearWork = 65 - age;
            JOptionPane.showMessageDialog(null, "Вам, " + age + " лет(года) в текущем году" +
                    " . Вам осталось " + yearWork + " лет(года) до пенсии!");
        }
    }
}
