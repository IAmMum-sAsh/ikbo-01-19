package ru.mirea.ikbo_01_19.practice8;

public class UnfairWaitList<Object> extends WaitList{

    public UnfairWaitList(){}

    public void remove(Object el){
        content.remove(el);
    }

    public void moveToBack(Object el){
        content.remove(el);
        content.add(el);
    }
}
