package cse.java.week13;

import java.util.ArrayList;

class Cart {
    private ArrayList<OrderLine> lines = new ArrayList<>();

    // 장바구니에 아이템 추가
    public void addItem(MenuItem item) {
        for (OrderLine line : lines) {
            if (line.getItem().getName().equals(item.getName())) {
                line.addOne();
                return;
            }
        }
        lines.add(new OrderLine(item, 1));
    }

    public ArrayList<OrderLine> getLines() {
        return lines;
    }

    // 총합 계산
    public int calTotal() {
        int sum = 0;
        for (OrderLine line : lines) {
            sum += line.calcLinePrice();
        }
        return sum;
    }

    // 텍스트 형태로 장바구니 내용 반환
    public String printCart() {
        StringBuilder sb = new StringBuilder(); // StringBuilder 사용법 찾아보기
        for (OrderLine line : lines) {
            sb.append(line.toReceiptLine());
            sb.append("\n");
        }
        return sb.toString();
    }
    
    // 결제 후 장바구니 초기화
    public void clear() {
    	lines.clear();
    }
}

