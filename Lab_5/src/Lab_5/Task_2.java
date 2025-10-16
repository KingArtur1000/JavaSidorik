package Lab_5;


class Circle {
    private double radius;
    private String color;

    // по умолчанию
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    // с параметром радиуса
    public Circle(double r) {
        radius = r;
        color = "red";
    }

    // радиус и цвет
    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    // с одинарной точностью
    public Circle(float r, String c) {
        radius = (double) r;
        color = c;
    }

    public double getRadius() { return radius; }
    public String getColor() { return color; }
    public double getArea() { return radius * radius * Math.PI; }
    public double getCircumference() { return 2 * Math.PI * radius; }

    public void setRadius(double r) { radius = r; }
    public void setColor(String c) { color = c; }
}


public class Task_2 {

    public static void main(String[] args) {
        System.out.println("Класс Cirlce (демо):");

        Circle c1 = new Circle();
        System.out.println("Circle 1 (конструктор по умолчанию):");
        System.out.println("Радиус: " + c1.getRadius());
        System.out.println("Цвет:   " + c1.getColor());
        System.out.printf("Площадь: %.2f\n", c1.getArea());
        System.out.printf("Длина окружности: %.2f\n\n", c1.getCircumference());

        Circle c2 = new Circle(5.0);
        System.out.println("Circle 2 (конструктор с радиусом):");
        System.out.println("Радиус: " + c2.getRadius());
        System.out.println("Цвет:   " + c2.getColor());
        System.out.printf("Площадь: %.2f\n", c2.getArea());
        System.out.printf("Длина окружности: %.2f\n\n", c2.getCircumference());

        Circle c3 = new Circle(3.5, "green");
        System.out.println("Circle 3 (конструктор с радиусом и цветом):");
        System.out.println("Радиус: " + c3.getRadius());
        System.out.println("Цвет:   " + c3.getColor());
        System.out.printf("Площадь: %.2f\n", c3.getArea());
        System.out.printf("Длина окружности: %.2f\n\n", c3.getCircumference());

        Circle c4 = new Circle(2.5f, "blue");
        System.out.println("Circle 4 (конструктор с float радиусом):");
        System.out.println("Радиус: " + c4.getRadius());
        System.out.println("Цвет:   " + c4.getColor());
        System.out.printf("Площадь: %.2f\n", c4.getArea());
        System.out.printf("Длина окружности: %.2f\n\n", c4.getCircumference());

        System.out.println("Тестирование сеттеров (изменяем Circle 1):");
        c1.setRadius(7.0);
        c1.setColor("yellow");
        System.out.println("Новый радиус: " + c1.getRadius());
        System.out.println("Новый цвет:   " + c1.getColor());
        System.out.printf("Новая площадь: %.2f\n", c1.getArea());
        System.out.printf("Новая длина окружности: %.2f\n", c1.getCircumference());

        System.out.println("Вот и всё :)");
        System.out.println("\n");
    }
}


