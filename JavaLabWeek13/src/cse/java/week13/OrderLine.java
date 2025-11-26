package cse.java.week13;

class OrderLine {
    private MenuItem item;
    private int quantity;

    public OrderLine(MenuItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public MenuItem getItem() { return item; }
    public int getQuantity() { return quantity; }

    public void addOne() {
        quantity++;
    }

    // 해당 라인의 총 금액
    public int calcLinePrice() {
        return item.getPrice() * quantity;
    }

    // 영수증 출력용 문자열
    public String toReceiptLine() {
        return item.getName() + " x " + quantity + " = " + calcLinePrice() + "원";
    }
}

