package Lab_04;

import java.util.Random;

/**
 * Класс для демонстрации линейного поиска в массиве.
 *
 * @author Артур
 * @version 1.0 02.10.2025
 */
public class Task_2_1 {

    public static void main(String[] args) {
        int[] arr = new int[50];
        Random rand = new Random();

        System.out.println("Генерация массива чисел:");
        // Заполняем массив числами от 0 до 100
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(101);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int target = 42; // число для поиска
        int index = linearSearch(arr, target);

        if (index == -1) {
            System.out.println("Элемент " + target + " не найден в массиве.");
        } else {
            System.out.println("Элемент " + target + " найден по индексу " + index);
        }
    }

    /**
     * Метод линейного поиска элемента в массиве.
     *
     * @param arr    массив для поиска
     * @param target искомое число
     * @return индекс элемента или -1, если не найден
     */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
