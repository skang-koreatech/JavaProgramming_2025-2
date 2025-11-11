package cse.java.week11;

import javax.swing.*;
import java.awt.*;

public class AddExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("합계 계산기");
        frame.setLayout(new FlowLayout());
        frame.setSize(350, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField num1 = new JTextField(5);
        JTextField num2 = new JTextField(5);
        JButton addBtn = new JButton("더하기");
        JLabel result = new JLabel("결과: ");

        addBtn.addActionListener(e -> {
            try {
                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());
                int sum = a + b;
                result.setText("결과: " + sum);
            } catch (NumberFormatException ex) {
                result.setText("숫자를 입력하세요!");
            }
        });

        frame.add(num1);
        frame.add(num2);
        frame.add(addBtn);
        frame.add(result);

        frame.setVisible(true);
    }
}

