//***************************************************************************//

package ru.mirea.ikbo_01_19.practice_lab16;

import java.util.Arrays;

public class InternetOrder implements Order{
    private int size = 0;
    private ListNode head;
    private ListNode tail;
    private Customer customer;

    public InternetOrder(){}

    public boolean add(MenuItem item) {
        try {
            if (head == null){
                head = tail = new ListNode();
                head.setValue(item);
                head.setNext(head);
            }
            else{
                ListNode node = new ListNode();
                node.setValue(item);
                tail.setNext(node);
                node.setNext(head);
                tail = node;
            }
            size++;
        }
        catch (Exception e) {
            System.out.println("Не удалось добавить позицию в интернет-заказ: " + e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public String[] itemNames() {
        String[] arr = new String[size];
        ListNode node = head;
        for (int i=0; i<size; i++){
            arr[i] = node.getValue().getName();
            node = node.getNext();
        }
        return arr;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        int count = 0;
        ListNode node = head;
        for (int i=0; i<size; i++){
            if (node.getValue().getName().equals(itemName)) {count++;}
            node = node.getNext();
        }
        return count;
    }

    @Override
    public int itemQuantity(MenuItem itemName) {
        return itemQuantity(itemName.getName());
    }

    @Override
    public MenuItem[] getItems() {
        MenuItem[] arr = new MenuItem[size];
        ListNode node = head;
        for (int i=0; i<size; i++){
            arr[i] = node.getValue();
            node = node.getNext();
        }
        return arr;
    }

    @Override
    public boolean remove(String itemName) {
        ListNode node = head;
        do {
            if (node.getNext().getValue().getName().equals(itemName)) {
                node.setNext(node.getNext().getNext());
                size--;
                return true;
            }
            node = node.getNext();
        } while (node != head);
        return false;
    }

    @Override
    public boolean remove(MenuItem item) { return remove(item.getName()); }

    @Override
    public int removeAll(String itemName) {
        int count = 0;
        ListNode node = head;
        do {
            if (node.getNext().getValue().getName().equals(itemName)) {
                node.setNext(node.getNext().getNext());
                size--;
                count++;
            }
            node = node.getNext();
        } while (node != head);
        return count;
    }

    @Override
    public int removeAll(MenuItem item) {
        return removeAll(item.getName());
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] arr = getItems();
        Arrays.sort(arr, (el1, el2) -> {
            double c = el2.getCost() - el1.getCost();
            return (c == 0) ? 0 : (int)c;
        });
        return arr;
    }

    @Override
    public int costTotal() {
        int sum = 0;
        ListNode node = head;
        for (int i=0; i<size; i++){
            sum += node.getValue().getCost();
            node = node.getNext();
        }
        return sum;
    }

    @Override
    public Customer getCustomer() { return customer; }

    @Override
    public void setCustomer(Customer customer) { this.customer = customer; }
}
