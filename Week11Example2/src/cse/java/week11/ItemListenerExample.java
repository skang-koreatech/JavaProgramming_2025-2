package cse.java.week11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ItemListener 예제");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new FlowLayout());

        JCheckBox cb1 = new JCheckBox("아메리카노");
        JCheckBox cb2 = new JCheckBox("카페라떼");
        JLabel label = new JLabel("선택: 없음");

        // ItemListener 익명 내부 클래스 사용
//        ItemListener listener = new ItemListener() {
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                String result = "선택: ";
//                if (cb1.isSelected()) 
//                    result += "아메리카노 ";
//                if (cb2.isSelected()) 
//                    result += "카페라떼 ";
//                if (!cb1.isSelected() && !cb2.isSelected()) 
//                    result += "없음";
//                label.setText(result);
//            }
//        };
        
//        cb1.addItemListener(listener);
//        cb2.addItemListener(listener);

        cb1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String result = "선택: ";
                if (cb1.isSelected()) 
                    result += "아메리카노 ";
                if (cb2.isSelected()) 
                    result += "카페라떼 ";
                if (!cb1.isSelected() && !cb2.isSelected()) 
                    result += "없음";
                label.setText(result);
            }
        });
        cb2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String result = "선택: ";
                if (cb1.isSelected()) 
                    result += "아메리카노 ";
                if (cb2.isSelected()) 
                    result += "카페라떼 ";
                if (!cb1.isSelected() && !cb2.isSelected()) 
                    result += "없음";
                label.setText(result);
            }
        });

        frame.add(cb1);
        frame.add(cb2);
        frame.add(label);
        frame.setVisible(true);
    }
}
