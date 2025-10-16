package Lab_04;

import java.util.Random;

/**
 * Класс демонстрирует перегрузку методов:
 * генерация случайных символов, целых чисел и чисел с плавающей точкой.
 *
 * @author Артур
 * @version 1.0 02.10.2025
 */
public class Task_2 {

    private static final Random rand = new Random();

    public static void main(String[] args) {
        // Тестирование перегруженных методов
        System.out.println("Случайный символ [A..Z]: " + getRandomCharacter('A', 'Z'));
        System.out.println("Случайное целое [10..20]: " + getRandomCharacter(10, 20));
        System.out.println("Случайное double [1.5..5.5]: " + getRandomCharacter(1.5, 5.5));
    }

    /**
     * Генерация случайного символа в диапазоне [ch1, ch2].
     *
     * @param ch1 нижняя граница
     * @param ch2 верхняя граница
     * @return случайный символ
     */
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + rand.nextInt(ch2 - ch1 + 1));
    }

    /**
     * Перегруженный метод: генерация случайного целого числа в диапазоне [min, max].
     *
     * @param min нижняя граница
     * @param max верхняя граница
     * @return случайное целое число
     */
    public static int getRandomCharacter(int min, int max) {
        return rand.nextInt(max - min + 1) + min;
    }

    /**
     * Перегруженный метод: генерация случайного числа double в диапазоне [min, max].
     *
     * @param min нижняя граница
     * @param max верхняя граница
     * @return случайное число double
     */
    public static double getRandomCharacter(double min, double max) {
        return min + (max - min) * rand.nextDouble();
    }
}
