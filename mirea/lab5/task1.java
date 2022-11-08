package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;

public class task1 {
    public static void main(String[]  args){
        JFrame frame = new JFrame("AC Milan vs Real Madrid"){};
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(300, 300));

        JButton milan = new JButton("AC Milan");

        JButton madrid = new JButton("Real Madrid");

        int a = 0;



        JLabel result = new JLabel("Result 0X0");
        JLabel last_scorer = new JLabel("Last Scorer: ");
        JLabel winner = new JLabel("Winner: Draw");

        panel.add(milan);
        panel.add(madrid);
        panel.add(result);
        panel.add(last_scorer);
        panel.add(winner);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
