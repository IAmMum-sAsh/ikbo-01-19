package ru.mirea.ikbo_01_19.practice11;

import java.util.ArrayList;

public class ArrayQueue<T> extends AbstractQueue<T> {
    public ArrayQueue() {
        this.queue = new ArrayList<>();
    }

    @Override
    public T peek() {
        if(this.queue == null) {
            return null;
        }
        else{
            return this.queue.get(0);
        }
    }

    @Override
    public T poll() {
        if (this.queue == null) {
            return null;
        }
        T elem = this.queue.get(0);
        this.queue.remove(0);
        return elem;
    }

    @Override
    public boolean offer(T elem) {
        return this.queue.add(elem);
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}