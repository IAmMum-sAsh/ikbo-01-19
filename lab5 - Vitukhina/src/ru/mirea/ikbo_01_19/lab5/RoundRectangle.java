package ru.mirea.ikbo_01_19.lab5;

public class RoundRectangle extends Shape {
    protected int width;
    protected int height;

    protected int arcWidth;
    protected int arcHeight;

    public int getWidth(){ return this.width; }
    public int getHeight(){ return this.height; }

    public int getArcWidth(){ return this.arcWidth; }
    public int getArcHeight(){ return this.arcHeight; }

    RoundRectangle(int w, int h){
        super(w, h);
        this.width = (int) (Math.random() * 200);
        this.height = (int) (Math.random() * 200);
        this.arcWidth = (int) (Math.random() * this.width / 3);
        this.arcHeight = (int) (Math.random() * this.height / 3);
    }
}