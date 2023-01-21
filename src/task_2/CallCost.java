package task_2;


/**
деления стоимости разговора по телефону с учетом
 * предоставляемой по субботам и воскресеньям скидки 20%, предоставляемой
 * по субботам и воскресеньям скидки
 */

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CallCost {

    public static void main(String[] args) {

        double price = 100.0;
        DayOfWeek ld = LocalDate.now().getDayOfWeek();

        if (ld == DayOfWeek.SATURDAY || ld == DayOfWeek.SUNDAY) {
            price = price - price * 0.2;
            System.out.println("Сегодня выходной день.\nЦена разговора с учетом скидки 20% = " + price + " руб.");
        } else
            System.out.println("Сегодня будничный день.\nЦена разговора = " + price + " руб.");
    }
}
