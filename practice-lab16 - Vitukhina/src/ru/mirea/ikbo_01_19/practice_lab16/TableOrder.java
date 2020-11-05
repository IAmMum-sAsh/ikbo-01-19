//***************************************************************************//

package ru.mirea.ikbo_01_19.practice_lab16;

import java.util.Arrays;

public class TableOrder implements Order {
    private int size = 0;
    private MenuItem[] items;
    private Customer customer;

    public TableOrder(){items = new MenuItem[size];}

    @Override
    public boolean add(MenuItem item) {
        try {
            size++;
            if (size >= items.length){
                MenuItem[] copy = items.clone();
                items = new MenuItem[size * 2];
                System.arraycopy(copy, 0, items, 0, copy.length);
            }
            items[size] = item;
        }
        catch (Exception e){
            System.out.println("Не удалось добавить позицию в заказ: " + e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public String[] itemNames() {
        String[] arr = new String[items.length];
        for (int i=0; i<items.length; i++){arr[i] = items[i].getName();}
        return arr;
    }

    @Override
    public int itemsQuantity() { return size; }

    @Override
    public int itemQuantity(String itemName) {
        int count = 0;
        for (MenuItem item : items){
            if (item.getName().equals(itemName)){count++;}
        }
        return count;
    }

    @Override
    public int itemQuantity(MenuItem itemName) {return itemQuantity(itemName.getName());}

    @Override
    public MenuItem[] getItems() {
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        boolean removed = false;
        int index = 0;
        for (int i=0; i<size; i++){
            if (items[i].getName().equals(itemName)){
                index = i + 1;
                items[i] = null;
                removed = true;
                break;
            }
        }
        if (items.length - 1 - index >= 0){System.arraycopy(items, index + 1, items, index, items.length - 1 - index);}
        items[items.length - 1] = null;
        size--;
        return removed;
    }

    @Override
    public boolean remove(MenuItem item) { return remove(item.getName()); }

    @Override
    public int removeAll(String itemName) {
        int count = 0;
        for (int i=0; i<size; i++) {
            if (items[i].getName().equals(itemName)) {
                items[i] = null;
                count++;
            }
        }
        MenuItem[] newItems = new MenuItem[items.length];
        int index = 0;
        for (MenuItem item : items) {
            if (item != null) {
                newItems[index] = item;
                index++;
            }
        }
        items = newItems;
        return count;
    }

    @Override
    public int removeAll(MenuItem item) {
        return removeAll(item.getName());
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        Arrays.sort(items, (el1, el2) -> {
            double c = el2.getCost() - el1.getCost();
            return (c == 0) ? 0 : (int) c;
        });
        return items;
    }

    @Override
    public int costTotal() {
        int sum = 0;
        for (int i=0; i<items.length; i++){sum += items[i].getCost();}
        return sum;
    }

    @Override
    public Customer getCustomer() { return customer; }

    @Override
    public void setCustomer(Customer customer) { this.customer = customer; }
}
