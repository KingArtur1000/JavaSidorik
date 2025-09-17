package Practice_Lab_01;

import java.util.Scanner;

public class ConsoleInput_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите радиус окружности: ");
        double radius = input.nextDouble();
        double length = 2 * 3.14159 * radius;
        System.out.println("Длина окружности с радиусом " + radius + " равна " + length);

        System.out.print("Введите длину первого катета: ");
        double a = input.nextDouble();
        System.out.print("Введите длину второго катета: ");
        double b = input.nextDouble();
        double triangleArea = 0.5 * a * b;
        System.out.println("Площадь прямоугольного треугольника с катетами " + a +
                " и " + b + " равна " + triangleArea);

        input.close();
    }
}