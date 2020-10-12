package ru.mirea.ikbo_01_19.practice8;

public class Test {

    public static void main(String[] args){
        WaitList a = new WaitList();
        a.add("111");
        a.add(123434);
        a.add(true);
        a.add('q');
        System.out.println(a);

        BoundedWaitList b = new BoundedWaitList(5);
        b.add("111");
        b.add(123434);
        b.add(true);
        b.add('q');
        b.add(12);
        b.add(55);
        System.out.println(b);

        UnfairWaitList c = new UnfairWaitList();
        c.add("111");
        c.add(123434);
        c.add(true);
        c.add('q');
        c.add(12);
        c.add(55);
        System.out.println(c);
        c.remove(true);
        System.out.println(c);
        c.moveToBack(123434);
        System.out.println(c);
    }

}
