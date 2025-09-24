package Practice_03;

import java.util.Scanner;

/**
 * Расчёт эффективной температуры воздуха
 * с учётом температуры, скорости ветра и влажности.
 *
 * Используются формулы Wind Chill (T <= 10°C) и Heat Index (T >= 27°C).
 * Для промежуточных температур берётся фактическая температура.
 *
 * @author A.A. Dmitriev
 * @version 1.0
 */
public class Task_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите температуру воздуха (°C): ");
        double T = sc.nextDouble();

        System.out.print("Введите скорость ветра (км/ч): ");
        double v = sc.nextDouble();

        System.out.print("Введите влажность (%): ");
        double h = sc.nextDouble();

        double effectiveTemp = calculateEffectiveTemperature(T, v, h);

        System.out.printf("Эффективная температура: %.2f °C%n", effectiveTemp);
    }

    /**
     * Метод вычисляет эффективную температуру.
     * @param T температура воздуха (°C)
     * @param v скорость ветра (км/ч)
     * @param h относительная влажность (%)
     * @return эффективная температура (°C)
     */
    public static double calculateEffectiveTemperature(double T, double v, double h) {
        if (T <= 10 && v > 4.8) {
            // Wind Chill Index
            return 13.12 + 0.6215 * T - 11.37 * Math.pow(v, 0.16) + 0.3965 * T * Math.pow(v, 0.16);
        } else if (T >= 27) {
            // Heat Index
            return -8.784695 + 1.61139411 * T + 2.338549 * h
                    - 0.14611605 * T * h - 0.012308094 * T * T
                    - 0.016424828 * h * h + 0.002211732 * T * T * h
                    + 0.00072546 * T * h * h - 0.000003582 * T * T * h * h;
        } else {
            // В промежуточных условиях берём фактическую температуру
            return T;
        }
    }
}
