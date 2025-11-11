package cse.java.week11;

import javax.swing.*;
import java.awt.event.*;

public class EventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("이벤트 구조 예제");
        frame.setSize(500, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn = new JButton("클릭");
        JLabel label = new JLabel("아직 클릭하지 않음");

        // 이벤트 리스너 등록
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("이벤트 발생! 소스: " + e.getSource());
            }
        });

        frame.add(btn, "North");
        frame.add(label, "South");
        
        frame.setVisible(true);
    }
}
