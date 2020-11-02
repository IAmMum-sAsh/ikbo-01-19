package ru.mirea.ikbo_01_19.practice11;

public interface Queue<T> {
    T peek();
    T poll();
    T remove();
    boolean offer(T element);
    T element();
}