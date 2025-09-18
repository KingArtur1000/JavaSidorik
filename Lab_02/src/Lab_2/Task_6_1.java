package Lab_2;

import java.util.Scanner;

/**
 * Оператор continue не прерывает цикл, а пропускает выполнение оставшейся части тела цикла
 * для текущей итерации, переходя к следующей.
 * Задача: суммировать числа от 1 до заданного предела, пропуская те,
 * которые совпадают с днём или месяцем рождения пользователя.
 *
 * @author V.V. Sidorik && A.A. Dmitriev
 * @version 1.0 18.09.2025
 */
public class Task_6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ввод дня и месяца рождения
        System.out.print("Введите день рождения: ");
        int day = input.nextInt();

        System.out.print("Введите месяц рождения: ");
        int month = input.nextInt();

        // Условие завершения цикла — произвольный максимум для демонстрации
        int maxNumber = (day + month) * 2;

        int sum = 0;
        int number = 0;

        while (number < maxNumber) {
            number++;

            // Пропускаем числа, совпадающие с днём или месяцем рождения
            if (number == day || number == month) {
                continue; // переход к следующей итерации
            }

            sum += number;
            System.out.println("number = " + number + " sum = " + sum);
        }

        System.out.println("The sum is " + sum);
    }
}
