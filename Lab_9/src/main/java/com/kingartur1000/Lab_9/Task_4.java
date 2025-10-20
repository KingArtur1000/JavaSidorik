package com.kingartur1000.Lab_9;

import javax.swing.*;
import java.awt.*;

/**
 * Task_4
 * Построение графического интерфейса с FlowLayout
 * Автор: Дмитриев Артур Александрович, гр. 10702423
 */
public class Task_4 extends JFrame {
    public Task_4() {
        // Устанавливаем FlowLayout: выравнивание по левому краю, интервалы 10 и 20
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        // Добавляем labels и text fields на фрейм
        add(new JLabel("Фамилия"));
        add(new JTextField("Дмитриев", 12));

        add(new JLabel("Имя"));
        add(new JTextField("Артур", 12));

        add(new JLabel("Отчество"));
        add(new JTextField("Александрович", 15));
    }

    public static void main(String[] args) {
        Task_4 frame = new Task_4();
        frame.setTitle("Дмитриев Артур Александрович, гр. 10702423");
        frame.setSize(350, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

