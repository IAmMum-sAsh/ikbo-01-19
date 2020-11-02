package ru.mirea.ikbo_01_19.practice11;

import java.util.LinkedList;

public class LinkedQueue<T> extends AbstractQueue<T> {
    public LinkedQueue() {
        this.queue = new LinkedList<>();
    }

    @Override
    public T peek() {
        if(this.queue == null) {
            return null;
        }else{
            return this.queue.get(0);
        }
    }

    @Override
    public T poll() {
        if (this.queue == null)
            return null;
        T element = this.queue.get(0);
        this.queue.remove(0);
        return element;
    }

    @Override
    public boolean offer(T element) {
        return this.queue.add(element);
    }

    @Override
    public int size() {
        return this.queue.size();
    }
}