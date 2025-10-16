package Lab_6;

import java.lang.Math;

public class Task_1 {

    public static class Circle {
        private double radius;
        private String color;

        public Circle() {
            this.radius = 1.0;
            this.color = "Белый";
        }

        public Circle(double radius) {
            this.radius = radius;
            this.color = "Белый";
        }

        public Circle(String color, float radius) {
            this.color = color;
            this.radius = radius;
        }

        public double getRadius() { return radius; }
        public void setRadius(double radius) { this.radius = radius; }

        public String getColor() { return color; }
        public void setColor(String color) { this.color = color; }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getCircumference() {
            return 2 * Math.PI * radius;
        }

        @Override
        public String toString() {
            return String.format("Circle: radius = %.2f, color = %s", radius, color);
        }
    }

    public static class Cylinder extends Circle {
        private double height;

        public Cylinder() {
            super();
            this.height = 1.0;
        }

        public Cylinder(double radius, double height) {
            super(radius);
            this.height = height;
        }

        public double getHeight() { return height; }
        public void setHeight(double height) { this.height = height; }

        @Override
        public double getArea() {
            // 2πrh + 2πr²
            return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
        }

        public double getVolume() {
            return super.getArea() * height;
        }

        @Override
        public String toString() {
            return "Cylinder: radius = " + getRadius() +
                    ", height = " + height +
                    ", color = " + getColor();
        }
    }

    public static void main(String[] args) {
        System.out.println("Test Cylinder");
        testCircle();

        testCylinder();
    }

    private static void testCircle() {
        System.out.println("=== Тестирование класса Circle ===");

        Circle c1 = new Circle();
        Circle c2 = new Circle(3.5);
        Circle c3 = new Circle("Красный", 4.2f);

        printCircleInfo("c1 (по умолчанию)", c1);
        printCircleInfo("c2 (радиус=3.5)", c2);
        printCircleInfo("c3 (цвет+радиус)", c3);

        // Проверка сеттеров
        c1.setRadius(2.5);
        c1.setColor("Синий");
        System.out.println("\nПосле изменения c1:");
        printCircleInfo("c1 (обновлённый)", c1);
    }

    private static void testCylinder() {
        System.out.println("\nТестирование класса Cylinder ");

        Cylinder cylinder1 = new Cylinder();
        System.out.println("cylinder1 (по умолчанию):");
        printCylinderInfo(cylinder1);

        Cylinder cylinder2 = new Cylinder(5.0, 2.1);
        System.out.println("\ncylinder2 (радиус=5.0, высота=2.1):");
        printCylinderInfo(cylinder2);

        // Изменяем высоту
        cylinder2.setHeight(5.1);
        System.out.println("\nПосле изменения высоты cylinder2:");
        printCylinderInfo(cylinder2);
    }

    private static void printCircleInfo(String label, Circle circle) {
        System.out.println(label + " -> " + circle);
        System.out.printf("Площадь = %.2f\n", circle.getArea());
        System.out.printf("Длина окружности = %.2f\n", circle.getCircumference());
    }

    private static void printCylinderInfo(Cylinder cylinder) {
        System.out.println(cylinder);
        System.out.printf("Высота = %.2f\n", cylinder.getHeight());
        System.out.printf("Площадь основания = %.2f\n", Math.PI * cylinder.getRadius() * cylinder.getRadius());
        System.out.printf("Площадь поверхности = %.2f\n", cylinder.getArea());
        System.out.printf("Объем = %.2f\n", cylinder.getVolume());
    }
}

