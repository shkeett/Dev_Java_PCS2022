package task_3;

/*
 * Создать 4 метода для расчета суммы, разности, произведения и деления двух чисел.
 * Создать пятый метод, который принимает 3 параметра – два числа и знак операции.
 * На основании знака операции необходимо вызывать ранее созданный метод и получать результат операции.
 */

public class ArithmeticOperations {

    public static void main(String[] args) {

        operation(2.58, 6.48, "+");
        System.out.println();
        operation(2.58, 6.48, "-");
        System.out.println();
        operation(2.58, 6.48, "*");
        System.out.println();
        operation(2.58, 6.48, "/");
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
