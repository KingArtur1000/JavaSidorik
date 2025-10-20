package com.kingartur1000.Lab_8;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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