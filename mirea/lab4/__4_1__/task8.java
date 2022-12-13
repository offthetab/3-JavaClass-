package ru.mirea.lab4.__4_1__;

public class task8 {
    public static void main(String[] args){
        Circle circle = new Circle(3);
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle(2, 5, "Blue" , true);
        System.out.println(rectangle.toString());

        Square square = new Square(2, "Yellow" , true);
        System.out.println(square.toString());
    }
}

abstract class Shape{
    private String color;
    private boolean filled;

    public Shape(){

    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
class Circle extends Shape{
    private double radius;

    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimeter(){
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString(){
        return "Shape - circle, " + "radius - " + radius + ", color - " +
                getColor() + ", filled - " + isFilled() + "\n" + "Area - "
                + getArea() + ", Perimeter - " + getPerimeter() + "\n";
    }
}
class Rectangle extends Shape{
    double width;
    double length;
    public Rectangle(){

    }
    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public String toString(){
        return "Shape - rectangle, " + "width - " + width + ", length - " + length +
                ", color - " + getColor() + ", filled - " + isFilled() + "\n" +
                "Area - " + getArea() + ", perimeter - " + getPerimeter() + "\n";
    }
}
class Square extends Rectangle{
    public Square(){

    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return width;
    }
    public void setSide(double side){
        length = side;
        width = side;
    }

    @Override
    public void setWidth(double side){
        width = side;
    }
    @Override
    public void setLength(double side){
        length = side;
    }
    @Override
    public String toString(){
        return "Shape - square, " + "side - " + getSide() + ", color - " +
                getColor() + ", filled - " + isFilled() + "\n" +
                "Area - " + getArea() + ", perimeter - " + getPerimeter() + "\n";
    }
}
