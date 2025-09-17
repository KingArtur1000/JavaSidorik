package Practice_Lab_01;

public class IncrementDecrement_09 {
    public static void main(String[] args) {
        int x = 12, y = 25; // изменены значения
        System.out.println("До инкремента: x = " + x + ", b = " + y);
        System.out.println("++x = " + ++x);
        System.out.println("y++ = " + y++);
        System.out.println("После: x = " + x + ", y = " + y);


        int a = 10, b = 5, c = 3;
        System.out.println("\nИсходные значения: ");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        int result = ++a * b-- + c++;
        System.out.println("Результат выражения ++a * b-- + c++ = " + result);
        System.out.println("Финальные значения:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", result = " + result);

        int p = 7, q = 4;
        System.out.println("\nИсходные значения: ");
        System.out.println("p = " + p + ", q = " + q);
        int sum = p++ + ++q - --p;
        System.out.println("p++ + ++q - --p = " + sum);
        System.out.println("Финальные значения:");
        System.out.println("p = " + p + ", q = " + q + ", sum = " + sum);
    }
}
