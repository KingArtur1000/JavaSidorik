package com.kingartur1000;

import javax.swing.*;
import java.awt.event.*;

public class Task_1 extends JFrame {
    public Task_1() {
        // Создаем кнопки
        JButton jbtOK = new JButton("OK");
        JButton jbtCancel = new JButton("Cancel");

        // Панель для кнопок
        JPanel panel = new JPanel();
        panel.add(jbtOK);
        panel.add(jbtCancel);

        add(panel);

        // Регистрируем слушателей
        jbtOK.addActionListener(new OKListenerClass());
        jbtCancel.addActionListener(new CancelListenerClass());
    }

    public static void main(String[] args) {
        JFrame frame = new Task_1();
        frame.setTitle("Управление событиями");
        frame.setSize(300, 150);
        frame.setLocation(0, 0); // левый верхний угол
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

// слушатель кнопки OK
class OKListenerClass implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("Нажата кнопка OK");
    }
}

// слушатель кнопки Cancel
class CancelListenerClass implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("Нажата кнопка Cancel");
    }
}

