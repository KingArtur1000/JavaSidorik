package Lab_2;

import java.util.Scanner;

/**
 * for - цикл на примерах
 * Example 2 - цикл контролируется по двум переменным !!!
 *
 * @author V.V. Sidorik && A.A. Dmitriev
 * @version 1.0 17.09.2025
 */
public class Task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Example 1
        // Initialize sum
        float sum = 0;
        // Add 0.01, 0.02, ..., 0.99, 1 to sum
        for (float x = 0.01f; x <= 1.0f; x = x + 0.01f)
            sum += x;
        // Display result
        System.out.println("The sum is " + sum);

        // Example 2
        // в примере контролируется цикл по двум переменным !!!
        for (int i = 0, j = 3; (i + j < 10); i++, j++) {
            System.out.println("\nТекущие значения i = " + i + " j = " + j);
            System.out.println("\tСумма i + j = " + (i + j));
        }

        // --- Дополнено: самостоятельное задание ---
        // Сумма целых чисел, делящихся на (день + месяц) без остатка
        // по двум переменным одновременно: от 0 до 100 и от 200 до 500.
        System.out.println("\nВведите день рождения:");
        int day = input.nextInt();

        System.out.println("Введите месяц рождения:");
        int month = input.nextInt();

        int divisor = day + month;
        int total = 0;

        // Цикл по двум переменным: i от 0 до 100, j от 200 до 500
        for (int i = 0, j = 200; i <= 100 && j <= 500; i++, j++) {
            if (i % divisor == 0) {
                total += i;
            }
            if (j % divisor == 0) {
                total += j;
            }
        }

        System.out.println("Сумма чисел, делящихся на " + divisor + " без остатка (0..100 и 200..500): " + total);
    }
}
