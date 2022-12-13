package ru.mirea.lab4.__4_1__.task2;

import java.util.Scanner;

public class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight){
        this(number, model);
        this.weight = weight;
    }
    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone(){

    }


    public String receiveCall(String name){
        return "Звонит {" + name + "}";
    }
    public String receiveCall(String name, String number){
        return "Звонит {" + name + ", " + number + "}";
    }

    public String getNumber(){
        return number;
    }

    public void sendMessage(String ... arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Номера, на которые отправить сообщение");
        for(int i = 0; i < arg.length; i++){
            System.out.println("Message sent to: " + arg[i]);
        }
    }

    @Override
    public String toString(){
        return "{Number: " + number + ", model: " + model + ", weight: " + weight + "}";
    }

}
