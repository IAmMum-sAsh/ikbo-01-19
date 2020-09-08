package ru.mirea.ikbo_01_19.practice3.ex_45;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return ("Сircle with a radius of " + this.radius + ", and a center in (" + this.center.x + ";" + this.center.y + ")");
    }

    public void moveUp() {
        this.center.y += this.center.ySpeed;
    }

    public void moveDown() {
        this.center.y -= this.center.ySpeed;
    }

    public void moveLeft() {
        this.center.x -= this.center.xSpeed;
    }

    public void moveRight() {
        this.center.x += this.center.xSpeed;
    }
}
