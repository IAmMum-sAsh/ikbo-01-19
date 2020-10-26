package ru.mirea.ikbo_01_19.practice10.ex2;

public class VictorianChair implements Chair {
    private int age;

    public VictorianChair(int age){ this.age = age; }
    public void setAge(int age){ this.age = age; }
    public Integer getAge(){ return this.age; }

    @Override
    public String toString(){ return "Victorian chair (" + this.age + ")"; }
}
