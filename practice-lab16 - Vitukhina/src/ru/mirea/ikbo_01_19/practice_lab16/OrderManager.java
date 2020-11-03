package ru.mirea.ikbo_01_19.practice_lab16;

public interface OrderManager {
    public int itemsQuantity(String itemName);
    public int itemsQuantity(MenuItem item);
    public Order[] getOrders();
    public int ordersCostSummary();
    public int orderQuantity();
}