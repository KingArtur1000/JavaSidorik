package com.kingartur1000.Lab_9;

import javax.swing.*;
import java.awt.*;

/**
 * Task_5
 * Построение графического интерфейса с GridLayout
 * Автор: Дмитриев Артур Александрович, гр. 10702423
 */
public class Task_5 extends JFrame {
    public Task_5() {
        // Устанавливаем GridLayout: 3 строки, 2 столбца, интервалы 10 и 10
        setLayout(new GridLayout(3, 2, 10, 10));

        // Добавляем labels и text fields на фрейм
        add(new JLabel("Фамилия"));
        add(new JTextField("Дмитриев", 12));

        add(new JLabel("Имя"));
        add(new JTextField("Артур", 12));

        add(new JLabel("Отчество"));
        add(new JTextField("Александрович", 15));
    }

    public static void main(String[] args) {
        Task_5 frame = new Task_5();
        frame.setTitle("Дмитриев Артур Александрович, гр. 10702423");
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

