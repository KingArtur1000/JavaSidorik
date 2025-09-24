package Practice_03;

import java.util.Arrays;

/**
 * Демонстрация передачи параметров по значению и по ссылке.
 * Пример swap и swapFlag.
 *
 * @author A.
 * @version 1.0
 */
public class Task_4 {
    public static void main(String[] args) {
        // Объявляем и инициализируем переменные
        int num1 = 1;
        int num2 = 2;
        System.out.println("Перед вызовом метода swap, num1 = " +
                num1 + " и num2 = " + num2);

        // Попытка поменять местами (не сработает, т.к. передача по значению)
        swap(num1, num2);
        System.out.println("После вызова метода swap, num1 = " +
                num1 + " и num2 = " + num2);

        // Используем массив для swapFlag
        int[] values = {1, 2};
        System.out.println("\nПеред вызовом swapFlag: " + Arrays.toString(values));
        swapFlag(values, true);   // флаг = true → меняем местами
        System.out.println("После вызова swapFlag(true): " + Arrays.toString(values));
        swapFlag(values, false);  // флаг = false → оставляем как есть
        System.out.println("После вызова swapFlag(false): " + Arrays.toString(values));
    }

    /** Swap two variables (не влияет на оригинальные переменные) */
    public static void swap(int n1, int n2) {
        System.out.println("\tВнутри метода swap");
        System.out.println("\t\tПеред перестановкой n1 = " + n1 + " n2 = " + n2);
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("\t\tПосле перестановки n1 = " + n1 + " n2 = " + n2);
    }

    /**
     * SwapFlag — меняет местами два значения массива, если флаг = true.
     * @param arr массив из двух элементов
     * @param flag булевский флаг
     */
    public static void swapFlag(int[] arr, boolean flag) {
        if (flag && arr.length >= 2) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
    }
}
