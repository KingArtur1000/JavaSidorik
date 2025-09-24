package Practice_03;

/**
 * Перегрузка методов:
 * имена одинаковые, но сигнатуры разные (количество и типы параметров).
 * Пример нахождения максимума и минимума.
 *
 * @author: A.A. Dmitriev
 * @version 1.3
 */

public class Task_3 {

    public static void main(String[] args) {
        // Вызовы max
        System.out.println("The maximum between 3 and 4 is " + max(3, 4));
        System.out.println("The maximum between 3.0 and 5.4 is " + max(3.0, 5.4));
        System.out.println("The maximum between 3 and 5.4 is " + max(3, 5.4));
        System.out.println("The maximum between 3.0, 5.4, and 10.14 is " + max(3.0, 5.4, 10.14));
        System.out.println("The maximum between 3f and 5.4 is " + max(3f, 5.4));

        // Вызовы min
        System.out.println("The minimum between 3 and 4 is " + min(3, 4));
        System.out.println("The minimum between 3.0 and 5.4 is " + min(3.0, 5.4));
        System.out.println("The minimum between 3 and 5.4 is " + min(3, 5.4));
        System.out.println("The minimum between 3.0, 5.4, and 10.14 is " + min(3.0, 5.4, 10.14));
        System.out.println("The minimum between 3f and 5.4 is " + min(3f, 5.4));
    }

    /** Возвращает max из двух int значений */
    public static int max(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    /** Возвращает max из двух double значений */
    public static double max(double num1, double num2) {
        return (num1 > num2) ? num1 : num2;
    }

    /** Возвращает max из двух float значений */
    public static float max(float num1, float num2) {
        return (num1 > num2) ? num1 : num2;
    }

    /** Возвращает max из трёх double значений */
    public static double max(double num1, double num2, double num3) {
        return max(max(num1, num2), num3);
    }

    // ------------------ Аналогичные методы для min ------------------

    /** Возвращает min из двух int значений */
    public static int min(int num1, int num2) {
        return (num1 < num2) ? num1 : num2;
    }

    /** Возвращает min из двух double значений */
    public static double min(double num1, double num2) {
        return (num1 < num2) ? num1 : num2;
    }

    /** Возвращает min из двух float значений */
    public static float min(float num1, float num2) {
        return (num1 < num2) ? num1 : num2;
    }

    /** Возвращает min из трёх double значений */
    public static double min(double num1, double num2, double num3) {
        return min(min(num1, num2), num3);
    }
}
