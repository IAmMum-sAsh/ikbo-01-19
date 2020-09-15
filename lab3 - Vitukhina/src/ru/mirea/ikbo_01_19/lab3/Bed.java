package ru.mirea.ikbo_01_19.lab3;

public class Bed extends Furniture {
    protected boolean bunkBed;
    protected int box;

    public Bed(int width, int length, int height, String material, String color, int price, boolean bunkBed, int box) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.material = material;
        this.color = color;
        this.price = price;
        this.bunkBed = bunkBed;
        this.box = box;
    }

    public void setBunkBed(boolean bunkBed) {
        this.bunkBed = bunkBed;
    }

    public void setBox(int box) {
        this.box = box;
    }

    public boolean isBunkBed() {
        return bunkBed;
    }

    public int getBox() {
        return box;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "Width=" + width +
                ", length=" + length +
                ", height=" + height +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", bunkBed=" + bunkBed +
                ", box=" + box +
                '}';
    }
}
