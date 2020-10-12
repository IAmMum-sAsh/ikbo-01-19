package ru.mirea.ikbo_01_19.practice8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<Object> implements IWaitList{
    protected ConcurrentLinkedQueue<java.lang.Object> content;

    public WaitList(){
        content = new ConcurrentLinkedQueue<java.lang.Object>();
    }

    public WaitList(Collection a){
        content = (ConcurrentLinkedQueue<java.lang.Object>)a;
    }

    @Override
    public void add(java.lang.Object el) {
        content.add(el);
    }

    @Override
    public java.lang.Object remove() {
        return content.remove();
    }

    @Override
    public boolean contains(java.lang.Object el) {
        return content.contains(el);
    }

    @Override
    public boolean containsAll(Collection arr) {
        return content.containsAll(arr);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }
}
