package cse.java.week7;

public class MainTest {
	public static void main(String[] args) {
		Cart cart = new Cart();
		
		cart.printCart();

        cart.addItem(new Coffee("아메리카노", 3000, 1, true), 2); // 샷1, 아이스
        cart.addItem(new Coffee("카페라떼", 4500, 0, true), 1);  // 아이스
        cart.addItem(new Dessert("치즈케이크", 3500, true), 1);  // 포장
        
        cart.printCart();
	}
}
