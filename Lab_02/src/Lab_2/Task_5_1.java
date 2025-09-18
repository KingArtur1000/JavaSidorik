package Lab_2;

import java.util.Scanner;

public class Task_5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ввод даты рождения
        System.out.print("Введите день рождения: ");
        int day = input.nextInt();

        System.out.print("Введите месяц рождения: ");
        int month = input.nextInt();

        System.out.print("Введите год рождения: ");
        int year = input.nextInt();

        // Вычисляем Nmax
        int Nmax = year + day + month;

        long product = 1;

        // Цикл от 14 до Nmax
        for (int i = 14; i <= Nmax; i++) {
            product *= i;

            // Проверка на делимость на 79
            if (product % 79 == 0) {
                System.out.println("Прерывание цикла: произведение делится на 79 без остатка.");
                break;
            }
        }

        // Вывод результата
        System.out.println("Nmax = " + Nmax);
        System.out.println("Произведение = " + product);
    }
}

