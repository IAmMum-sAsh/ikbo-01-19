package ru.mirea.ikbo_01_19.practice3.ex_45;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public String toString() {
        return ("Rectangle from (" + this.topLeft.x + ";" + this.topLeft.y + ") to (" + this.bottomRight.x + ";" + this.bottomRight.y + ")");
    }

    private boolean isXSpeedSame(){
        if (this.topLeft.xSpeed == this.bottomRight.xSpeed){return true;}
        else {return false;}
    }

    private boolean isYSpeedSame(){
        if (this.topLeft.ySpeed == this.bottomRight.ySpeed){return true;}
        else {return false;}
    }

    public void moveUp() {
        if (this.isYSpeedSame()){
            this.topLeft.y += this.topLeft.ySpeed;
            this.bottomRight.y += this.bottomRight.ySpeed;
        }
    }

    public void moveDown() {
        if (this.isYSpeedSame()){
            this.topLeft.y -= this.topLeft.ySpeed;
            this.bottomRight.y -= this.bottomRight.ySpeed;
        }
    }

    public void moveLeft() {
        if (this.isXSpeedSame()){
            this.topLeft.x -= this.topLeft.xSpeed;
            this.bottomRight.x -= this.bottomRight.xSpeed;
        }
    }

    public void moveRight() {
        if (this.isXSpeedSame()){
            this.topLeft.x += this.topLeft.xSpeed;
            this.bottomRight.x += this.bottomRight.xSpeed;
        }
    }
}
