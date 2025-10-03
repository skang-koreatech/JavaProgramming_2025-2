package cse.java.week7;

public class Coffee extends MenuItem {
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
