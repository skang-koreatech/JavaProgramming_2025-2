package cse.java.week10;

import javax.swing.*;
import java.awt.*;

public class MultiPanelExample {
    public static void main(String[] args) {
        // 1. 프레임 생성
        JFrame frame = new JFrame("여러 개의 JPanel 예제");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout()); // 전체 영역 구분용 레이아웃

        // 2. 상단 패널 (메뉴 영역)
        JPanel topPanel = new JPanel(); // 기본 레이아웃: new FlowLayout(FlowLayout.CENTER)
        topPanel.setBackground(Color.LIGHT_GRAY);
        topPanel.add(new JButton("홈"));
        topPanel.add(new JButton("메뉴"));
        topPanel.add(new JButton("주문"));
        topPanel.add(new JButton("설정"));

        // 3. 중앙 패널 (내용 영역)
        JPanel centerPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        centerPanel.setBackground(Color.WHITE);
        centerPanel.add(new JButton("커피"));
        centerPanel.add(new JButton("라떼"));
        centerPanel.add(new JButton("스무디"));
        centerPanel.add(new JButton("쿠키"));

        // 4. 하단 패널 (상태 표시)
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bottomPanel.setBackground(new Color(240, 240, 255));
        bottomPanel.add(new JLabel("상태: "));
        bottomPanel.add(new JLabel("대기 중"));

        // 5. 패널을 프레임에 배치
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        // 6. 표시
        frame.setVisible(true);
    }
}
