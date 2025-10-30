package com.kingartur1000;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class Task_1 extends JFrame {
    public Task_1() {
        super("JSlider Demo");

        // Слайдер: min=10, max=100, value=50
        final JSlider slider = new JSlider(JSlider.HORIZONTAL, 10, 100, 50);
        slider.setMinorTickSpacing(5);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setLabelTable(slider.createStandardLabels(20));

        setLayout(new FlowLayout());
        add(slider);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);

        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                System.out.println("Current Value = " + slider.getValue());
            }
        });
    }

    public static void main(String[] args) {
        new Task_1();
    }
}


