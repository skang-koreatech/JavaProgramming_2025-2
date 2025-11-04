package cse.java.week10;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
	public static void main(String[] args) {
	
		JFrame frame = new JFrame("BorderLayout 예제");
		
		frame.setLayout(new BorderLayout(8, 8));
		
		frame.add(new JLabel("상단 툴바"), BorderLayout.NORTH);
		frame.add(new JLabel("하단 상태바"), BorderLayout.SOUTH);
		frame.add(new JButton("왼쪽"),     BorderLayout.WEST);
		frame.add(new JButton("오른쪽"),   BorderLayout.EAST);
		frame.add(new JTextArea("중앙 본문"), BorderLayout.CENTER);
		
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
