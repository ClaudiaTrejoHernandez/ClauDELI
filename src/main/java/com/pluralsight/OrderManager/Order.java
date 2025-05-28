package com.pluralsight.OrderManager;

import com.pluralsight.Interface.PricedItem;
import java.util.ArrayList;
import java.util.List;

public class Order{

    private List<PricedItem> items = new ArrayList<>();

    public void addItem(PricedItem item) {
        items.add(item);
    }

    public double getTotalPrice() {
        return items.stream().mapToDouble(PricedItem::getPrice).sum();
    }

    public void printReceipt() {
        items.forEach(item -> System.out.println(item.getName() + ": $" + String.format("%.2f", item.getPrice())));
    }

}
