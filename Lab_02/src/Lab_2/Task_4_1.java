package Lab_2;

import java.util.Scanner;

/**
 * while - оператор цикла
 * Задача: вычислить сумму нечётных целых чисел от xMin до xMax,
 * где xMin и xMax — день и месяц рождения пользователя.
 * Если значения совпадают, одно из них умножается на 10 для увеличения диапазона.
 * Результат, а также xMin и xMax выводятся на печать.
 *
 * @author A.A. Dmitriev
 * @version 1.0 18.09.2025
 */
public class Task_4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ввод дня и месяца рождения
        System.out.print("Введите день рождения: ");
        int xMin = input.nextInt();

        System.out.print("Введите месяц рождения: ");
        int xMax = input.nextInt();

        // Если одинаковые — умножаем одно из чисел на 10
        if (xMin == xMax) {
            xMax *= 10;
        }

        // Обеспечим, чтобы xMin был меньше xMax
        if (xMin > xMax) {
            int temp = xMin;
            xMin = xMax;
            xMax = temp;
        }

        int sum = 0;
        int i = xMin;

        // Цикл while для суммирования нечётных чисел
        while (i <= xMax) {
            if (i % 2 != 0) { // проверка на нечётность
                sum += i;
            }
            i++;
        }

        // Вывод результата
        System.out.println("xMin = " + xMin);
        System.out.println("xMax = " + xMax);
        System.out.println("Сумма нечётных чисел = " + sum);
    }
}
