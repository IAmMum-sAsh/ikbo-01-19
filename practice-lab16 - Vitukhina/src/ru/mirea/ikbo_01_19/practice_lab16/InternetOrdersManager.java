package ru.mirea.ikbo_01_19.practice_lab16;

public class InternetOrdersManager implements OrderManager{
    private QueueNode head;
    private QueueNode tail;
    private int size;


    public boolean add(Order order) {

        return true;
    }

    public boolean remove(Order order) {

        return true;
    }

    public Order order(){
        return null;
    }

    @Override
    public int itemsQuantity(String itemName) {
        return 0;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
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
}