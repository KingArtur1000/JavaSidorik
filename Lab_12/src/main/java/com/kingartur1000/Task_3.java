package com.kingartur1000;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JCheckBox Demo");

        JCheckBox chk1 = new JCheckBox("Option A");
        JCheckBox chk2 = new JCheckBox("Option B", true);

        ItemListener listener = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                JCheckBox src = (JCheckBox) e.getItem();
                if (e.getStateChange() == ItemEvent.SELECTED)
                    System.out.println(src.getText() + " выделен");
                else
                    System.out.println(src.getText() + " снято выделение");
            }
        };

        chk1.addItemListener(listener);
        chk2.addItemListener(listener);

        JPanel panel = new JPanel();
        panel.add(chk1);
        panel.add(chk2);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 120);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

