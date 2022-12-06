package ru.mirea.lab13;

import java.util.Scanner;

public class task1 {
    public static void method(String str){
        System.out.print("Последний символ: ");
        System.out.println(str.charAt(str.length()-1));

        System.out.print("Заканчивается ли строка подстрокой '!!!': ");
        System.out.println(str.endsWith("!!!"));

        System.out.print("Начинается ли строка подстрокой 'I like': ");
        System.out.println(str.startsWith("I like"));

        System.out.print("Содержит ли строка подстроку 'Java': ");
        System.out.println(str.contains("Java"));

        System.out.print("Заменяем все 'a' на 'o': ");
        System.out.println(str.replaceAll("a", "o"));

        System.out.print("Преобразуем к верхнему регистру: ");
        System.out.println(str.toUpperCase());

        System.out.print("Преобразуем к нижнему регистру: ");
        System.out.println(str.toLowerCase());

        System.out.println("Вырезаем строку 'Java': ");
        boolean par = true;
        while (par){
            if(str.contains("Java"))
                str = str.substring(0, str.indexOf("Java")) + str.substring(str.indexOf("Java") + 4);
            else
                par = false;
        }
        System.out.println(str);
    }
    public static void main(String[] args){
        System.out.println("Введите строку");
        Scanner input = new Scanner(System.in);
        method(input.nextLine());
    }
}
