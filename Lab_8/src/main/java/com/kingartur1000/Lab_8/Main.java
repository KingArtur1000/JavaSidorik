package com.kingartur1000.Lab_8;

public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle("красный", 5, 10);
        Shape tri = new Triangle("синий", 6, 4);
        Shape trap = new Trapezoid("зелёный", 3, 7, 5);

        System.out.println(rect);
        System.out.println(tri);
        System.out.println(trap);
    }
}

