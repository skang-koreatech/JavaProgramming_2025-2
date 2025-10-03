package cse.java.week7;

public abstract class MenuItem {
    protected String name;
    protected int basePrice;

    public MenuItem(String name, int basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }
    
    public String getName() { return name; }
    
    public abstract int calcPrice();
}
