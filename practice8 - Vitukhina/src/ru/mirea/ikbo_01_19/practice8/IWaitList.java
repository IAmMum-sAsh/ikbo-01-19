package ru.mirea.ikbo_01_19.practice8;

import java.util.Collection;

public interface IWaitList<Object> {
    void add(Object el);
    Object remove();
    boolean contains(Object el);
    boolean containsAll(Collection<Object> arr);
    boolean isEmpty();
}
