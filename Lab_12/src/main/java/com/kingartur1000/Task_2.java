package com.kingartur1000;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JSpinner Demo");

        // Числовой спиннер: от -50 до 200, шаг 10
        SpinnerNumberModel snm = new SpinnerNumberModel(0, -50, 200, 10);
        JSpinner spnNumber = new JSpinner(snm);

        // Спиннер с датами
        SpinnerDateModel snd = new SpinnerDateModel(new Date(), null, null, Calendar.DAY_OF_MONTH);
        JSpinner spnDate = new JSpinner(snd);

        // Спиннер со списком
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        SpinnerListModel snl = new SpinnerListModel(colors);
        JSpinner spnList = new JSpinner(snl);

        Container cont = frame.getContentPane();
        cont.setLayout(new FlowLayout());
        cont.add(new JLabel("Select Number: "));
        cont.add(spnNumber);
        cont.add(new JLabel("Select Date: "));
        cont.add(spnDate);
        cont.add(new JLabel("Select Color: "));
        cont.add(spnList);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 120);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

