package ru.mirea.ikbo_01_19.practice3.ex_123;

public class Square extends Rectangle {
    public Square() {}

    public Square(double side){
        this.length = side;
        this.width = side;
    }

    public Square(double side, String color, boolean field){
        this.length = side;
        this.width = side;
        this.color = color;
        this.filled = field;
    }

    public void setSide(double side){
        this.length = side;
        this.width = side;
    }

    public double getSide(){
        return this.length;
    }

    public void setLength(double side){
        this.length = side;
    }

    public void setWidth(double side){
        this.width = side;
    }

    public String toString() {
        return "Square with side " + this.length + ", an area of " + this.getArea() + ", and a perimeter of " + this.getPerimeter() + ".";
    }
}
