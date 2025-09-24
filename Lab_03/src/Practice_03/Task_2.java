package Practice_03;

import java.util.Scanner;

/**
 * @author A.A.
 * @version 1.0
 */
public class Task_2 {
    /** Main method */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int i = sc.nextInt();

        System.out.print("Введите второе число: ");
        int j = sc.nextInt();

        // вызов метода, возвращающего значение
        int k = max(i, j);
        System.out.println("The maximum between " + i +
                " and " + j + " is " + k);

        // вызов метода, не возвращающего значение
        printMin(i, j);
    }

    /** Return the max between two numbers */
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;
        return result; // оператор return
    }

    /** Print the minimum between two numbers (void-метод) */
    public static void printMin(int num1, int num2) {
        if (num1 < num2)
            System.out.println("The minimum between " + num1 + " and " + num2 + " is " + num1);
        else
            System.out.println("The minimum between " + num1 + " and " + num2 + " is " + num2);
    }
}
