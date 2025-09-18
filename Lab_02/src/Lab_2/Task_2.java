package Lab_2;

import java.util.Scanner;

/**
 * @author A.A. Dmitriev
 * @version 1.0 17.09.2025
 */
public class Task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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

