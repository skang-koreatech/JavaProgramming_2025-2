package cse.java.week7;

public class OrderLine {
    // TODO 1: 필드 선언 
    private MenuItem item;      // TODO
    private int quantity;       // TODO

    // TODO 2: 생성자 (item, quantity)
    public OrderLine(MenuItem item, int quantity) {
        // TODO: 필드 초기화
        this.item = item;
        this.quantity = quantity;
    }

    // TODO 3: 라인 금액 계산
    public int calcLinePrice() {
    	int price = 0;    	
    	price = item.calcPrice() * quantity; // TODO
    	return price;
    }

    // TODO 4: 영수증 한 줄 문자열 반환
    public String toReceiptLine() {
        // 예) "아메리카노 x 2 = 7000원"
    	String line = item.getName() + " x " + quantity + " = " + calcLinePrice() + "원";
    	return line;
        //return String.format("%s x %d = %d원", item.getName(), quantity, calcLinePrice()); // TODO
    }

    // getter 메소드
    public MenuItem getItem() { return item; }
    public int getQuantity() { return quantity; }
}
