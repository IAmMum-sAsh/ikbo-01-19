package ru.mirea.ikbo_01_19.practice3.ex_123;

import static java.lang.Math.PI;

public class Circle extends Shape {
    protected double radius;

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        if (this.isFilled()){return (PI*radius*radius);}
        else {return 0;}
    }

    public double getPerimeter(){
        return (2*PI*radius);
    }

    public String toString(){
        return ("Сircle with a radius of " + this.getRadius() + ", an area of " + this.getArea() + ", and a perimeter of " + this.getPerimeter() + ".");
    }
}
