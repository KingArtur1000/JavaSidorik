package com.kingartur1000.Lab_8;

/**
 * Абстрактный класс Shape – базовая фигура
 * Автор: Артур
 */
public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "Фигура цвета: " + color;
    }
}

