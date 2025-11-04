package cse.java.week10;

import javax.swing.*;
import java.awt.*;

public class BasicComponents {
    public static void main(String[] args) {
        JFrame frame = new JFrame("기본 컴포넌트 예제");
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("이름:");
        JTextField field = new JTextField(10);
        JButton button = new JButton("확인");
        JCheckBox checkBox = new JCheckBox("Check Me");
        JLabel label2 = new JLabel("한국기술교육대학교");

        frame.add(label);
        frame.add(field);
        frame.add(button);
        frame.add(checkBox);
        frame.add(label2);

        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
