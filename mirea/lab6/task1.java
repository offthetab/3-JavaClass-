package ru.mirea.lab6;

public class task1 {
    public static void main(String[] args){

    }
}
interface Movable{
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}
class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {

    }
    @Override
    public void moveDown() {

    }
    @Override
    public void moveLeft() {

    }
    @Override
    public void moveRight() {

    }
    @Override
    public String toString() {
        return "";
    }
}
class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center.x = x;
        center.y = y;
        center.xSpeed = xSpeed;
        center.ySpeed = ySpeed;
        this.radius = radius;

    }
    @Override
    public void moveUp() {

    }
    @Override
    public void moveDown() {

    }
    @Override
    public void moveLeft() {

    }
    @Override
    public void moveRight() {

    }
    public String toString() {
        return " ";
    }
}
