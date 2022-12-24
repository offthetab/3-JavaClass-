package ru.mirea.lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task6 {
    public static boolean is_correct(String s){
        Matcher m = Pattern.compile("[a-zA-Z0-9]+[a-zA-Z0-9!#$%&'*+\\-/=?^_`{|}~.]*@[a-zA-Z0-9\\-_.]+\\.[a-zA-Z]+").matcher(s);
        return m.find() && m.group().equals(s);
    }
    public static void main(String[] args){
        System.out.println(is_correct("user@example.com"));

        System.out.println(is_correct("myhost@@@com.ru"));
    }
}
