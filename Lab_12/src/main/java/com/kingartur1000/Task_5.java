package com.kingartur1000;

import javax.swing.*;

public class Task_5 extends JFrame {
    public Task_5() {
        super("SimpleMDI");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JDesktopPane desktopPane = new JDesktopPane();
        add(desktopPane);

        JInternalFrame frame1 = new JInternalFrame("Frame1", true);
        JInternalFrame frame2 = new JInternalFrame("Frame2", true, true, true, true);
        JInternalFrame frame3 = new JInternalFrame("Frame3", true, true, true);

        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Это для фрейма 1"));
        panel1.add(new JButton("OK1"));
        frame1.add(panel1);

        frame1.setSize(200, 100);
        frame1.setLocation(20, 100);
        frame1.setVisible(true);

        frame2.setSize(200, 60);
        frame2.setVisible(true);

        frame3.setSize(200, 120);
        frame3.setLocation(250, 20);
        frame3.setVisible(true);

        desktopPane.add(frame1);
        desktopPane.add(frame2);
        desktopPane.add(frame3);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Task_5();
    }
}

