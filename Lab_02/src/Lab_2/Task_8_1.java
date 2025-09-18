package Lab_2;

/**
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
