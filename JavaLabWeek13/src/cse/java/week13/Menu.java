package cse.java.week13;

import java.util.ArrayList;

class Menu {
    private ArrayList<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public ArrayList<MenuItem> getAll() {
        return items;
    }
}

