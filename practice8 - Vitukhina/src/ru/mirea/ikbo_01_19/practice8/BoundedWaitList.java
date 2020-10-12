package ru.mirea.ikbo_01_19.practice8;

public class BoundedWaitList<Object> extends WaitList {
    private int capacity;

    public BoundedWaitList(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(java.lang.Object e){
        if(content.size() < capacity){
            content.add(e);
        }
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }
}
