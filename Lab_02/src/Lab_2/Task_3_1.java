package Lab_2;

import java.util.Scanner;

/**
 * @author A.A. Dmitriev
 * @version 1.0 17.09.2025
 */
public class Task_3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ввод дня и месяца рождения
        System.out.print("Введите день рождения: ");
        int day = input.nextInt();

        System.out.print("Введите месяц рождения: ");
        int month = input.nextInt();

        int data;
        int sum = 0;

        // Вводим данные пока не 0
        do {
            System.out.print("Вводите целое значение (выход, если 0): ");
            data = input.nextInt();

            // Если число не совпадает с днём или месяцем рождения — суммируем
            if (data != day && data != month && data != 0) {
                sum += data;
            } else if (data == day || data == month) {
                System.out.println("Число совпадает с днём или месяцем рождения — пропускаем.");
            }

        } while (data != 0);

        System.out.println("Сумма введённых чисел (без дня и месяца рождения) = " + sum);
    }
}
