package task_3;

/*
 * Создать метод, который принимает имя и возраст.
 * Вернуть строковую информацию об имени и годе рождения.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Information {

    public static void main(String[] args) throws IOException {

        var reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ваше имя:");
        String name = reader.readLine();
        System.out.println("Сколько вам исполнится в " + LocalDate.now().getYear() + " году?");
        int age = Integer.parseInt(reader.readLine());
        System.out.println(age);

        nameAndAge(name, age);
    }

    public static void nameAndAge(String name, int age) {
        int nowYear = LocalDate.now().getYear();
        int yearOfBirth = nowYear - age;
        System.out.println("Привет " + name + ", год вашего рождения " + yearOfBirth);
    }
}
