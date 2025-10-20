package com.kingartur1000.Lab_9;

import javax.swing.*;
import java.awt.*;

/**
 * Task_7
 * Построение графического интерфейса с панелями и настройкой свойств компонентов
 * Автор: Дмитриев Артур Александрович, гр. 10702423
 */
public class Task_7 extends JFrame {
    public Task_7() {
        // Панель 1 для кнопок
        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        JButton btnLeft = new JButton("Left");
        JButton btnCenter = new JButton("Center");
        JButton btnRight = new JButton("Right");

        // Настройки кнопок
        btnLeft.setBackground(Color.LIGHT_GRAY);
        btnCenter.setForeground(Color.BLUE);
        btnRight.setToolTipText("Это правая кнопка");

        // Добавляем кнопки на панель
        panel1.add(btnLeft);
        panel1.add(btnCenter);
        panel1.add(btnRight);

        // Панель 2 для лейблов
        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JLabel lblRed = new JLabel("Red");
        lblRed.setForeground(Color.RED);
        JLabel lblOrange = new JLabel("Orange");
        lblOrange.setForeground(Color.ORANGE);

        // Добавляем лейблы на панель
        panel2.add(lblRed);
        panel2.add(lblOrange);

        // Добавляем панели в окно
        setLayout(new BorderLayout());
        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Task_7 frame = new Task_7();
        frame.setTitle("TestSwingCommonFeatures — Дмитриев Артур Александрович, гр. 10702423");
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

