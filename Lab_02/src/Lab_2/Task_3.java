package Lab_2;
import java.util.Scanner;
/**
 * Вычисление суммы чисел.
 * do-while цикл.
 *
 * @author V.V. Sidorik
 * @version 1.2 09.02.2017
 */
public class Task_3 {
    public static void main(String[] args) {
        int data;
        int sum = 0;
        int triggerNumb = 307;
// Создаем объект Scanner
        Scanner input = new Scanner(System.in);
// Вводим данные пока не 0
// Keep reading data until the input is 0
        do {
// Read the next data
            System.out.println("Вводите целое значение (выход, если число = 307): ");
            data = input.nextInt();
            sum += data;
        } while (data != triggerNumb);
        System.out.println("Сумма введенных чисел = " + sum);
    }
}