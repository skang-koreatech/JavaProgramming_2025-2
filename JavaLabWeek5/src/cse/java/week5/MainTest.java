package cse.java.week5;


class MenuItem {
    protected String name;
    protected int basePrice;

    public MenuItem(String name, int basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }
    
    public String getName() { return name; }
    public int calcPrice() { return basePrice; } 
}

class Coffee extends MenuItem {
    private int extraShot;
    private boolean iced;
    
    public Coffee(String name, int basePrice, int extraShot, boolean iced) {
        super(name, basePrice);
        this.extraShot = extraShot;
        this.iced = iced;
    }
    
    @Override
    public int calcPrice() {
        int price = basePrice + extraShot * 500;
        if (iced) price += 300;
        return price;
    }
}

// 하나의 메뉴 아이템의 주문 정보를 관리
class OrderLine {
    // TODO 1: 필드 선언 
    private ______ _____;      // TODO
    private _____ ________;       // TODO

    // TODO 2: 생성자 
    public OrderLine(MenuItem item, int quantity) {
        // TODO: 필드 초기화
        
        
    }

    // TODO 3: 라인 금액 계산 
    public int calcLinePrice() {
        int price = 0;
        
        // TODO 주문 메뉴 아이템의 금액을 계산하여 price에 저장
        
        return price; 
    }

    // TODO 4: 영수증 한 줄 문자열 반환
    public String toReceiptLine() {
        // 예) "아메리카노 x 2 = 7000원"
        
    	// TODO 위 예시와 같이 주문 정보를 나타내도록 문자열을 만들어 반환
    }

    // TODO 5: getter 메소드
    public MenuItem getItem() {
    	// TODO
    } 
    public int getQuantity() { 
    	// TODO
    } 
}



class Cart {
    // 장바구니 항목 배열
    private OrderLine[] lines = new OrderLine[5];
    // 장바구니 항목 개수
    private int count = 0;

    // TODO 1: 장바구니 담기
    public void addItem(MenuItem item, int quantity) {
    	// TODO: 장바구니가 가득차지 않았으면 새 OrderLine 추가
    	if (count __ __) {    		
    		// TODO: OrderLine 객체를 생성하여 lines 배열의 원소로 할당 
    		// TODO: 개수 1증가
    	} else {
    		System.out.println("장바구니가 가득차 추가할 수 없습니다.");
    	}
    }

    // TODO 2: 주문 메뉴 아이템의 금액 총합 계산
    public int calcTotal() {
        int sum = 0;

        // TODO: for 반복문을 사용하여 장바구니에 담긴 모든 메뉴 아이템의 금액 합계를 계산하여 sum에 저장

        return sum; 
    }

    // TODO 3: 장바구니 내역 출력
    public void printCart() {
        System.out.println("=== CART ===");
        
        if (_________ == 0) { // TODO: 주문 아이템이 하나도 없으면 
            System.out.println("(비어 있음)");
        } else {
            
        	// TODO: for 반복문을 이용하여 lines 배열에 담긴 모든 OrderLine의 영수증 한 줄 내역 출력
        	
            System.out.println("----------------");
            
            // TODO: 주문 금액 총합 출력
        }
    }

    public OrderLine[] getLines() { return lines; }
}


public class MainTest {
	public static void main(String[] args) {
		Cart cart = new Cart();

        cart.addItem(new Coffee("아메리카노", 3000, 1, true), 2); // 샷1, 아이스
        cart.addItem(new Coffee("카페라떼", 4500, 0, true), 1);  // 아이스
        
        // 추가적으로 장바구니 담기를 더 해보고 결과 확인해보기

        cart.printCart();
        
        /* 출력 결과
         * 
        === CART ===
		1) 아메리카노 x 2 = 7600원
		2) 카페라떼 x 1 = 4800원
		----------------
		총합: 12400원
		
		 *
         */
	}
}