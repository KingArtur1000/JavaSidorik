package Lab_2;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        // создаем экземпляр класса Scanner для ввода
        Scanner input = new Scanner(System.in);

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
