package ru.mirea.ikbo_01_19.practice10.ex1;

public class Complex {
    private int real;
    private int image;

    public Complex(){}

    public Complex(Integer real, Integer image){
        this.real = real;
        this.image = image;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getReal() {
        return this.real;
    }

    public int getImage() {
        return this.image;
    }

    @Override
    public String toString() {
        return "Complex {x=" + this.real + ", y=" + this.image + "}";
    }
}
