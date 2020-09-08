package ru.mirea.ikbo_01_19.practice3.ex_123;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){}

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    public double getArea(){
        if (this.isFilled()){return (width*length);}
        else {return 0;}
    }

    public double getPerimeter(){
        return (2*(width+length));
    }

    public String toString(){
        return ("Rectangle of " + this.getWidth() + "x" + this.getLength() + ", an area of " + this.getArea() + ", and a perimeter of " + this.getPerimeter() + ".");
    }
}