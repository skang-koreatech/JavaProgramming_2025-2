package cse.java.week13;

import javax.swing.*;
import java.awt.*;

public class KioskMain {

    private Menu menu = new Menu();
    private Cart cart = new Cart();

    private JFrame frame;
    
    private JLabel topLabel;
    // 장바구니 내역 표시용 
    private JTextArea cartArea;
    // 총 금액 표시용
    private JLabel totalLabel;

    public static void main(String[] args) {
        new KioskMain().createUI();
    }

    public void createUI() {
        frame = new JFrame("주문 키오스크");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 350);
        frame.setLayout(new BorderLayout(10, 10));

        // 메뉴 등록
        menu.addItem(new MenuItem("아메리카노", 3000));
        menu.addItem(new MenuItem("카페라떼", 3500));
        menu.addItem(new MenuItem("레몬에이드", 4000));

        // 상단 안내 라벨
        topLabel = new JLabel("메뉴를 선택하세요.", SwingConstants.CENTER);
        topLabel.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        frame.add(topLabel, BorderLayout.NORTH);

        // 좌측 메뉴 버튼
        JPanel menuPanel = new JPanel(new GridLayout(menu.getAll().size(), 1, 5, 5));
        for (MenuItem mi : menu.getAll()) {
            JButton btn = new JButton(mi.toString());
            btn.addActionListener(e -> {
                cart.addItem(mi);
                updateCartAreaAndTotal();  // 장바구니 + 총액 동시 갱신
                topLabel.setText(mi.getName() + " 추가됨!");
            });
            menuPanel.add(btn);
        }
        frame.add(menuPanel, BorderLayout.WEST);

        // 중앙 장바구니 표시
        cartArea = new JTextArea();
        cartArea.setEditable(false);
        frame.add(new JScrollPane(cartArea), BorderLayout.CENTER);

        // 하단 영역 패널 구성 (총액 라벨 + 결제 버튼)
        JPanel bottomPanel = new JPanel(new BorderLayout());

        totalLabel = new JLabel("총 금액: 0원");
        totalLabel.setFont(new Font("맑은 고딕", Font.BOLD, 14));
        totalLabel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10)); // 여백

        JButton payBtn = new JButton("결제하기");
        payBtn.addActionListener(e -> {
        	int total = cart.calTotal();
        	
        	if (total == 0) {
        		topLabel.setText("장바구니가 비어 있습니다!");
        		return;
        	}
        	
            // 결제 결과 표시
        	topLabel.setText("결제 완료! 총 " + total + "원");
        	totalLabel.setText("총 금액: " + total + "원");
        	
        	// 장바구니 초기화
        	cart.clear();
        	
        	// UI 업데이트
        	updateCartAreaAndTotal();            
        });

        bottomPanel.add(totalLabel, BorderLayout.WEST);
        bottomPanel.add(payBtn, BorderLayout.EAST);

        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    // 장바구니 영역 내용과 총액 내용 업데이트
    private void updateCartAreaAndTotal() {
        cartArea.setText(cart.printCart());
        totalLabel.setText("총 금액: " + cart.calTotal() + "원");
    }
}

