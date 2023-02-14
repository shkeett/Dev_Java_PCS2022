package task_8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CollectionCarNumbers {

    public static final int CAPASITY = 100_000;
    static String[] letters = new String[]{"A", "B", "E", "K", "M", "H", "O", "P", "C", "T", "Y", "X"};
    static int[] numbers = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    static String[] firstNames = new String[]{"Иван", "Петр", "Александр", "Михаил", "Степан", "Константин", "Кирил", "Андрей"};
    static String[] lastNames = new String[]{"Коротков", "Черницын", "Краснов", "Белов", "Коржов", "Валов", "Умнов", "Стартов"};

    Map<String, String> cars = new HashMap<>(CAPASITY);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CollectionCarNumbers that = (CollectionCarNumbers) o;
        return Objects.equals(cars, that.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }

    public void createNumber() {

        for (int i = 0; i < CAPASITY-1; i++) {
            String letterOne = letters[(int) (Math.random() * ((letters.length) - 1) + 1)];
            String letterTwo = letters[(int) (Math.random() * ((letters.length) - 1) + 1)];
            String letterThree = letters[(int) (Math.random() * ((letters.length) - 1) + 1)];
            String numberOne = numbers[(int) (Math.random() * ((numbers.length) - 1) + 1)] + "";
            String numberTwo = numbers[(int) (Math.random() * ((numbers.length) - 1) + 1)] + "";
            String numberThree = numbers[(int) (Math.random() * ((numbers.length) - 1) + 1)] + "";
            String numberRegionOne = numbers[(int) (Math.random() * ((numbers.length) - 1) + 1)] + "";
            String numberRegionTwo = numbers[(int) (Math.random() * ((numbers.length) - 1) + 1)] + "";
            String numberRegionThree = numbers[(int) (Math.random() * ((numbers.length) - 1) + 1)] + "";
            String name = firstNames[(int) (Math.random() * ((firstNames.length) - 1) + 1)];
            String surname = lastNames[(int) (Math.random() * ((lastNames.length) - 1) + 1)];

            String numberCar = letterOne + numberOne + numberTwo + numberThree + letterTwo + letterThree
                    + numberRegionOne + numberRegionTwo + numberRegionThree;
            String driver = name + " " + surname;

            cars.put(numberCar, driver);
        }
        cars.put("A888AA77", "Frank Galagher");
    }

    public void getAllNumbers() {
        int count = 1;
        for (Map.Entry<String, String> entry : cars.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(count + ") " + key + " - " + value);
            count++;
        }
    }

    public void getDriver() {
        try {
            var reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Для поиска владельца введите номер автомобиля в формате x000xx000");
            String number = reader.readLine();
            if (cars.containsKey(number.toUpperCase())) {
                System.out.println("Владелец автомобиля с номером " + number + " " + cars.get(number));
            } else {
                System.out.println("Авто не найдено");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}