package Lab_2;

import java.util.Scanner;

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
