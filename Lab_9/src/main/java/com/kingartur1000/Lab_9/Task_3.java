package com.kingartur1000.Lab_9;

import javax.swing.*;
import java.awt.*;

/**
 * Task_3
 * Построение графического интерфейса с BorderLayout
 * Автор: Дмитриев Артур Александрович, гр. 10702423
 */
public class Task_3 extends JFrame {
    public Task_3() {
        // Устанавливаем BorderLayout с горизонтальным и вертикальным интервалами
        setLayout(new BorderLayout(10, 15));

        // Добавляем кнопки с биографическими данными
        add(new JButton("Фамилия: Дмитриев"), BorderLayout.EAST);
        add(new JButton("Имя: Артур"), BorderLayout.SOUTH);
        add(new JButton("Отчество: Александрович"), BorderLayout.WEST);
        add(new JButton("Группа: 10702423"), BorderLayout.NORTH);
        add(new JButton("Город: Жодино"), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Task_3 frame = new Task_3();
        frame.setTitle("Дмитриев Артур Александрович, гр. 10702423");
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

