package ru.mirea.lab2.task2;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Введите кол-во компьютеров");
        int n = input.nextInt();
        Shop shop = new Shop(n);

        shop.add_comp();
        shop.delete_comp();
        shop.find_comp();


    }
}
