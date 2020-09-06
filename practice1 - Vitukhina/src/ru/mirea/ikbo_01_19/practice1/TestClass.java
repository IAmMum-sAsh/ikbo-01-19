package ru.mirea.ikbo_01_19.practice1;

public class TestClass {
    public static void main(String[] args){
        Dog Sharik = new Dog("Гав");
        System.out.println(Sharik.toString());

        Book firstBook = new Book("Remark", "Three Comrades");
        System.out.println(firstBook.toString());

        Ball myBall = new Ball("Mikasa", "blue and yellow");
        System.out.print(myBall.toString());
    }
}