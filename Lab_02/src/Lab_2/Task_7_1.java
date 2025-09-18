package Lab_2;

import java.util.Scanner;

/**
 * Оператор switch:
 * Задача — вычислить рейтинг по шкале A, B, C, D, F
 * в зависимости от введённого количества баллов (0–100).
 * Для анализа используется деление баллов на 10.
 *
 * @author A.A. Dmitriev
 * @version 1.0 18.09.2025
 */
public class Task_7_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество баллов (0-100): ");
        int score = input.nextInt();

        // Делим на 10 для упрощения анализа в switch
        int tens = score / 10;
        char grade;

        switch (tens) {
            case 10: // 100 баллов
            case 9:  // 90–99 баллов
                grade = 'A';
                break;
            case 8:  // 80–89 баллов
                grade = 'B';
                break;
            case 7:  // 70–79 баллов
                grade = 'C';
                break;
            case 6:  // 60–69 баллов
                grade = 'D';
                break;
            default: // всё остальное
                grade = 'F';
        }

        System.out.println("Ваш рейтинг: " + grade);
    }
}
