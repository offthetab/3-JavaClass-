package ru.mirea.lab16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task2 extends JFrame{
    static JFrame frame;
    static JTextArea text;

    public static void main(String[] args){
        task2 listen = new task2(); // листенер

        frame = new JFrame("Text editor");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JMenuBar menuBar = new JMenuBar();

        menuBar.add(Font_botton()); // добавляем раздел с выбором шрифта
        menuBar.add(Color_botton()); // раздел с выбором цвета текста

        text = new JTextArea("");
        text.setFont(new Font("Monospaced", Font.PLAIN, 14));   // дефолтный шрифт
        text.setForeground(Color.BLACK);
        text.setLineWrap(true);
        JScrollPane sp = new JScrollPane(text);

        frame.setJMenuBar(menuBar);
        frame.add(sp);

        frame.setVisible(true);


    }
    private static JMenu Font_botton(){
        JMenu font = new JMenu("Font");

        JMenuItem it1 = new JMenuItem("Times New Roman");
        JMenuItem it2 = new JMenuItem("MS Sans Serif");
        JMenuItem it3 = new JMenuItem("Courier New");

        font.add(it1);
        font.add(it2);
        font.add(it3);

        it1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            }
        });
        it2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("MS Sans Serif", Font.PLAIN, 14));
            }
        });
        it3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("Courier New", Font.PLAIN, 14));
            }
        });
        return font;
    }

    private static JMenu Color_botton(){
        task2 listen2 = new task2();

        JMenu color = new JMenu("Color");

        JMenuItem it1 = new JMenuItem("Blue");
        JMenuItem it2 = new JMenuItem("Red");
        JMenuItem it3 = new JMenuItem("Black");

        color.add(it1);
        color.add(it2);
        color.add(it3);

        it1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.BLUE);
            }
        });
        it2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.RED);
            }
        });
        it3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.BLACK);
            }
        });
        return color;
    }

}
