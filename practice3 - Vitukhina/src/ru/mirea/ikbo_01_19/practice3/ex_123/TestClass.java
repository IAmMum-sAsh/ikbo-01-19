package ru.mirea.ikbo_01_19.practice3.ex_123;

public class TestClass {
    public static void main(String[] args){
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);                 // Коротый? Переопределено
        System.out.println(s1.getArea());       // Коротый? Переопределено
        System.out.println(s1.getPerimeter());  // Коротый? Переопределено
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius());   // Нет в классе Shape
        System.out.println();

        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        System.out.println();

        //Shape s2 = new Shape();               //Абстрактный, нельзя создать объект класса

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength());   // Нет в классе Shape
        System.out.println();

        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        System.out.println();

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide());     // Нет в классе Shape
        System.out.println();

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide());     // Нет в классе Rectangle
        System.out.println(r2.getLength());
        System.out.println();

        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
