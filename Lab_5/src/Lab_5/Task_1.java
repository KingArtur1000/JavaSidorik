package Lab_5;

class Box {
    double width;
    double height;
    double depth;
    String color;
}

public class Task_1 {

    public static void main(String[] args) {
        System.out.println("Класс BOX");
        System.out.println("\n");

        Box myBox = new Box();
        double area;

        myBox.height = 25;
        myBox.width = 30;
        myBox.depth = 15;
        myBox.color = "красный";

        area = 2 * (myBox.width * myBox.height + myBox.width * myBox.depth + myBox.height * myBox.depth);

        System.out.println("myBox1:");
        System.out.println("Ширина:  " + myBox.width);
        System.out.println("Глубина: " + myBox.depth);
        System.out.println("Высота:  " + myBox.height);
        System.out.printf("Площадь поверхности = %.2f\n", area);
        System.out.println("Цвет:    " + myBox.color);
        System.out.println("\n\n");

        Box myBox2 = new Box();
        double area2;

        myBox2.width = 10;
        myBox2.height = 20;
        myBox2.depth = 8;
        myBox2.color = "синий";

        area2 = 2 * (myBox2.width * myBox2.height + myBox2.width * myBox2.depth + myBox2.height * myBox2.depth);

        System.out.println("myBox2:");
        System.out.println("Ширина:  " + myBox2.width);
        System.out.println("Глубина: " + myBox2.depth);
        System.out.println("Высота:  " + myBox2.height);
        System.out.printf("Площадь поверхности = %.2f\n", area2);
        System.out.println("Цвет:    " + myBox2.color);
        System.out.println("\n\n");
    }
}

