package com.kingartur1000.Lab_9;

import javax.swing.*;

/**
 * Task_1
 * Программа для тестирования Frame
 * Автор: Дмитриев Артур Александрович, гр. 10702423
 */
public class Task_1 {
    public static void main(String[] args) {
        // Создаем фрейм с заголовком (ФИО + группа)
        JFrame frame = new JFrame("Дмитриев Артур Александрович, гр. 10702423");

        // Устанавливаем размеры фрейма
        frame.setSize(600, 400); // изменённые размеры

        // Центрируем окно
        frame.setLocationRelativeTo(null);

        // Завершаем программу при закрытии окна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Делаем окно видимым
        frame.setVisible(true);
    }
}

