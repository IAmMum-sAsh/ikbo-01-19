package ru.mirea.ikbo_01_19.lab3;

public class Chair extends Furniture{
    protected int castors;
    protected boolean withHandles;

    public Chair(int width, int length, int height, String material, String color, int price, int castors, boolean withHandles) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.material = material;
        this.color = color;
        this.price = price;
        this.castors = castors;
        this.withHandles = withHandles;
    }

    public void setCastors(int castors) {
        this.castors = castors;
    }

    public void setWithHandles(boolean withHandles) {
        this.withHandles = withHandles;
    }

    public int getCastors() {
        return castors;
    }

    public boolean isWithHandles() {
        return withHandles;
    }

    public String toString() {
        return "Chair{" +
                "Width=" + width +
                ", length=" + length +
                ", height=" + height +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", castors=" + castors +
                ", withHandles=" + withHandles +
                ", price=" + price +
                '}';
    }
}
