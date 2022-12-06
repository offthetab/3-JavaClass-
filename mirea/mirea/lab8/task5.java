package ru.mirea.lab8;

import java.util.Scanner;

public class task5 {
    public static int recurtion(int n){
        int sum = n % 10;
        if(n / 10 == 0)
            return sum;
        sum += recurtion(n / 10);
        return sum;
    }
    public static void main(String[] args){
        System.out.print("Введите число для нахождения суммы его цифр ");
        Scanner input = new Scanner(System.in);
        System.out.println("Сумма цифр числа: " + recurtion(input.nextInt()));
    }
}
