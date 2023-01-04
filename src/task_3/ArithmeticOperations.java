package task_3;

/*
 * Создать 4 метода для расчета суммы, разности, произведения и деления двух чисел.
 * Создать пятый метод, который принимает 3 параметра – два числа и знак операции.
 * На основании знака операции необходимо вызывать ранее созданный метод и получать результат операции.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticOperations {

    public static void main(String[] args) throws IOException {

        var reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число:");
        double number1 = Double.parseDouble(reader.readLine());
        System.out.println("Введите второе число:");
        double number2 = Double.parseDouble(reader.readLine());
        System.out.println("Что вы хотите сделать? Выберите из: +, -, *, /");
        String operator = reader.readLine();

        operation(number1, number2, operator);
    }

    public static void plus(double number1, double number2) {
        double total = number1 + number2;
        System.out.printf(number1 + " + " + number2 + " = " + "%.3f", total);
    }

    public static void minus(double number1, double number2) {
        double total = number1 - number2;
        System.out.printf(number1 + " - " + number2 + " = " + "%.3f", total);
    }

    public static void multiplication(double number1, double number2) {
        double total = number1 * number2;
        System.out.printf(number1 + " * " + number2 + " = " + "%.3f", total);
    }

    public static void division(double number1, double number2) {
        double total = number1 / number2;
        System.out.printf(number1 + " / " + number2 + " = " + "%.3f", total);
    }

    public static void operation(double number1, double number2, String symbol) {
        switch (symbol) {
            case "+":
                plus(number1, number2);
                break;
            case "-":
                minus(number1, number2);
                break;
            case "*":
                multiplication(number1, number2);
                break;
            case "/":
                division(number1, number2);
                break;
        }
    }
}
