package cse.java.week7;

public class Dessert extends MenuItem {
    private boolean packaged; // 포장 여부를 나타내는 필드
    
    public Dessert(String name, int basePrice, boolean packaged) {
        super(name, basePrice);
        this.packaged = packaged; 
    }
    
    @Override
    public int calcPrice() {
        return basePrice + (packaged ? 500 : 0); // 포장이면 500원 추가
    }
}
