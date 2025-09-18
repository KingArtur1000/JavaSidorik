package Lab_2;

/**
 * Применение label и continue.
 * Задача: пройти по массиву оценок, анализируя каждое значение.
 * Если значение <= 0 — завершить внешний цикл.
 * Если значение > 5 — проверить его во внутреннем цикле:
 *   - при значении 10 — вывести "Хороший результат! Ура!!!" и продолжить внутренний цикл;
 *   - иначе — вывести "Неплохо! Ура!" и перейти к следующему элементу внешнего цикла.
 * Если значение <= 5 — вывести "Больше практики...".
 * Если значение < 3 — вывести "Начинаем с начала" и перейти к следующему элементу внешнего цикла.
 *
 * @author A.A. Dmitriev
 * @version 1.3 18.09.2025
 */
public class Task_8_1 {
    public static void main(String[] args) {
        int[] scores = {2, 9, 10, 0, 8, 10, 7, 1, 9, 8};

        outer:
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Оцениваем значение: " + scores[i]);

            if (scores[i] <= 0) {
                System.out.println("Нулевое или отрицательное значение — завершаем цикл.");
                break outer;
            }

            if (scores[i] < 3) {
                System.out.println("Начинаем с начала");
                continue outer;
            }

            if (scores[i] > 5) {
                inner:
                for (int j = 0; j < 3; j++) {
                    if (scores[i] == 10) {
                        System.out.println("Хороший результат! Ура!!!");
                        continue inner;
                    }
                    System.out.println("Неплохо! Ура!");
                    continue outer;
                }
            }

            if (scores[i] <= 5) {
                System.out.println("Больше практики...");
            }
        }
    }
}
