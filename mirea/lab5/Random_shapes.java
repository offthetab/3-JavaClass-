package ru.mirea.lab5;


import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Random_shapes {
    public static void main(String[] args){
        JFrame frame = new JFrame("DrawTest");
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(){

            @Override
            public void paintComponent(Graphics g){
                setBounds(50, 50, 800, 800);
                Graphics2D gr = (Graphics2D)g;
                Random rand = new Random();
                for (int i = 0; i < 20; i++) {

                    gr.setColor(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
                    switch (rand.nextInt(2)) {
                        case 0:
                            Rectangle r = new Rectangle();
                            gr.setColor(r.getColor());
                            gr.fillRect(r.getX(), r.getY(), r.getHigh(), r.getWidth());
                            break;
                        case 1:
                            Circle c = new Circle();
                            gr.setColor(c.getColor());
                            gr.fillOval(c.getX(), c.getY(), c.getR(), c.getR());
                            break;
                    }

                }
            }
        }; // changed this line
        frame.add(panel);

        frame.add(panel);

        frame.setVisible(true);

    }
}


abstract class Shapes{
    private Color color;
    private int x;
    private int y;
    protected Random rand = new Random();
    public Shapes(){
        this.color = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
        this.x = rand.nextInt(600);
        this.y = rand.nextInt(600);

    }

    public Color getColor() {
        return color;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
class Rectangle extends Shapes{
    private int high;
    private int width;

    public Rectangle(){
        super();
        this.high = rand.nextInt(50, 200);
        this.width = rand.nextInt(50, 200);
    }

    public int getHigh() {
        return high;
    }
    public int getWidth() {
        return width;
    }
}
class Circle extends Shapes{
    private int r;
    public Circle(){
        super();
        this.r = rand.nextInt(50, 200);
    }
    public int getR() {
        return r;
    }
}