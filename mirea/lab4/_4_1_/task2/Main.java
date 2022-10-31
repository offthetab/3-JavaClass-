package ru.mirea.lab4._4_1_.task2;

public class Main {
    public static void main(String[] args){
        Phone phone1 = new Phone("8-903-363-44-05", "iphone5", 0.112);
        Phone phone2 = new Phone("8-966-505-21-07", "iphoneX", 0.174);
        Phone phone3 = new Phone("8-911-112-33-34", "iphoneXR", 0.194);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        System.out.println(phone1.receiveCall("Paul"));
        System.out.println(phone2.receiveCall("Alex"));
        System.out.println(phone3.receiveCall("Mike"));

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        System.out.println(phone1.receiveCall("Paul", "8-966-505-21-07"));
        System.out.println(phone2.receiveCall("Alex", "8-911-112-33-34"));
        System.out.println(phone3.receiveCall("Mike", "8-903-363-44-05"));

        phone1.sendMessage("8-966-505-21-07", "8-903-363-44-05", "1-101-304-23-54");
    }
}
