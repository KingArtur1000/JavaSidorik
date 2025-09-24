package Practice_03;

import java.util.Arrays;

/**
 * Демонстрация массивов и работы с ними:
 * - объявление и инициализация
 * - линейный поиск
 * - сортировка по возрастанию и убыванию
 *
 * @author A.A. Dmitriev
 * @version 1.0
 */

public class Task_6 {
    public static void main(String[] args) {
        // Объявление и инициализация массива из 20 элементов
        int[] myArray = {25, 12, 7, 33, 18, 42, 5, 99, 1, 64,
                23, 11, 8, 77, 54, 31, 2, 19, 88, 6};

        System.out.println("Исходный массив: " + Arrays.toString(myArray));

        // Сортировка по возрастанию
        int[] ascSorted = Arrays.copyOf(myArray, myArray.length);
        sortAscending(ascSorted);
        System.out.println("Сортировка по возрастанию: " + Arrays.toString(ascSorted));

        // Сортировка по убыванию
        int[] descSorted = Arrays.copyOf(myArray, myArray.length);
        sortDescending(descSorted);
        System.out.println("Сортировка по убыванию: " + Arrays.toString(descSorted));

        // Демонстрация линейного поиска
        int index = linearSearch(myArray, 42);
        System.out.println("Элемент 42 найден по индексу: " + index);
    }

    /**
     * Метод поиска key в массиве (линейный поиск).
     *
     * @param list массив для поиска
     * @param key  искомое значение
     * @return индекс найденного элемента или -1, если не найден
     */
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Сортировка массива по возрастанию (метод пузырька).
     *
     * @param arr массив для сортировки
     */
    public static void sortAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Сортировка массива по убыванию (метод пузырька).
     *
     * @param arr массив для сортировки
     */
    public static void sortDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
