package ru.mirea.lab16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class task1_1 {
    private static JFrame frame;
    private static JTextArea text;
    private static int number = new Random().nextInt(21);
    private static int tries_num = 3;

    public static void main(String[] args){
        frame = new JFrame("Guess the num");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);

        JLabel label = new JLabel("Guess the number from 0 to 20");
        label.setBounds(10, 10, 380, 40);
        label.setFont(new Font("Monospaced", Font.BOLD, 20));

        JButton play = new JButton("PLAY");
        play.setBackground(new Color(208,208,208));
        play.setBounds(150, 60, 100, 40);
        play.setFont(new Font("Monospaced", Font.BOLD, 24));

        play.addActionListener(new ActionListener() {   // удаляем кнопку "play" и начинаем игру
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(play);    // удаляем кнопку
                frame.revalidate();
                frame.repaint();
                start_game();   // начинаем игру
            }
        });




        frame.add(play);
        frame.add(label);


        frame.setVisible(true);

    }
    static void start_game(){


        JLabel tries = new JLabel("Tries left: " + tries_num);
        tries.setBounds(0, 60, 400, 40);
        tries.setHorizontalAlignment(JLabel.CENTER);
        tries.setFont(new Font("Monospaced", Font.BOLD, 20));


        JTextField text = new JTextField();
        text.setBackground(new Color(204 , 204, 204));
        text.setBounds(150, 110, 100, 40);
        text.setFont(new Font("Monospaced", Font.BOLD, 20));
        text.setHorizontalAlignment(JTextField.CENTER);
        text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tries_num == 1){
                    JOptionPane.showMessageDialog(null, "Вас не удалось угадать =(", "Alert", JOptionPane.INFORMATION_MESSAGE);

                    frame.remove(text);
                    frame.revalidate();
                    frame.repaint();

                    tries.setText("Вы проиграли!");
                    tries.setFont(new Font("Monospaced", Font.BOLD, 30));
                    tries.setForeground(Color.RED);

                    return;
                }

                String str = text.getText();
                if(str.matches("-?\\d+") == true) {    // явл чилом
                    int num = Integer.parseInt(str);
                    if (num >= 0 && num <= 20){
                        System.out.println(number);
                        if(num < number){
                            JOptionPane.showMessageDialog(null, "Число меньше!", "Alert", JOptionPane.INFORMATION_MESSAGE);
                            tries_num -= 1;
                            tries.setText("Tries left: " + tries_num);
                        }
                        else if (num > number){
                            JOptionPane.showMessageDialog(null, "Число больше!", "Alert", JOptionPane.INFORMATION_MESSAGE);
                            tries_num -= 1;
                            tries.setText("Tries left: " + tries_num);
                        }
                        else
                            JOptionPane.showMessageDialog(null, "Вы угадали число!", "Alert", JOptionPane.INFORMATION_MESSAGE);

                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Введите число от 0 до 20!", "Alert", JOptionPane.ERROR_MESSAGE);

                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "Введите число!", "Alert", JOptionPane.ERROR_MESSAGE);

                }

            }
        });


        JButton insert = new JButton("Insert");

        frame.add(tries);
        frame.add(text);
    }

}
