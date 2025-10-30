package com.kingartur1000;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class Task_4 extends JFrame implements ActionListener {
    private JToggleButton redButton, greenButton, blueButton;
    private JPanel display;

    public Task_4() {
        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        redButton = new JToggleButton("red");
        greenButton = new JToggleButton("green");
        blueButton = new JToggleButton("blue");

        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);

        display = new JPanel();
        display.setPreferredSize(new Dimension(120, 120));
        display.setBorder(LineBorder.createGrayLineBorder());
        display.setBackground(Color.BLACK);

        gl.setAutoCreateGaps(true);
        gl.setAutoCreateContainerGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addGroup(gl.createParallelGroup()
                        .addComponent(redButton)
                        .addComponent(greenButton)
                        .addComponent(blueButton))
                .addComponent(display)
        );

        gl.setVerticalGroup(gl.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addGroup(gl.createSequentialGroup()
                        .addComponent(redButton)
                        .addComponent(greenButton)
                        .addComponent(blueButton))
                .addComponent(display)
        );

        pack();
        setTitle("JToggleButton");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        Color color = display.getBackground();
        int r = color.getRed(), g = color.getGreen(), b = color.getBlue();

        switch (e.getActionCommand()) {
            case "red":   r = (r == 0 ? 255 : 0); break;
            case "green": g = (g == 0 ? 255 : 0); break;
            case "blue":  b = (b == 0 ? 255 : 0); break;
        }

        display.setBackground(new Color(r, g, b));
        System.out.println("Текущий цвет: R=" + r + " G=" + g + " B=" + b);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new Task_4().setVisible(true));
    }
}

