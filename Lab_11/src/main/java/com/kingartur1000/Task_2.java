package com.kingartur1000;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Task_2 extends JFrame {
    private KeyboardPanel keyboardPanel = new KeyboardPanel();

    public Task_2() {
        add(keyboardPanel);
        keyboardPanel.setFocusable(true);
    }

    public static void main(String[] args) {
        Task_2 frame = new Task_2();
        frame.setTitle("KeyEventDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    static class KeyboardPanel extends JPanel {
        private int x = 100;
        private int y = 100;
        private char keyChar = 'C';

        public KeyboardPanel() {
            addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent e) {
                    switch (e.getKeyCode()) {
                        case KeyEvent.VK_DOWN: y = Math.min(y + 15, getHeight() - 10); break;
                        case KeyEvent.VK_UP: y = Math.max(y - 15, 20); break;
                        case KeyEvent.VK_LEFT: x = Math.max(x - 15, 5); break;
                        case KeyEvent.VK_RIGHT: x = Math.min(x + 15, getWidth() - 10); break;
                        default: keyChar = e.getKeyChar();
                    }
                    repaint();
                }
            });
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setFont(new Font("Arial", Font.BOLD, 24));
            g.drawString(String.valueOf(keyChar), x, y);
        }
    }
}

