package ru.mirea.ikbo_01_19.practice10.ex2;

public class Client {
    public Chair chair;

    public Client(){}
    public void setChair(Chair chair){ this.chair = chair;}
    public void sit(){System.out.println("The client sat down on a " + this.chair);}
}
