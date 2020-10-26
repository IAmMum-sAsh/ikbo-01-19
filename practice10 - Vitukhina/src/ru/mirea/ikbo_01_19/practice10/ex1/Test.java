package ru.mirea.ikbo_01_19.practice10.ex1;

public class Test {
    public static void main(String[] args) {
        Complex complex = new ConcreteFactory().createComplex(22, -13);
        System.out.print(complex);
    }
}
