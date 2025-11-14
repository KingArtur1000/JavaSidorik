package com.kingartur1000;
import java.util.Scanner;

/**
 * Класс демонстрирует обработку различных исключений,
 * каждая потенциально опасная операция вынесена в отдельный метод.
 */
public class Task_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите два целых числа через пробел: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        handleArrayException();
        handleCastException();
        handleIllegalArgument(number2);
        handleArithmeticException(number1, number2);

        System.out.println("Программа успешно дошла до конца выполнения.");
    }

    /** Метод, вызывающий ArrayIndexOutOfBoundsException */
    public static void handleArrayException() {
        try {
            int[] array = {1, 2, 3};
            System.out.println("Попытка доступа к элементу массива: " + array[5]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("[ОШИБКА]: индекс массива вне допустимого диапазона!");
            System.out.println(">> Детали: " + ex.getMessage());
        }
    }

    /** Метод, вызывающий ClassCastException */
    public static void handleCastException() {
        try {
            Object obj = "Строка";
            Integer num = (Integer) obj;
        } catch (ClassCastException ex) {
            System.out.println("[ОШИБКА]: недопустимое преобразование типов!");
            System.out.println(">> Детали: " + ex.getMessage());
        }
    }

    /** Метод, проверяющий делитель на отрицательность */
    public static void handleIllegalArgument(int number2) {
        try {
            if (number2 < 0) {
                throw new IllegalArgumentException("Делитель не может быть отрицательным");
            }
        } catch (IllegalArgumentException ex) {
            System.out.println("[ОШИБКА]: передан неверный аргумент!");
            System.out.println(">> Детали: " + ex.getMessage());
        }
    }

    /** Метод, проверяющий деление на ноль и выполняющий деление */
    public static void handleArithmeticException(int number1, int number2) {
        try {
            if (number2 == 0) {
                throw new ArithmeticException("Ошибка! Деление на ноль!");
            }
            System.out.println("Результат деления: " + number1 + " / " + number2 + " = " + (number1 / number2));
        } catch (ArithmeticException ex) {
            System.out.println("[ОШИБКА]: операция деления на ноль невозможна!");
            System.out.println(">> Детали: " + ex.getMessage());
        }
    }
}
