package ru.mirea.ikbo_01_19.practice2_2;

public class TestBall {
    public static void main(String[] args){
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.move(72, -11.1);
        System.out.println(b1);
    }
}
