package com.kingartur1000.Lab_9;

import javax.swing.*;
import java.awt.*;

/**
 * Task_2
 * Программа для тестирования Frame с компонентами
 * Автор: Дмитриев Артур Александрович, гр. 10702423
 */
public class Task_2 {
    public static void main(String[] args) {
        // Создаем фрейм с заголовком
        JFrame frame = new JFrame("Дмитриев Артур Александрович, гр. 10702423");

        // Устанавливаем менеджер компоновки (FlowLayout для кнопок)
        frame.setLayout(new FlowLayout());

        // Создаем кнопки
        JButton jbtOK = new JButton("OK");
        JButton jbtNo = new JButton("No");
        JButton jbtCancel = new JButton("Cancel");

        // Добавляем кнопки на фрейм
        frame.add(jbtOK);
        frame.add(jbtNo);
        frame.add(jbtCancel);

        // Настройки окна
        frame.setSize(500, 200); // изменённый размер
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

