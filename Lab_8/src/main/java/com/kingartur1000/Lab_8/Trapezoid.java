package com.kingartur1000.Lab_8;

public class Trapezoid extends Shape {
    private double baseA;
    private double baseB;
    private double height;

    public Trapezoid(String color, double baseA, double baseB, double height) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (baseA + baseB) * height;
    }

    @Override
    public String toString() {
        return "Трапеция (" + color + "), площадь = " + getArea();
    }
}

