package Lab_2;

import java.util.Scanner;

/**
 * Вычисление корней квадратного уравнения
 * с использованием класса Math.
 * Задача: ввести коэффициенты a, b, c с консоли,
 * вычислить дискриминант и корни уравнения ax^2 + bx + c = 0.
 * Вывести исходные данные и найденные корни.
 *
 * @author V.V. Sidorik && A.A. Dmitriev
 * @version 1.0 18.09.2025
 */
public class Task_9_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ввод коэффициентов
        System.out.print("Введите a: ");
        double a = input.nextDouble();

        System.out.print("Введите b: ");
        double b = input.nextDouble();

        System.out.print("Введите c: ");
        double c = input.nextDouble();

        // Вычисляем дискриминант
        double D = Math.pow(b, 2) - 4 * a * c;

        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("Дискриминант D = " + D);

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Два корня: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("Один корень: x = " + x);
        } else {
            System.out.println("Корней нет (D < 0)");
        }
    }
}
