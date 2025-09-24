package Practice_03;

import java.util.Scanner;

/**
 * Пример метода void (не возвращающего значение).
 * Метод printGrade печатает рейтинг по символьной шкале A, B, C, D, F.
 *
 * @author A.
 * @version 1.0
 */
public class Task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ввод данных с консоли
        System.out.print("Введите ваш балл (0-100): ");
        double score = sc.nextDouble();

        System.out.print("The grade is ");
        printGrade(score);

        // Тестовые вызовы
        System.out.print("The grade is ");
        printGrade(92.5);

        System.out.print("The grade is ");
        printGrade(54.5);
    }

    /**
     * Метод печатает рейтинг по символьной шкале:
     * A (>=90), B (>=80), C (>=70), D (>=60), F (<60).
     */
    public static void printGrade(double score) {
        if (score >= 90.0) {
            System.out.println("A");
        } else if (score >= 80.0) {
            System.out.println("B");
        } else if (score >= 70.0) {
            System.out.println("C");
        } else if (score >= 60.0) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
