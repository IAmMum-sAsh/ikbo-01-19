package ru.mirea.ikbo_01_19.practice3.ex_45;

public class TestClass {
    public static void main(String[] args){
        MovablePoint point = new MovablePoint(1,1,2,3);
        System.out.println(point);
        point.moveDown();
        System.out.println(point);
        point.moveRight();
        System.out.println(point);

        MovableCircle circle = new MovableCircle(-5,11,1,1,4);
        System.out.println(circle);
        circle.moveLeft();
        System.out.println(circle);
        circle.moveUp();
        System.out.println(circle);

        MovableRectangle rectangle = new MovableRectangle(-2, 5,4,3,3,3);
        System.out.println(rectangle);
        rectangle.moveLeft();
        System.out.println(rectangle);
        rectangle.moveDown();
        System.out.println(rectangle);
    }
}
