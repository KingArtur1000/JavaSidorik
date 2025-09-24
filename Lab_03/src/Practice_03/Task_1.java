package Practice_03;

import java.util.Scanner;

/**
 * Демонстрация передачи параметров по значению в Java.
 * Пользователь вводит число, метод increment увеличивает его копию.
 * Оригинальное значение в main остаётся неизменным.
 *
 * @author A.A. Dmitriev
 * @version 1.0
 */
public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = sc.nextInt();

        System.out.println("Before the call, n is " + n);
        increment(n);
        System.out.println("After the call, n is " + n);
    }

    public static void increment(int n) {
        ++n; // префиксная форма
        System.out.println("n inside the method is " + n);
    }
}
