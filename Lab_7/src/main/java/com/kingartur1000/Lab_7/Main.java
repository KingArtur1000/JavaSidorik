package com.kingartur1000.Lab_7;


public class Main {
    public static final String PUBLISHING_HOUSE = "Эрудит";
    public static final String PUBLISHING_LOCATION = "Мн.";

    public static void main(String[] args) {
        System.out.println("\nЖурналы:");

        Note[] notes = new Note[10];
        notes[0] = new Note("Васильев П.И.", "Создание классов в Java", 3.6);
        notes[1] = new Note("Васильев П.И.", "Среда NetBeans", 2.8);

        Magazine magazine = new Magazine("Программирование", 1, 2016,
                notes, PUBLISHING_HOUSE, PUBLISHING_LOCATION);

        System.out.println(magazine.toString());
        System.out.println("Всего страниц: " + magazine.getNumberPage());
    }
}

