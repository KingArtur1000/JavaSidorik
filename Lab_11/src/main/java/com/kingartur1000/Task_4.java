package com.kingartur1000;

import java.awt.event.*;
import javax.swing.*;

public class Task_4 extends JFrame {
    public static void main(String[] args) {
        Task_4 frame = new Task_4();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("TestWindowEvent");
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public Task_4() {
        addWindowListener(new WindowListener() {
            public void windowDeiconified(WindowEvent e) { System.out.println("Window deiconified"); }
            public void windowIconified(WindowEvent e) { System.out.println("Window iconified"); }
            public void windowActivated(WindowEvent e) { System.out.println("Window activated"); }
            public void windowDeactivated(WindowEvent e) { System.out.println("Window deactivated"); }
            public void windowOpened(WindowEvent e) { System.out.println("Window opened"); }
            public void windowClosing(WindowEvent e) { System.out.println("Window closing"); }
            public void windowClosed(WindowEvent e) { System.out.println("Window closed"); }
        });

        addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                System.out.println("Размер окна изменён: " + getWidth() + "x" + getHeight());
            }
        });
    }
}

