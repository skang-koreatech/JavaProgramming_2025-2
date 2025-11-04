package cse.java.week10;

import javax.swing.*;
import java.awt.*;

public class FrameStructureExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example"); // JFrame 객체 생성

        JLabel label = new JLabel("Hello, Swing!"); // JLabel 객체 생성
        JButton button = new JButton("Click"); // JButton 객체 생성

        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(button);

        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
