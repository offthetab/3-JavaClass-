package ru.mirea.lab14;

import java.util.regex.Pattern;

public class task4 {
    public static boolean func(String str){
        Pattern p = Pattern.compile("\\d+\\s*\\+");
        boolean result = p.matcher(str).find();
        return result;
    }
    public static void main(String[] args){
        System.out.println(func("(1 + 8) - 9 / 4"));
        System.out.println(func("6 / 5 - 2 * 9"));

    }
}
