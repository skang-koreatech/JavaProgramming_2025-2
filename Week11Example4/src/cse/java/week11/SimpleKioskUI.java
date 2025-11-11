package cse.java.week11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleKioskUI {
    public static void main(String[] args) {
        // 기본 프레임 생성
        JFrame frame = new JFrame("간단한 주문 키오스크");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // 버튼 3개 생성
        JButton coffeeBtn = new JButton("커피 주문");
        JButton teaBtn = new JButton("티 주문");
        JButton payBtn = new JButton("결제하기");

        // 상태 표시 라벨
        JLabel statusLabel = new JLabel("메뉴를 선택하세요!");

        // 이벤트 리스너 등록 (람다식 사용)
        coffeeBtn.addActionListener(e -> {
            statusLabel.setText("커피를 선택하셨습니다!");
        });

        teaBtn.addActionListener(e -> {
            statusLabel.setText("티를 선택하셨습니다!");
        });

        payBtn.addActionListener(e -> {
            statusLabel.setText("결제가 완료되었습니다. 감사합니다!");
        });

        // 컴포넌트 배치
        frame.add(coffeeBtn);
        frame.add(teaBtn);
        frame.add(payBtn);
        frame.add(statusLabel);

        frame.setVisible(true);
    }
}

