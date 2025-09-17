package Lab_2;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        // создаем экземпляр класса Scanner для ввода
        Scanner input = new Scanner(System.in);

        // подсказка вводить x
        System.out.println("Введите целое значение х");
        int x = input.nextInt();

        // подсказка вводить y
        System.out.println("Введите целое значение y");
        int y = input.nextInt();

        // Вариант 1: one-way
        if (x > y)
            System.out.println("x больше y");

        // Вариант 2: one-way
        if (x > y) {
            System.out.println("x больше y");
            System.out.println("Разность x - y = " + (x - y));
        }

        // Вариант 3: two-way
        if (x > y) {
            System.out.println("x больше y");
            System.out.println("Разность x - y = " + (x - y));
        } else {
            System.out.println("x меньше или равно y");
        }

        // --- Новая часть: вычисление рейтинга ---
        System.out.println("Введите количество баллов (0-100):");
        int score = input.nextInt();

        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Ваш рейтинг: " + grade);
    }
}
