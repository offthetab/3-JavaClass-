package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Football_game {
    private int milan_score = 0;
    private int madrid_score = 0;

    public void My_window() {
        JFrame frame = new JFrame("AC Milan vs Real Madrid"); // создаем фрейм
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // закрытие фрейма
        frame.setSize(400, 400); // задаем размер фрейма

        JPanel panel = new JPanel();    // задаем панель
        panel.setBackground(Color.GRAY);    // цвет панели
        panel.setPreferredSize(new Dimension(400, 400));    // размер панели

        JLabel result = new JLabel("Result:" + milan_score + " X " + madrid_score); // вывод счета

        JLabel last_scorer = new JLabel("Last scorer: N/A"); // вывод последнего гола

        JLabel winner = new JLabel("Winner: DRAW"); // победитель


        JButton milan = new JButton("AC Milan");    // кнопка милана
        milan.addActionListener(new ActionListener() {  // обработка нажития кнопки милана
            @Override
            public void actionPerformed(ActionEvent e) {
                milan_score++;
                result.setText("Result:" + milan_score + " X " + madrid_score);
                last_scorer.setText("Last scorer: AC Milan");
                WhosTheWinner(winner);  // описан ниже
            }
        });

        JButton madrid = new JButton("Real Madrid");    // кнопка мадрида
        madrid.addActionListener(new ActionListener() {     // обработка нажития кнопки мадрида
            @Override
            public void actionPerformed(ActionEvent e) {
                madrid_score++;
                result.setText("Result:" + milan_score + " X " + madrid_score);
                last_scorer.setText("Last scorer: Real Madrid");
                WhosTheWinner(winner);  // описан ниже
            }
        });



        panel.add(milan);
        panel.add(madrid);
        panel.add(result);
        panel.add(last_scorer);
        panel.add(winner);

        frame.getContentPane().add(panel);  // добавляем панель к фрейму
        frame.pack();
        frame.setVisible(true);

    }
    private void WhosTheWinner(JLabel winner){      // метод для определения победителя и вывода на фрейм
        if(madrid_score == milan_score)
            winner.setText("Winner: DRAW");
        else if (madrid_score > milan_score)
            winner.setText("Winner: Real Madrid");
        else
            winner.setText("Winner: AC Milan");
    }


    public static void main(String[] args){
        Football_game game = new Football_game();
        game.My_window();
    }
}
