package ru.mirea.ikbo_01_19.practice_lab16;

import java.awt.*;

public class TableOrderManager implements OrderManager {
    private Order[] orders;

    public void add(Order order, int tableNumber){}
    public void addItem(MenuItem item, int tableNumber){}
    public int FreeTableNumber(){ return 0; }
    public int[] FreeTableNumbers(){ return null; }
    public Order getOrder(int tableNumber){ return null; }
    public void remove(int tableNumber){}
    public int remove(Order order){ return 0; }
    public int removeAll(Order order){ return 0; }


    @Override
    public int itemsQuantity(String itemName) {
        return 0;
    }

    @Override
    public Order[] getOrders() {
        return new Order[0];
    }

    @Override
    public int ordersCostSummary() {
        return 0;
    }

    @Override
    public int orderQuantity() {
        return 0;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        return 0;
    }
}
