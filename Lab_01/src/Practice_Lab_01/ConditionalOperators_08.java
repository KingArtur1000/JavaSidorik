package Practice_Lab_01;

import java.util.Scanner;

public class ConditionalOperators_08 {
    public static void main(String[] args) {
        int x = 3;
        int y;

        if (x > 0)
            y = 1;
        else
            y = -1;
        System.out.println("Первый вариант " + "x = " + x + " y = " + y);

        y = (x > 0) ? 1 : -1;
        System.out.println("Второй вариант " + "x = " + x + " y = " + y);

        int number = 17;
        System.out.println(number % 2 == 0 ? "число четное" : "число нечетное");

        double num1 = 7.89;
        double num2 = 12.45;
        double max = (num1 > num2) ? num1 : num2;
        System.out.println("Наибольшее из двух чисел равно " + max);

        // Дополнительное задание: выбор минимального из двух чисел с консоли
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double first = input.nextDouble();
        System.out.print("Введите второе число: ");
        double second = input.nextDouble();

        double min = (first < second) ? first : second;
        System.out.println("Минимальное из введенных чисел: " + min);

        input.close();
    }
}