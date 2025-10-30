package com.kingartur1000;

import javax.swing.*;

public class Task_6 extends JFrame {
    public Task_6() {
        super("JTabbedPane Example");

        JTabbedPane tabPanel = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.WRAP_TAB_LAYOUT);

        for (int i = 1; i <= 5; i++) {
            JPanel panel = new JPanel();
            panel.add(new JButton("Button No " + i));
            if (i == 3) {
                panel.add(new JLabel("This is panel number " + i));
            }
            tabPanel.add("Panel " + i, panel);
        }

        tabPanel.add(new JLabel("Simple Text"), 3);

        getContentPane().add(tabPanel);
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task_6();
    }
}

