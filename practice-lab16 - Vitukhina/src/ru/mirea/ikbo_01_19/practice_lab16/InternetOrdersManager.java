package ru.mirea.ikbo_01_19.practice_lab16;

public class InternetOrdersManager implements OrderManager{
    private QueueNode head;
    private QueueNode tail;
    private int size;

    public InternetOrdersManager(){}

    public boolean add(Order order) {
        try {
            if (head == null){
                head = tail = new QueueNode();
                head.setValue(order);
                head.setNext(head);
                head.setPrev(head);
            }
            else{
                QueueNode buffer = new QueueNode();
                buffer.setValue(order);
                tail.setNext(buffer);
                buffer.setPrev(tail);
                buffer.setNext(head);
                tail = buffer;
                head.setPrev(tail);
            }
            size++;
        }
        catch (Exception e) {
            System.out.println("Не удалось добавить позицию в интернет-заказ: " + e.getMessage());
            return false;
        }
        return true;
    }

    public boolean remove(Order order) {
        QueueNode node = head;
        for (int i=0; i<size; i++){
            if (node.getValue() == order){
                node.getPrev().setNext(node.getNext());
                node.getNext().setPrev(node.getPrev());
                node = null;
                size--;
            }
            node = node.getNext();
        }
        return true;
    }
//  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//    public Order order(){
//        return null;
//    }
//  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        QueueNode node = tail;
        for (int i=0; i<size; i++){
            count += node.getValue().itemQuantity(itemName);
            node = node.getNext();
        }
        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        return itemsQuantity(item.getName());
    }

    @Override
    public Order[] getOrders() {
        Order[] orders = new Order[size];
        QueueNode node = head;
        for (int i=0; i<size; i++){
            orders[i] = node.getValue();
            node = node.getNext();
        }
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        int sum = 0;
        QueueNode node = head;
        for (int i=0; i<size; i++){
            sum += node.getValue().costTotal();
            node = node.getNext();
        }
        return sum;
    }

    @Override
    public int orderQuantity() {
        return size;
    }
}