package com.kingartur1000;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Класс QuotientWithMethod демонстрирует обработку исключений
 * при делении двух целых чисел, используя отдельный метод.
 */
public class Task_2 {

    /**
     * Метод quotient выполняет деление двух чисел.
     * Если делитель равен нулю, выбрасывается ArithmeticException.
     *
     * @param number1 делимое
     * @param number2 делитель
     * @return результат деления
     * @throws ArithmeticException если number2 == 0
     */
    public static int quotient(int number1, int number2) throws ArithmeticException {
        if (number2 == 0) {
            throw new ArithmeticException("Попытка деления на ноль недопустима.");
        }
        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите два целых числа: ");

        try {
            int number1 = input.nextInt();
            int number2 = input.nextInt();

            int result = quotient(number1, number2);
            System.out.println("Результат: " + number1 + " / " + number2 + " = " + result);

        } catch (ArithmeticException ex) {
            System.out.println("[ОШИБКА]: деление на ноль не выполняется.");
            System.out.println(">> Детали: " + ex.getMessage());

        } catch (InputMismatchException ex) {
            System.out.println("[ОШИБКА]: некорректный ввод. Ожидались целые числа.");

        } catch (Exception ex) {
            System.out.println("[ОБЩЕЕ ИСКЛЮЧЕНИЕ]: " + ex.getMessage());
            System.out.println("Класс исключения: " + ex.toString());

        } finally {
            System.out.println("Программа завершает работу блока try/catch и продолжает выполнение.");
        }
    }
}
