package upwork.andri.simpleordertaking.models;

import java.util.ArrayList;

public class ItemOrder {
    private String name;
    private int price;
    private int qty;

    public ItemOrder(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void incQty() {
        this.qty++;
    }

    public void decQty() {
        this.qty--;
    }

    public static ArrayList<ItemOrder> createOrderItems() {
        ArrayList<ItemOrder> items = new ArrayList<>();

        String[] itemNames = {"Coffee", "Tea", "Latte", "Chocolate", "Milk"};
        int[] itemPrice = {15, 10, 12, 20, 15};
        for (int i = 0; i < itemNames.length; i++) {
            items.add(new ItemOrder(itemNames[i], itemPrice[i]));
        }
        return items;
    }

}
