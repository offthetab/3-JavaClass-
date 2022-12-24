package ru.mirea.lab15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class task4 extends JFrame implements ActionListener {
    static JFrame frame;
    static TextField text;
    static String x1 = "", operation = "", x2 = "";

    public static void main(String[] args){
        task4 listen = new task4();

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        text = new TextField(16);
        text.setEditable(false);


        JPanel buttons = new JPanel();  // панель со всеми кнопками

        String[] old_btns = new String[]{"7", "8", "9", "/", "4", "5", "6", "*",
                "1", "2", "3", "-", "0", ".", "=", "+"};

        ArrayList<JButton> new_btns = new ArrayList<>();    // сами все кнопки
        for (int i = 0; i < 16; i++){
            JButton temp = new JButton(old_btns[i]);
            temp.addActionListener(listen);
            buttons.add(temp);
        }

        buttons.setLayout(new GridLayout(4,4));    // таблица из кнопок

        JPanel mainpanel = new JPanel();    // основная панель с текстом и кнопками
        mainpanel.setLayout(new BorderLayout());

        mainpanel.add(text, BorderLayout.NORTH);
        mainpanel.add(buttons, BorderLayout.CENTER);


        frame.setSize(300, 180);
        frame.add(mainpanel);


        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){

        String s = e.getActionCommand();

        // if the value is a number
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            // if operand is present then add to second no
            if (!operation.equals(""))
                x2 = x2 + s;
            else
                x1 = x1 + s;

            // set the value of text
            text.setText(x1 + operation + x2);
        }
        else if (s.charAt(0) == '=') {

            double te;

            // store the value in 1st
            if (operation.equals("+"))
                te = (Double.parseDouble(x1) + Double.parseDouble(x2));
            else if (operation.equals("-"))
                te = (Double.parseDouble(x1) - Double.parseDouble(x2));
            else if (operation.equals("/"))
                te = (Double.parseDouble(x1) / Double.parseDouble(x2));
            else
                te = (Double.parseDouble(x1) * Double.parseDouble(x2));

            // set the value of text
            text.setText(x1 + operation + x2 + "=" + te);

            // convert it to string
            x1 = Double.toString(te);

            operation = x2 = "";
        }
        else {
            // if there was no operand
            if (operation.equals("") || x2.equals(""))
                operation = s;
                // else evaluate
            else {
                double te;

                // store the value in 1st
                if (operation.equals("+"))
                    te = (Double.parseDouble(x1) + Double.parseDouble(x2));
                else if (operation.equals("-"))
                    te = (Double.parseDouble(x1) - Double.parseDouble(x2));
                else if (operation.equals("/"))
                    te = (Double.parseDouble(x1) / Double.parseDouble(x2));
                else
                    te = (Double.parseDouble(x1) * Double.parseDouble(x2));

                // convert it to string
                x1 = Double.toString(te);

                // place the operator
                operation = s;

                x2 = "";
            }

            // set the value of text
            text.setText(x1 + operation + x2);
        }
    }
}





