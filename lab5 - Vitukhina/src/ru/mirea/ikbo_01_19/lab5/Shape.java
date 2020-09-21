package ru.mirea.ikbo_01_19.lab5;

public abstract class Shape {
    protected int x;
    protected int y;

    protected int r;
    protected int g;
    protected int b;

    public int getX() { return this.x; }
    public int getY() { return this.y; }

    public int getR() { return this.r; }
    public int getG() { return this.g; }
    public int getB() { return this.b; }

    public Shape(int w, int h) {
        this.x = (int) (Math.random() * w);
        this.y = (int) (Math.random() * h);
        this.r = (int) (Math.random() * 255);
        this.g = (int) (Math.random() * 255);
        this.b = (int) (Math.random() * 255);
    }
}