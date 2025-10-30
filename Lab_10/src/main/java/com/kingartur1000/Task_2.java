package com.kingartur1000;

import javax.swing.*;
import java.awt.event.*;

public class Task_2 extends JFrame {
    public Task_2() {
        // Создаем кнопки
        JButton jbtNew = new JButton("New");
        JButton jbtOpen = new JButton("Open");
        JButton jbtSave = new JButton("Save");
        JButton jbtPrint = new JButton("Print");

        // Панель для кнопок
        JPanel panel = new JPanel();
        panel.add(jbtNew);
        panel.add(jbtOpen);
        panel.add(jbtSave);
        panel.add(jbtPrint);

        add(panel);

        // Анонимные слушатели
        jbtNew.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажата New");
            }
        });

        jbtOpen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажата Open " + e);
            }
        });

        jbtSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажата Save");
            }
        });

        jbtPrint.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажата Print");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new Task_2();
        frame.setTitle("Анонимные слушатели");
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null); // центр экрана
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

