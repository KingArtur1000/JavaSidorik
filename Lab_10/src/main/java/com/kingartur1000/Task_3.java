package com.kingartur1000;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task_3 extends JFrame {
    private JButton jbtEnlarge = new JButton("Enlarge");
    private JButton jbtShrink = new JButton("Shrink");
    private CirclePanel canvas = new CirclePanel();

    public Task_3() {
        // Панель для кнопок
        JPanel panel = new JPanel();
        panel.add(jbtEnlarge);
        panel.add(jbtShrink);

        // Добавляем элементы на фрейм
        this.add(canvas, BorderLayout.CENTER);
        this.add(panel, BorderLayout.SOUTH);

        // Регистрируем слушателей
        jbtEnlarge.addActionListener(new Listener());
        jbtShrink.addActionListener(new Listener());
    }

    public static void main(String[] args) {
        JFrame frame = new Task_3();
        frame.setTitle("Управление кругом");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // центр экрана
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Внутренний класс-слушатель
    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println(new java.util.Date(e.getWhen()));
            if (e.getSource() == jbtEnlarge)
                canvas.enlarge();
            else if (e.getSource() == jbtShrink)
                canvas.shrink();
        }
    }

    // Панель для рисования круга
    class CirclePanel extends JPanel {
        private int radius = 50; // начальный радиус

        public void enlarge() {
            radius++;
            repaint();
        }

        public void shrink() {
            if (radius > 1) radius--; // защита от отрицательного радиуса
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius,
                    2 * radius, 2 * radius);
        }
    }
}

