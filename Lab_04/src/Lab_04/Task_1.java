package Lab_04;

import java.util.Scanner;

/**
 * Класс для решения квадратного уравнения вида:
 * a*x^2 + b*x - c = 0
 *
 * Используется метод, возвращающий массив корней.
 * Если корней нет – возвращается пустой массив.
 *
 * @author Артур
 * @version 1.0 02.10.2025
 */
public class Task_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите коэффициент a: ");
        double a = sc.nextDouble();
        System.out.print("Введите коэффициент b: ");
        double b = sc.nextDouble();
        System.out.print("Введите коэффициент c: ");
        double c = sc.nextDouble();

        double[] roots = solveEquation(a, b, c);

        if (roots.length == 0) {
            System.out.println("Уравнение не имеет действительных корней.");
        } else {
            System.out.println("Корни уравнения:");
            for (int i = 0; i < roots.length; i++) {
                System.out.println("x" + (i + 1) + " = " + roots[i]);
            }
        }
    }

    /**
     * Метод для решения квадратного уравнения a*x^2 + b*x - c = 0
     *
     * @param a коэффициент при x^2
     * @param b коэффициент при x
     * @param c свободный член (с минусом в уравнении)
     * @return массив корней (0, 1 или 2 элемента)
     */
    public static double[] solveEquation(double a, double b, double c) {
        double d = b * b + 4 * a * c; // дискриминант (заметь: +4ac, т.к. уравнение a*x^2 + b*x - c)
        if (d < 0) {
            return new double[0]; // нет действительных корней
        } else if (d == 0) {
            return new double[]{-b / (2 * a)};
        } else {
            double sqrtD = Math.sqrt(d);
            return new double[]{
                    (-b + sqrtD) / (2 * a),
                    (-b - sqrtD) / (2 * a)
            };
        }
    }
}
