//***************************************************************************//

package ru.mirea.ikbo_01_19.practice_lab16;

public class TableOrderManager implements OrderManager {
    private Order[] orders;

    public TableOrderManager(){orders = new Order[10];}

    public void add(Order order, int tableNumber){orders[tableNumber] = order;}

    public void addItem(MenuItem item, int tableNumber){orders[tableNumber].add(item);}

    public int FreeTableNumber(){
        for (int i=0; i<orders.length; i++) {
            if (orders[i] == null){return i;}
        }
        return -1;
    }

    public int[] FreeTableNumbers(){
        int count = 0;
        for(int i=0; i<orders.length; i++){
            if (orders[i] == null){count++;}
        }
        int[] arr = new int[count];
        count = 0;
        for(int i=0; i<orders.length; i++){
            if (orders[i] == null){arr[count] = i;}
        }
        return arr;
    }

    public Order getOrder(int tableNumber){return orders[tableNumber];}

    public void remove(int tableNumber){orders[tableNumber] = null;}

    public int remove(Order order){
        for (int i = 0; i < orders.length; i++) {
            if (orders[i].equals(order)) {
                orders[i] = null;
                return i;
            }
        }
        return -1;
    }

    public int removeAll(Order order){
        int count = 0;
        for (int i=0; i<orders.length; i++) {
            if (orders[i].equals(order)) {
                orders[i] = null;
                count++;
            }
        }
        return count;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        for (int i=0; i<orders.length; i++){ count += orders[i].itemQuantity(itemName); }
        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        return itemsQuantity(item.getName());
    }

    @Override
    public Order[] getOrders() {
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        int sum = 0;
        for (int i=0; i<orders.length; i++){ sum += orders[i].costTotal(); }
        return sum;
    }

    @Override
    public int orderQuantity() {
        return orders.length;
    }
}
