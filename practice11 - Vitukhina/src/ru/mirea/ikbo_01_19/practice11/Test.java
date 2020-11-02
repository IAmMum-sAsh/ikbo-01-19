package ru.mirea.ikbo_01_19.practice11;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(13, 65, 72, 22, 56));
        linkedQueue.addAll(arrayList);
        linkedQueue.offer(2);
        linkedQueue.offer(-88);
        linkedQueue.offer(0);
        System.out.println("Linked Queue");
        System.out.println(linkedQueue);
        System.out.println("Size: " + linkedQueue.size());
        System.out.println("Peek: " + linkedQueue.peek());
        System.out.println(linkedQueue);
        System.out.println("Poll: " + linkedQueue.poll());
        System.out.println(linkedQueue + "\n\n");

        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        arrayQueue.add(97);
        arrayQueue.add(60);
        arrayQueue.add(-18);
        arrayQueue.add(-69);
        arrayQueue.add(-37);
        arrayQueue.add(25);
        System.out.println("Array Queue");
        System.out.println(arrayQueue);
        System.out.println("Peek: " + arrayQueue.peek());
        System.out.println(arrayQueue);
        System.out.println("Poll: " + arrayQueue.poll());
        System.out.println(arrayQueue);
        System.out.println("First: " + arrayQueue.element());
        System.out.println(arrayQueue);
    }
}
