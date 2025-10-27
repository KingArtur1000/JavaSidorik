package com.kingartur1000.Lab_9;

import javax.swing.*;
import java.awt.*;

/**
 * Task_6
 * Построение графического интерфейса микроволновки
 * Автор: Дмитриев Артур Александрович, гр. 10702423
 */
public class Task_6 extends JFrame {
    public Task_6() {
        // Основная компоновка
        setLayout(new BorderLayout(10, 10));

        // Панель для отображения времени
        JTextField timeField = new JTextField("00:00");
        timeField.setHorizontalAlignment(JTextField.CENTER);
        timeField.setFont(new Font("Arial", Font.BOLD, 20));
        add(timeField, BorderLayout.NORTH);

        // Панель для "еды"
        JTextArea foodArea = new JTextArea("Здесь должна быть еда :)");
        foodArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        foodArea.setFont(new Font("Arial", Font.PLAIN, 16));
        add(foodArea, BorderLayout.CENTER);

        // Панель с кнопками (цифры + Start/Stop)
        JPanel panelButtons = new JPanel(new GridLayout(4, 3, 5, 5));
        String[] labels = {"1","2","3","4","5","6","7","8","9","0","Start","Stop"};
        for (String label : labels) {
            panelButtons.add(new JButton(label));
        }
        add(panelButtons, BorderLayout.EAST);
    }

    public static void main(String[] args) {
        Task_6 frame = new Task_6();
        frame.setTitle("Микроволновка — Дмитриев Артур Александрович, гр. 10702423");
        frame.setSize(600, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

