package com.kingartur1000;

import javax.swing.*;
import java.awt.event.*;

public class Task_1 extends JFrame {
    private JButton jbtNew = new JButton("New");
    private JButton jbtOpen = new JButton("Open");
    private JButton jbtSave = new JButton("Save");
    private JButton jbtPrint = new JButton("Print");
    private JButton jbtOK = new JButton("OK");
    private JButton jbtCancel = new JButton("Cancel");

    public Task_1() {
        JPanel panel = new JPanel();
        panel.add(jbtNew);
        panel.add(jbtOpen);
        panel.add(jbtSave);
        panel.add(jbtPrint);
        panel.add(jbtOK);
        panel.add(jbtCancel);
        add(panel);

        ButtonListener listener = new ButtonListener();
        jbtNew.addActionListener(listener);
        jbtOpen.addActionListener(listener);
        jbtSave.addActionListener(listener);
        jbtPrint.addActionListener(listener);
        jbtOK.addActionListener(listener);
        jbtCancel.addActionListener(listener);
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Object src = e.getSource();
            if (src == jbtNew) System.out.println("Нажата New");
            else if (src == jbtOpen) System.out.println("Нажата Open");
            else if (src == jbtSave) System.out.println("Нажата Save");
            else if (src == jbtPrint) System.out.println("Нажата Print");
            else if (src == jbtOK) System.out.println("Нажата OK");
            else if (src == jbtCancel) System.out.println("Нажата Cancel");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new Task_1();
        frame.setTitle("DetectSourceDemo");
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

