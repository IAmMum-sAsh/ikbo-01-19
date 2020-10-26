package ru.mirea.ikbo_01_19.practice10.ex2;

public class FunctionalChair implements Chair {
    public int sum(int a, int b){ return a + b; }

    @Override
    public String toString(){ return "Functional chair"; }
}
