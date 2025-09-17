package Practice_Lab_01;

public class ShortHandOperator_05 {
    public static void main(String[] args) {
        int x = 15, y = 28;
        System.out.println("До инкремента: x = " + x + ", y = " + y);
        System.out.println("++x = " + ++x);
        System.out.println("y++ = " + y++);
        System.out.println("После: x = " + x + ", y = " + y + '\n');

        x = 7;
        y = 12;
        int z;
        z = ++x + y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = ++x + y = " + z + '\n');

        x = 7;
        y = 12;
        z = x++ + y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = x++ + y = " + z + '\n');

        int a = 20, b = 15;
        System.out.println("До декремента: a = " + a + ", b = " + b);
        System.out.println("--a = " + --a);
        System.out.println("b-- = " + b--);
        System.out.println("После: a = " + a + ", b = " + b + '\n');

        // Другие shorthand operators с индивидуальными значениями
        int i = 5, j = 8, k = 3, m = -6, n = 17;
        i += 12;
        j -= 3;
        k *= 7;
        m /= 2;
        n %= 5;

        System.out.println(" i += 12 получаем " + i);
        System.out.println(" j -= 3 получаем " + j);
        System.out.println(" k *= 7 получаем " + k);
        System.out.println(" m /= 2 получаем " + m);
        System.out.println(" n %= 5 получаем " + n);

        System.out.println(Math.pow(3, 4));
        System.out.println(Math.sin(1.57));

        // Для переменных типа char
        char ch1 = 'b';
        char ch2 = 'Y';
        System.out.println(" ch1 += 5 получаем " + (ch1 += 5));
        System.out.println(" ch2 += 3 получаем " + (ch2 += 3));

        x = 3;
        y = x++ + x;
        System.out.println("----- y = " + y);
        System.out.println('5' - '3' + 'a' / 'b');

        x = 15;
        y = 15;
        boolean zz = (y > 15) && (x++ > 15);
        System.out.println("x=" + x);

        x = 15;
        y = 15;
        zz = (y > 15) || (x++ > 15);
        System.out.println("|| x=" + x);

        System.out.println("-30/-7 = " + (-30 % -7));
        System.out.println("-28.5/-6.2 = " + (-28.5 % -6.2));
        System.out.println("'B' + 2 = " + ('B' + 2));
    }
}
