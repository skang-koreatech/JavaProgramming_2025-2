package cse.java.week7;

public class Cart {
    // TODO 1: 장바구니 항목 리스트
    private OrderLine[] lines = new OrderLine[5];
    private int count = 0;

    // TODO 2: 장바구니 담기
    public void addItem(MenuItem item, int quantity) {
    	if (count < 4) {
    		// 새 OrderLine 추가
    		lines[count] = new OrderLine(item, quantity);
    		count++;
    	} else {
    		System.out.println("장바구니가 가득차 추가할 수 없습니다.");
    	}
    }

    // TODO 3: 총합 계산
    public int calcTotal() {
        int sum = 0;
        
        // TODO
        for (int i = 0; i < count; i++) {
            sum += lines[i].calcLinePrice();
        }
        
        return sum; 
    }

    // TODO 4: 출력
    public void printCart() {
        System.out.println("=== CART ===");
        if (count == 0) {
            System.out.println("(비어 있음)");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.printf("%d) %s%n", i + 1, lines[i].toReceiptLine());
            }
            System.out.println("----------------");
            System.out.println("총합: " + calcTotal() + "원");
            System.out.println("----------------\n");
        }
    }

    public OrderLine[] getLines() { return lines; }
}
