package ru.mirea.ikbo_01_19.practice1;

public class Ball {
    private String firm;
    private String color;

    public Ball(String f, String c){
        firm = f;
        color = c;
    }

    public String toString(){
        return (color + " ball by " + firm);
    }
}
