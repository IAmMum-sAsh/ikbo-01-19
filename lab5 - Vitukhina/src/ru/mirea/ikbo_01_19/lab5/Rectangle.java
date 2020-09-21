package ru.mirea.ikbo_01_19.lab5;

public class Rectangle extends Shape {
    protected int width;
    protected int height;

    public int getWidth(){ return this.width; }
    public int getHeight(){ return this.height; }

    Rectangle(int w, int h){
        super(w, h);
        this.width = (int) (Math.random() * 200);
        this.height = (int) (Math.random() * 200);
    }


}